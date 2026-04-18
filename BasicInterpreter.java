import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.HashMap;
import java.util.Map;

public class BasicInterpreter extends BasicBaseVisitor<Object> {

    private Map<String, Object> memory = new HashMap<>();

    // ==========================
    // PROGRAM
    // ==========================

    @Override
    public Object visitProgram(BasicParser.ProgramContext ctx) {
        for (BasicParser.LineContext line : ctx.line()) {
            visit(line);
        }
        return null;
    }

    @Override
    public Object visitLine(BasicParser.LineContext ctx) {
        if (ctx.statement() != null) {
            visit(ctx.statement());
        }
        return null;
    }

    // ==========================
    // PRINT (BUILT-IN)
    // ==========================

    @Override
    public Object visitPrintStatement(BasicParser.PrintStatementContext ctx) {
        for (int i = 0; i < ctx.expression().size(); i++) {
            Object value = visit(ctx.expression(i));
            System.out.print(value);

            if (i < ctx.expression().size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        return null;
    }

    // ==========================
    // VARIABLES
    // ==========================

    @Override
    public Object visitAssignment(BasicParser.AssignmentContext ctx) {
        String varName = ctx.Identifier().getText();
        Object value = visit(ctx.expression());
        memory.put(varName, value);
        return null;
    }

    @Override
    public Object visitVariableDeclaration(BasicParser.VariableDeclarationContext ctx) {
        String varName = ctx.Identifier().getText();

        Object value = null;
        if (ctx.expression() != null) {
            value = visit(ctx.expression(0));
        }

        memory.put(varName, value);
        return null;
    }

    // ==========================
    // EXPRESSIONS
    // ==========================

    @Override
    public Object visitPrimaryExpression(BasicParser.PrimaryExpressionContext ctx) {

        if (ctx.IntegerLiteral() != null) {
            return Integer.parseInt(ctx.IntegerLiteral().getText());
        }

        if (ctx.FloatingLiteral() != null) {
            return Double.parseDouble(ctx.FloatingLiteral().getText());
        }

        if (ctx.StringLiteral() != null) {
            String text = ctx.StringLiteral().getText();
            return text.substring(1, text.length() - 1);
        }

        if (ctx.Identifier() != null) {
            String name = ctx.Identifier().getText();
            if (!memory.containsKey(name)) {
                throw new RuntimeException("Variável não definida: " + name);
            }
            return memory.get(name);
        }

        if (ctx.expression() != null) {
            return visit(ctx.expression());
        }

        return null;
    }

    @Override
    public Object visitAdditiveExpression(BasicParser.AdditiveExpressionContext ctx) {
        Object result = visit(ctx.multiplicativeExpression(0));

        for (int i = 1; i < ctx.multiplicativeExpression().size(); i++) {
            Object right = visit(ctx.multiplicativeExpression(i));
            String op = ctx.getChild(2 * i - 1).getText();

            result = applyBinary(result, right, op);
        }

        return result;
    }

    @Override
    public Object visitMultiplicativeExpression(BasicParser.MultiplicativeExpressionContext ctx) {
        Object result = visit(ctx.unaryExpression(0));

        for (int i = 1; i < ctx.unaryExpression().size(); i++) {
            Object right = visit(ctx.unaryExpression(i));
            String op = ctx.getChild(2 * i - 1).getText();

            result = applyBinary(result, right, op);
        }

        return result;
    }

    // ==========================
    // HELPERS
    // ==========================

    private Object applyBinary(Object left, Object right, String op) {

        // String concat
        if (left instanceof String || right instanceof String) {
            if (op.equals("+")) {
                return String.valueOf(left) + String.valueOf(right);
            }
            throw new RuntimeException("Operação inválida para strings: " + op);
        }

        double l = ((Number) left).doubleValue();
        double r = ((Number) right).doubleValue();

        switch (op) {
            case "+": return l + r;
            case "-": return l - r;
            case "*": return l * r;
            case "/": return l / r;
        }

        throw new RuntimeException("Operador desconhecido: " + op);
    }
}