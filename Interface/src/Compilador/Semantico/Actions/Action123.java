package Compilador.Semantico.Actions;

import Compilador.Semantico.SemanticAction;
import Compilador.Semantico.SemanticContext;
import pkggals.SemanticError;
import pkggals.Token;

public class Action123 implements SemanticAction {

   
    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
        if (context == null || context.getPilhaTipos() == null || context.getCodigoObjeto() == null) {
            throw new SemanticError("Contexto semântico inválido para a ação #123.");
        }

        if (context.getPilhaTipos().size() < 2) {
            throw new SemanticError("Pilha de tipos insuficiente para realizar a operação '+'.");
        }


        String tipoOperando2 = context.getPilhaTipos().pop();
        String tipoOperando1 = context.getPilhaTipos().pop();

        String tipoResultado = determinarTipoResultante(tipoOperando1, tipoOperando2);


        context.getPilhaTipos().push(tipoResultado);


        context.appendCodigoObjeto("add \n"); 

        System.out.println("Ação #123 executada: tipos desempilhados '" + tipoOperando1 + "' e '" 
                + tipoOperando2 + "', tipo resultante '" + tipoResultado + "', código gerado 'add'");
    }

 
    private String determinarTipoResultante(String tipo1, String tipo2) throws SemanticError {
        if (tipo1.equals("float64") || tipo2.equals("float64")) {
            return "float64"; 
        } else if (tipo1.equals("int64") && tipo2.equals("int64")) {
            return "int64"; 
        } else {
            throw new SemanticError("Tipos incompatíveis para a operação '+': " + tipo1 + " e " + tipo2);
        }
    }


}
