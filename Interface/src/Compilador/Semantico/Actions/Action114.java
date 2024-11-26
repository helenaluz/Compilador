package Compilador.Semantico.Actions;

import Compilador.Semantico.SemanticAction;
import Compilador.Semantico.SemanticContext;
import pkggals.SemanticError;
import pkggals.Token;

public class Action114 implements SemanticAction {

    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
        if (context == null || context.getPilhaRotulos() == null || context.getCodigoObjeto() == null) {
            throw new SemanticError("Contexto semântico inválido para a ação #114.");
        }

        if (context.getPilhaRotulos().isEmpty()) {
            throw new SemanticError("Pilha de rótulos vazia. Não há rótulo para repetir o bloco.");
        }

        String rotuloDesempilhado = context.getPilhaRotulos().pop();
        String codigoDesvio = "\nbrtrue " + rotuloDesempilhado;
        context.appendCodigoObjeto(codigoDesvio);

        System.out.println("Ação #114 executada: rótulo desempilhado '" + rotuloDesempilhado 
                + "', código gerado '" + codigoDesvio + "'");
    }
}
