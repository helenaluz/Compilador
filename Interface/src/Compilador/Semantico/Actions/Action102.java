package Compilador.Semantico.Actions;

import Compilador.Semantico.SemanticAction;
import Compilador.Semantico.SemanticContext;
import pkggals.SemanticError;
import pkggals.Token;

public class Action102 implements SemanticAction {

    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
        if (context == null || context.getTabelaSimbolos() == null || context.getCodigoObjeto() == null) {
            throw new SemanticError("Contexto semântico inválido para a ação #102.");
        }

        for (String lexeme : context.getListaIdentificadores()) {

            if (context.getTabelaSimbolos().containsKey(lexeme)) {
                throw new SemanticError(lexeme + " já declarado.", token.getPosition());
            }

            String tipo = determinarTipo(lexeme);

            context.getTabelaSimbolos().put(lexeme, tipo);

            String codigo = ".locals init (" + tipo + " " + lexeme + ")\n";
            context.appendCodigoObjeto(codigo);

            System.out.println("Ação #102 executada: identificador '" + lexeme + "' declarado, tipo '" 
                    + tipo + "' e código gerado '" + codigo + "'");
        }
        
        context.getListaIdentificadores().clear();
    }


    private String determinarTipo(String lexeme) throws SemanticError {
        if (lexeme.startsWith("i_")) {
            return "int64";
        } else if (lexeme.startsWith("f_")) {
            return "float64";
        } else if (lexeme.startsWith("s_")) {
            return "string";
        } else if (lexeme.startsWith("b_")) {
            return "bool";
        } else {
            throw new SemanticError("Prefixo inválido para o identificador: " + lexeme);
        }
    }
}
