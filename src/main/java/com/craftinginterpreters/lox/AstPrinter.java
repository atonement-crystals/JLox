package com.craftinginterpreters.lox;

/**
 * AstPrinter is included only as it was a part of the Crafting Interpreters
 * tutorial. Methods marked as unimplemented are included with a minimum
 * implementation only to enable the project to compile per the {@code
 * Expr.Visitor} interface.<br/>
 * <br/>
 * This class is not used or referenced anywhere across the project code.
 */
public class AstPrinter implements Expr.Visitor<String> {
    String print(Expr expr) {
        return expr.accept(this);
    }

    @Override
    public String visitAssignExpr(Expr.Assign expr) {
        // Unimplemented.
        return null;
    }

    @Override
    public String visitBinaryExpr(Expr.Binary expr) {
        return parenthesize(expr.operator.lexeme,
                            expr.left, expr.right);
    }

    @Override
    public String visitCallExpr(Expr.Call expr) {
        // Unimplemented.
        return null;
    }

    @Override
    public String visitGetExpr(Expr.Get expr) {
        // Unimplemented.
        return null;
    }

    @Override
    public String visitGroupingExpr(Expr.Grouping expr) {
        return parenthesize("group", expr.expression);
    }

    @Override
    public String visitLiteralExpr(Expr.Literal expr) {
        if (expr.value == null) return "nil";
        return expr.value.toString();
    }

    @Override
    public String visitLogicalExpr(Expr.Logical expr) {
        // Unimplemented.
        return null;
    }

    @Override
    public String visitSetExpr(Expr.Set expr) {
        // Unimplemented.
        return null;
    }

    @Override
    public String visitSuperExpr(Expr.Super expr) {
        // Unimplemented.
        return null;
    }

    @Override
    public String visitThisExpr(Expr.This expr) {
        // Unimplemented.
        return null;
    }

    @Override
    public String visitUnaryExpr(Expr.Unary expr) {
        return parenthesize(expr.operator.lexeme, expr.right);
    }

    @Override
    public String visitVariableExpr(Expr.Variable expr) {
        // Not implemented.
        return  null;
    }

    private String parenthesize(String name, Expr... exprs) {
        StringBuilder builder = new StringBuilder();

        builder.append("(").append(name);
        for (Expr expr : exprs) {
            builder.append(" ");
            builder.append(expr.accept(this));
        }
        builder.append(")");

        return builder.toString();
    }

    /**
     * Example use of the AstPrinter for supported types.
     * @param args Unused.
     */
    public static void main(String[] args) {
        Expr expression = new Expr.Binary(
                new Expr.Unary(
                        new Token(TokenType.MINUS, "-", null, 1),
                        new Expr.Literal(123)),
                new Token(TokenType.STAR, "*", null, 1),
                new Expr.Grouping(
                        new Expr.Literal(45.67)));

        System.out.println(new AstPrinter().print(expression));
    }
}
