package src;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.gui.Trees;
import src.gen.gLexer;
import src.gen.gParser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Parser {
    public static final String INPUT_CSV = "src/main/sample_code";
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(INPUT_CSV);
        gLexer lexer; //Always replace gParse & lexer when new antlr generation happens.
        lexer = new gLexer(new ANTLRInputStream(fileInputStream));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gParser parser = new gParser(tokens);
        // invoke the entry point of our grammar
        ParserRuleContext ruleContext = parser.program();
        Trees.inspect(ruleContext, parser);


    }
}
