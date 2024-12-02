package Compilador.Semantico.Actions;


import Compilador.Semantico.SemanticAction;
import Compilador.Semantico.SemanticContext;
import pkggals.*;

public class Action105 implements SemanticAction {
    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
                String lexeme = token.getLexeme();

        // Verifica se o identificador foi declarado
        if (!context.getTabelaSimbolos().containsKey(lexeme)) {
            throw new SemanticError(lexeme + " não declarado.", token.getPosition());
        }

        // Determina o tipo do identificador
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

        // Gera o código IL para leitura com ReadLine
        String codigoLeitura = "\ncall string [mscorlib]System.Console::ReadLine()";

        // Adiciona a conversão com base no tipo
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
                // Para string, nenhuma conversão adicional é necessária
                break;
            default:
                throw new SemanticError("Tipo de leitura não suportado: " + tipo, token.getPosition());
        }

        // Gera o código IL para armazenar o valor na variável
        String codigoArmazenamento = "\nstloc " + lexeme + "\n";

        // Adiciona os códigos gerados ao contexto
        context.appendCodigoObjeto(codigoLeitura);
        context.appendCodigoObjeto(codigoArmazenamento);

        // Mensagem de depuração (opcional)
        System.out.println("Ação #105 executada: leitura para '" + lexeme + "' do tipo '" + tipo + "'.");
    }
}
