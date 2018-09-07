package src.gen;// Generated from C:/Users/User/Desktop/Semester_7/CompilerDesign/Compiler/src/main\g.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(gParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_list(gParser.Declaration_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declaration_list_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_list_(gParser.Declaration_list_Context ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(gParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declaration(gParser.Var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#type_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_specifier(gParser.Type_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#fun_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_declaration(gParser.Fun_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(gParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list(gParser.Param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#param_list_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list_(gParser.Param_list_Context ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(gParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(gParser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#local_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_declarations(gParser.Local_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#local_declarations_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_declarations_(gParser.Local_declarations_Context ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list(gParser.Statement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#statement_list_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list_(gParser.Statement_list_Context ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(gParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expression_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_stmt(gParser.Expression_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#selection_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection_stmt(gParser.Selection_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#iteration_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_stmt(gParser.Iteration_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(gParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(gParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(gParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expression(gParser.Simple_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(gParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expression(gParser.Additive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#additive_expression_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expression_(gParser.Additive_expression_Context ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#addop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddop(gParser.AddopContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(gParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#term_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_(gParser.Term_Context ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#mulop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulop(gParser.MulopContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(gParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(gParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(gParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_list(gParser.Arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#arg_list_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_list_(gParser.Arg_list_Context ctx);
}