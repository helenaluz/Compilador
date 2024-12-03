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

public class Action113 implements SemanticAction {

    private static int labelCounter = 0; 

    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
        String novoRotulo = "label" + (labelCounter++);

        context.getCodigoObjeto().append(novoRotulo).append(":\n");
        context.getPilhaRotulos().push(novoRotulo);
    }
}
