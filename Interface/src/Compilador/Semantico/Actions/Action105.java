package Compilador.Semantico.Actions;


import Compilador.Semantico.SemanticAction;
import Compilador.Semantico.SemanticContext;
import pkggals.*;

public class Action105 implements SemanticAction {
    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
                String lexeme = token.getLexeme();

        if (!context.getTabelaSimbolos().containsKey(lexeme)) {
            throw new SemanticError(lexeme + " não declarado.", token.getPosition());
        }

        String tipo;
        if (lexeme.startsWith("i_")) {
            tipo = "int64";
        } else if (lexeme.startsWith("f_")) {
            tipo = "float64";
        } else if (lexeme.startsWith("s_")) {
            tipo = "string";
        } else if (lexeme.startsWith("b_")) {
            tipo = "bool";
        } else {
            throw new SemanticError("Tipo desconhecido para o identificador: " + lexeme, token.getPosition());
        }

        String codigoLeitura = "\ncall string [mscorlib]System.Console::ReadLine()";
        switch (tipo) {
            case "int64":
                codigoLeitura += "\ncall int64 [mscorlib]System.Int64::Parse(string)";
                break;
            case "float64":
                codigoLeitura += "\ncall float64 [mscorlib]System.Double::Parse(string)";
                break;
            case "bool":
                codigoLeitura += "\ncall bool [mscorlib]System.Boolean::Parse(string)";
                break;
            case "string":
                break;
            default:
                throw new SemanticError("Tipo de leitura não suportado: " + tipo, token.getPosition());
        }

        String codigoArmazenamento = "\nstloc " + lexeme + "\n";
    
        context.appendCodigoObjeto(codigoLeitura);
        context.appendCodigoObjeto(codigoArmazenamento);

        System.out.println("Ação #105 executada: leitura para '" + lexeme + "' do tipo '" + tipo + "'.");
    }
}
