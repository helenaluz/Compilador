package Compilador.Semantico.Actions;


import Compilador.Semantico.SemanticAction;
import Compilador.Semantico.SemanticContext;
import pkggals.*;

public class Action105 implements SemanticAction {
    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
        String lexeme = token.getLexeme();

        if (!context.getTabelaSimbolos().containsKey(lexeme)) {
            throw new SemanticError(lexeme + " não declarado", token.getPosition());
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

        String codigoLeitura;
        switch (tipo) {
            case "int64":
                codigoLeitura = "call int64 [mscorlib]System.Console::ReadInt64()";
                break;
            case "float64":
                codigoLeitura = "call float64 [mscorlib]System.Console::ReadFloat64()";
                break;
            case "string":
                codigoLeitura = "call string [mscorlib]System.Console::ReadLine()";
                break;
            case "bool":
                codigoLeitura = "call bool [mscorlib]System.Console::ReadBool()";
                break;
            default:
                throw new SemanticError("Tipo de leitura não suportado: " + tipo, token.getPosition());
        }

        String codigoArmazenamento = "stloc " + lexeme;

        context.appendCodigoObjeto(codigoLeitura);
        context.appendCodigoObjeto(codigoArmazenamento);
    }
}
