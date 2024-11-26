package Compilador.Semantico.Actions;

import Compilador.Semantico.SemanticAction;
import Compilador.Semantico.SemanticContext;
import pkggals.SemanticError;
import pkggals.Token;

public class Action126 implements SemanticAction{
    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
        // Verifica se há pelo menos dois tipos na pilha de tipos
        if (context.getPilhaTipos().size() < 2) {
            throw new SemanticError("Erro semântico: tipos insuficientes na pilha para a operação aritmética binária '*'.",
                    token.getPosition());
        }

        String tipoOperando2 = context.getPilhaTipos().pop();
        String tipoOperando1 = context.getPilhaTipos().pop();

        String tipoResultante;
        if (tipoOperando1.equals("int64") && tipoOperando2.equals("int64")) {
            tipoResultante = "int64";
        } else if ((tipoOperando1.equals("int64") || tipoOperando1.equals("float64")) &&
                   (tipoOperando2.equals("int64") || tipoOperando2.equals("float64"))) {
            tipoResultante = "float64";
        } else {
            throw new SemanticError("Erro semântico: tipos incompatíveis para a operação aritmética '*'.",
                    token.getPosition());
        }

        context.getPilhaTipos().push(tipoResultante);

        context.getCodigoObjeto().append("div\n");
    }
}
