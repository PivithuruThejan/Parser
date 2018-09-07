package src.gen;// Generated from C:/Users/User/Desktop/Semester_7/CompilerDesign/Compiler/src/main\g.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_list(gParser.Declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_list(gParser.Declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#declaration_list_}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_list_(gParser.Declaration_list_Context ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declaration_list_}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_list_(gParser.Declaration_list_Context ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(gParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(gParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaration(gParser.Var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaration(gParser.Var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier(gParser.Type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier(gParser.Type_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#fun_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFun_declaration(gParser.Fun_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#fun_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFun_declaration(gParser.Fun_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(gParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(gParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(gParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(gParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#param_list_}.
	 * @param ctx the parse tree
	 */
	void enterParam_list_(gParser.Param_list_Context ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#param_list_}.
	 * @param ctx the parse tree
	 */
	void exitParam_list_(gParser.Param_list_Context ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(gParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(gParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(gParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(gParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#local_declarations}.
	 * @param ctx the parse tree
	 */
	void enterLocal_declarations(gParser.Local_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#local_declarations}.
	 * @param ctx the parse tree
	 */
	void exitLocal_declarations(gParser.Local_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#local_declarations_}.
	 * @param ctx the parse tree
	 */
	void enterLocal_declarations_(gParser.Local_declarations_Context ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#local_declarations_}.
	 * @param ctx the parse tree
	 */
	void exitLocal_declarations_(gParser.Local_declarations_Context ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(gParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(gParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#statement_list_}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list_(gParser.Statement_list_Context ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#statement_list_}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list_(gParser.Statement_list_Context ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(gParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(gParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expression_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpression_stmt(gParser.Expression_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expression_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpression_stmt(gParser.Expression_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#selection_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelection_stmt(gParser.Selection_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#selection_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelection_stmt(gParser.Selection_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#iteration_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIteration_stmt(gParser.Iteration_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#iteration_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIteration_stmt(gParser.Iteration_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(gParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(gParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(gParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(gParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(gParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(gParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expression(gParser.Simple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expression(gParser.Simple_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(gParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(gParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(gParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(gParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#additive_expression_}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression_(gParser.Additive_expression_Context ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#additive_expression_}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression_(gParser.Additive_expression_Context ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(gParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(gParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(gParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(gParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#term_}.
	 * @param ctx the parse tree
	 */
	void enterTerm_(gParser.Term_Context ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#term_}.
	 * @param ctx the parse tree
	 */
	void exitTerm_(gParser.Term_Context ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(gParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(gParser.MulopContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(gParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(gParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(gParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(gParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(gParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(gParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArg_list(gParser.Arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArg_list(gParser.Arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#arg_list_}.
	 * @param ctx the parse tree
	 */
	void enterArg_list_(gParser.Arg_list_Context ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#arg_list_}.
	 * @param ctx the parse tree
	 */
	void exitArg_list_(gParser.Arg_list_Context ctx);
}