package Compilador.Semantico.Actions;

import Compilador.Semantico.SemanticAction;
import Compilador.Semantico.SemanticContext;
import pkggals.SemanticError;
import pkggals.Token;

public class Action112 implements SemanticAction {

    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
         
         String novoRotulo = context.gerarNovoRotulo();

         context.addPilhaRotulos(novoRotulo);
         String codigo = "brfalse " + novoRotulo;
         context.appendCodigoObjeto(codigo);
    }
    
}
