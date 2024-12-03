/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Compilador.Semantico.Actions;

/**
 *
 * @author lbnitsche
 */
import Compilador.Semantico.*;
import pkggals.*;

public class Action120 implements SemanticAction {

    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
        if (context.getPilhaTipos().isEmpty()) {
            throw new SemanticError("Erro semântico: nenhum tipo disponível na pilha para o operador lógico unário '!'",
                    token.getPosition());
        }

        String tipoOperando = context.getPilhaTipos().pop();

        if (!tipoOperando.equals("bool")) {
            throw new SemanticError("Erro semântico: operador lógico unário '!' requer operando do tipo bool.",
                    token.getPosition());
        }

        context.getPilhaTipos().push("bool");
        context.getCodigoObjeto().append("ldc.i4.0\n");
        context.getCodigoObjeto().append("ceq\n");
    }
}
