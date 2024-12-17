import java.util.HashMap;


public class MyVisitor extends ProjectBaseVisitor<String> {
    private HashMap<String, String> memory = new HashMap<>();
    private HashMap<String, ProjectParser.StatementsContext> function = new HashMap<>();
    private String result="";

    public String getResult() {
        return result;
    }

    @Override
    public String visitProgram(ProjectParser.ProgramContext ctx) {
        visit(ctx.function_definitions());
        visit((ctx.statements()));
        return "";
    }

    @Override
    public String visitFunction_definitions(ProjectParser.Function_definitionsContext ctx) {
        for (ProjectParser.Function_definitionContext temp : ctx.function_definition()) {
            visit(temp);
        }
        return "";
    }

    @Override
    public String visitFunction_definition(ProjectParser.Function_definitionContext ctx) {
        function.put(visit(ctx.identifier()), ctx.statements());
        return "";
    }

    @Override
    public String visitStatements(ProjectParser.StatementsContext ctx) {
        for (ProjectParser.StatementContext temp : ctx.statement()) {
            visit(temp);
        }
        return "";
    }

    @Override
    public String visitAssignment(ProjectParser.AssignmentContext ctx) {
        memory.put(visit(ctx.identifier()), visit(ctx.expr()));
        return "";
    }

    @Override
    public String visitBeginend(ProjectParser.BeginendContext ctx) {
        visit(ctx.statements());
        return "";
    }

    @Override
    public String visitIf(ProjectParser.IfContext ctx) {
        boolean o = visit(ctx.expr()).equals("true") ? true : false;
        if (o)
            visit(ctx.statement());
        return "";
    }

    @Override
    public String visitIfelse(ProjectParser.IfelseContext ctx) {
        boolean o = visit(ctx.expr()).equals("true") ? true : false;
        if (o)
            visit(ctx.statement(0));
        else
            visit(ctx.statement(1));
        return "";
    }

    @Override
    public String visitWhile(ProjectParser.WhileContext ctx) {
        while (visit(ctx.expr()).equals("true") ? true : false) {
            visit(ctx.statement());
        }
        return "";
    }

    @Override
    public String visitFor(ProjectParser.ForContext ctx) {
        memory.put(visit(ctx.identifier()), visit(ctx.number(0)));
        while (Integer.parseInt(memory.get(visit(ctx.identifier()))) <= Integer.parseInt(visit(ctx.number(1)))) {
            visit(ctx.statement());
            memory.put(visit(ctx.identifier()), (Integer.parseInt(memory.get(visit(ctx.identifier()))) + 1) + "");
        }
        return "";
    }

    @Override
    public String visitPrint(ProjectParser.PrintContext ctx) {
        result+=memory.get(visit(ctx.identifier()))+"\n";
        return "";
    }

    @Override
    public String visitFunc(ProjectParser.FuncContext ctx) {
        visit(function.get(visit(ctx.identifier())));
        return "";
    }

    @Override
    public String visitNot(ProjectParser.NotContext ctx) {
        if (visit(ctx.expr()).equals("true"))
            return "false";
        return "true";
    }

    @Override
    public String visitBool(ProjectParser.BoolContext ctx) {
        return visit(ctx.boolea());
    }

    @Override
    public String visitNum(ProjectParser.NumContext ctx) {
        return visit(ctx.number());
    }

    @Override
    public String visitId(ProjectParser.IdContext ctx) {
        return memory.get(visit(ctx.identifier()));
    }

    @Override
    public String visitParanthesis(ProjectParser.ParanthesisContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public String visitBinopr(ProjectParser.BinoprContext ctx) {
        String op = visit(ctx.binop());
        boolean javab;
        switch (op) {
            case "<":
                javab = Float.parseFloat(visit(ctx.expr(0))) < Float.parseFloat(visit(ctx.expr(1)));
                break;
            case ">":
                javab = Float.parseFloat(visit(ctx.expr(0))) > Float.parseFloat(visit(ctx.expr(1)));
                break;
            case "<=":
                javab = Float.parseFloat(visit(ctx.expr(0))) <= Float.parseFloat(visit(ctx.expr(1)));
                break;
            case ">=":
                javab = Float.parseFloat(visit(ctx.expr(0))) >= Float.parseFloat(visit(ctx.expr(1)));
                break;
            case "==":
                javab = Float.parseFloat(visit(ctx.expr(0))) == Float.parseFloat(visit(ctx.expr(1)));
                break;
            case "!=":
                javab = Float.parseFloat(visit(ctx.expr(0))) != Float.parseFloat(visit(ctx.expr(1)));
                break;
            default:
                return "";
        }
        return javab ? "true" : "false";
    }

    @Override
    public String visitMexpr(ProjectParser.MexprContext ctx) {
        return visit(ctx.mexp());
    }

    @Override
    public String visitMexp(ProjectParser.MexpContext ctx) {
        Float o = Float.parseFloat(visit(ctx.mldv(0)));
        for (int i = 0; i < ctx.spop().size(); i++) {
            String op = visit(ctx.spop(i));
            switch (op) {
                case "+":
                    o += Float.parseFloat(visit(ctx.mldv(i + 1)));
                    break;
                case "-":
                    o -= Float.parseFloat(visit(ctx.mldv(i + 1)));
                    break;
            }
        }
        return o + "";
    }

    @Override
    public String visitMldv(ProjectParser.MldvContext ctx) {
        Float o = Float.parseFloat(visit(ctx.pow(0)));
        for (int i = 0; i < ctx.mldvop().size(); i++) {
            String op = visit(ctx.mldvop(i));
            switch (op) {
                case "/":
                    o /= Float.parseFloat(visit(ctx.pow(i + 1)));
                    break;
                case "*":
                    o *= Float.parseFloat(visit(ctx.pow(i + 1)));
                    break;
            }
        }
        return o + "";
    }

    @Override
    public String visitPow(ProjectParser.PowContext ctx) {
        Float o = Float.parseFloat(visit(ctx.fact(0)));
        for (int i = 0; i < ctx.faop().size(); i++) {
            String op = visit(ctx.faop(i));
            switch (op) {
                case "^":
                    o = (float) Math.pow(o, Float.parseFloat(visit(ctx.fact(i + 1))));
                    break;
            }
        }
        return o + "";
    }

    @Override
    public String visitParan(ProjectParser.ParanContext ctx) {
        return visit(ctx.mexp());
    }

    @Override
    public String visitIdd(ProjectParser.IddContext ctx) {
        return memory.get(visit(ctx.identifier()));
    }

    @Override
    public String visitNumm(ProjectParser.NummContext ctx) {
        return visit(ctx.number());
    }

    @Override
    public String visitSpop(ProjectParser.SpopContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitMldvop(ProjectParser.MldvopContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitFaop(ProjectParser.FaopContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitBinop(ProjectParser.BinopContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitNumber(ProjectParser.NumberContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitIdentifier(ProjectParser.IdentifierContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitBoolea(ProjectParser.BooleaContext ctx) {
        return ctx.getText();
    }
}
