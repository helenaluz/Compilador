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

public class Action116 implements SemanticAction {

    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
        if (context.getPilhaTipos().size() < 2) {
            throw new SemanticError("Erro semântico: tipos insuficientes na pilha para a operação lógica binária.", token.getPosition());
        }

        String tipoOperando2 = context.getPilhaTipos().pop();
        String tipoOperando1 = context.getPilhaTipos().pop();

        // Verifica se ambos os operandos são do tipo bool
        if (!tipoOperando1.equals("bool") || !tipoOperando2.equals("bool")) {
            throw new SemanticError("Erro semântico: operadores lógicos binários requerem operandos do tipo bool.", token.getPosition());
        }

        // Empilha o tipo resultante da operação lógica
        context.getPilhaTipos().push("bool");

        // Gera o código objeto para a operação lógica binária (&& em IL é "and")
        context.getCodigoObjeto().append("and\n");
    }
}
