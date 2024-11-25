package Compilador.Semantico.Actions;

import Compilador.Semantico.SemanticAction;
import Compilador.Semantico.SemanticContext;
import pkggals.SemanticError;
import pkggals.Token;

public class Action115 implements SemanticAction{

    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {

        if (context.getPilhaRotulos().isEmpty()) {
            throw new SemanticError("Erro: Pilha de rótulos vazia. Não é possível desempilhar.", token.getPosition());
        }

        String rotuloDesempilhado = context.getPilhaRotulos().pop();

        String codigo = "brfalse " + rotuloDesempilhado;
        context.appendCodigoObjeto(codigo);
    }
    
}
