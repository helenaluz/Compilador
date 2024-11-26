package Compilador.Semantico.Actions;

import Compilador.Semantico.SemanticAction;
import Compilador.Semantico.SemanticContext;
import pkggals.SemanticError;
import pkggals.Token;

public class Action108 implements SemanticAction {

    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
        if (context == null || context.getPilhaTipos() == null || context.getCodigoObjeto() == null) {
            throw new SemanticError("Contexto semântico inválido para a ação #108.");
        }

        if (context.getPilhaTipos().isEmpty()) {
            throw new SemanticError("Pilha de tipos vazia. Não há expressão para escrever.");
        }

        String tipoExpressao = context.getPilhaTipos().pop();

        if (tipoExpressao.equals("int64")) {
            context.appendCodigoObjeto("conv.r8 \n");
        }

        String codigoEscrita = "call void [mscorlib]System.Console::Write(" + tipoExpressao + ")";
        context.appendCodigoObjeto(codigoEscrita);

        System.out.println("Ação #108 executada: tipo desempilhado '" + tipoExpressao 
                + "', código gerado '" + codigoEscrita + "'");
    }
}
