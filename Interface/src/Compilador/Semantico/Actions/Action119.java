package Compilador.Semantico.Actions;

import Compilador.Semantico.SemanticAction;
import Compilador.Semantico.SemanticContext;
import pkggals.SemanticError;
import pkggals.Token;

public class Action119 implements SemanticAction {
    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
        if (context == null || context.getPilhaTipos() == null || context.getCodigoObjeto() == null) {
            throw new SemanticError("Contexto semântico inválido para a ação #119.");
        }

        context.getPilhaTipos().push("bool");

        String codigo = "ldc.i4.1"; 
        context.appendCodigoObjeto(codigo);

        System.out.println("Ação #119 executada: empilhado 'bool' e gerado código '" + codigo + "'");
    }
}
