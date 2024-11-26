
package Compilador.Semantico.Actions;
import Compilador.Semantico.*;
import pkggals.*;

public class Action117 implements SemanticAction {

    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
        if (context.getPilhaTipos().size() < 2) {
            throw new SemanticError("Erro semântico: tipos insuficientes na pilha para a operação lógica binária.", token.getPosition());
        }

        String tipoOperando2 = context.getPilhaTipos().pop();
        String tipoOperando1 = context.getPilhaTipos().pop();

        if (!tipoOperando1.equals("bool") || !tipoOperando2.equals("bool")) {
            throw new SemanticError("Erro semântico: operadores lógicos binários requerem operandos do tipo bool.", token.getPosition());
        }

        context.getPilhaTipos().push("bool");

        context.getCodigoObjeto().append("or\n");
    }
}
