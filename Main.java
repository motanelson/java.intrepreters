
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import java.util.regex.*;
import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) throws Exception {

         if (args.length == 0) {
            System.out.println("Uso: java  <ficheiro.cs>");
            return;
        }
         String code ="";
        try{
            code = new String(Files.readAllBytes(Paths.get(args[0])));
        }catch (Exception e) {
              System.out.println("error\n");
        }
        CharStream input = CharStreams.fromString(code);

        BasicLexer lexer = new BasicLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BasicParser parser = new BasicParser(tokens);

        ParseTree tree = parser.program();

        BasicInterpreter interpreter = new BasicInterpreter();
        interpreter.visit(tree);
    }
}