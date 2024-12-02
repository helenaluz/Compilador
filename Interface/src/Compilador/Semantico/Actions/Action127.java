package Compilador.Semantico.Actions;

import Compilador.Semantico.SemanticAction;
import Compilador.Semantico.SemanticContext;
import pkggals.SemanticError;
import pkggals.Token;

public class Action127 implements SemanticAction {

    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
        if (context == null || context.getPilhaTipos() == null || context.getCodigoObjeto() == null) {
            throw new SemanticError("Contexto semântico inválido para a ação #127.");
        }

        String lexeme = token.getLexeme();

        if (!context.getTabelaSimbolos().containsKey(lexeme)) {
            throw new SemanticError(lexeme + " não declarado.", token.getPosition());
        }

        String tipo = context.getTabelaSimbolos().get(lexeme);

        context.getPilhaTipos().push(tipo);

        String codigo = "ldloc " + lexeme + "\n";
        context.appendCodigoObjeto(codigo);

        if (tipo.equals("int64")) {
            context.appendCodigoObjeto("conv.r8\n"); 
        }

        System.out.println("Ação #127 executada: identificador '" + lexeme + "' encontrado, tipo '" 
                + tipo + "' e código gerado '" + codigo + "'");
    }
}
