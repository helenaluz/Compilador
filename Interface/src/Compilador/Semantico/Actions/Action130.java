package Compilador.Semantico.Actions;

import Compilador.Semantico.SemanticAction;
import Compilador.Semantico.SemanticContext;
import pkggals.SemanticError;
import pkggals.Token;

public class Action130 implements SemanticAction {

    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
        if (context == null || context.getPilhaTipos() == null || context.getCodigoObjeto() == null) {
            throw new SemanticError("Contexto semântico inválido para a ação #130.");
        }

        String lexeme = token.getLexeme();
        if (lexeme == null || lexeme.isEmpty()) {
            throw new SemanticError("Valor inválido para constante string: " + lexeme, token.getPosition());
        }

        context.getPilhaTipos().push("string");

 
        String codigo = "ldstr \"" + lexeme + "\""; 
        context.appendCodigoObjeto(codigo);
        System.out.println("Ação #130 executada: empilhado 'string' e gerado código '" + codigo + "'");
    }
}
