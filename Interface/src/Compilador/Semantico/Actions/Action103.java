package Compilador.Semantico.Actions;

import Compilador.Semantico.*;
import pkggals.*;

public class Action103 implements SemanticAction {
    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
        String tipoExpressao = context.getPilhaTipos().pop();

        if ("int64".equals(tipoExpressao)) {
            context.getCodigoObjeto().append("conv.i8\n");
        }

        int numIdentificadores = context.getListaIdentificadores().size();
        if (numIdentificadores > 1) {
            for (int i = 1; i < numIdentificadores; i++) {
                context.getCodigoObjeto().append("dup\n");
            }
        }

        for (String identificador : context.getListaIdentificadores()) {
            if (!context.getTabelaSimbolos().containsKey(identificador)) {
                throw new SemanticError(identificador + " não declarado.", token.getPosition());
            }

            context.getCodigoObjeto().append("stloc ").append(identificador).append("\n");
        }

        context.getListaIdentificadores().clear();
    }
}
