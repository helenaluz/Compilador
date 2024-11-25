package Compilador.Semantico.Actions;

import Compilador.Semantico.SemanticAction;
import Compilador.Semantico.SemanticContext;
import pkggals.SemanticError;
import pkggals.Token;

public class Action104 implements SemanticAction {

    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
        context.addListaIdentificadores(token.getLexeme());
    }
    
}
