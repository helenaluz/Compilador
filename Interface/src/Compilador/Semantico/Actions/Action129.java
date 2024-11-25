package Compilador.Semantico.Actions;

import Compilador.Semantico.SemanticAction;
import Compilador.Semantico.SemanticContext;
import pkggals.SemanticError;
import pkggals.Token;


public class Action129 implements SemanticAction {

    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
        if (context == null || context.getPilhaTipos() == null || context.getCodigoObjeto() == null) {
            throw new SemanticError("Contexto semântico inválido para a ação #129.");
        }

    
        String lexeme = token.getLexeme();
        if (!isFloat(lexeme)) {
            throw new SemanticError("Valor inválido para constante float: " + lexeme, token.getPosition());
        }


        context.getPilhaTipos().push("float64");

     
        String codigo = "ldc.r8 " + lexeme.replace(',', '.'); 
        context.appendCodigoObjeto(codigo);

        System.out.println("Ação #129 executada: empilhado 'float64' e gerado código '" + codigo + "'");
    }

    private boolean isFloat(String lexeme) {
        try {
            Double.parseDouble(lexeme.replace(',', '.')); 
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
