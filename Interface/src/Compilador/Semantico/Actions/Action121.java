package Compilador.Semantico.Actions;

import Compilador.Semantico.SemanticAction;
import Compilador.Semantico.SemanticContext;
import pkggals.SemanticError;
import pkggals.Token;


public class Action121 implements SemanticAction {

    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
        if (context == null || context.getOperadorRelacional() == null) {
            throw new SemanticError("Contexto semântico inválido para a ação #121.");
        }
        String operador = token.getLexeme();

        if (!operador.equals("==") && !operador.equals("!=") && !operador.equals("<") && !operador.equals(">")) {
            throw new SemanticError("Operador relacional desconhecido: " + operador, token.getPosition());
        }

        context.setOperadorRelacional(operador);

        System.out.println("Ação #121 executada: operador relacional '" + operador + "' armazenado.");
    }
}
