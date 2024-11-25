/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Compilador.Semantico.Actions;

import java.util.Stack;
import pkggals.*;
import Compilador.Semantico.*;


/**
 *
 * @author lbnitsche
 */

public class Action109 implements SemanticAction {

    private static int labelCounter = 0; 

    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
        
        String novoRotulo1 = "label" + (labelCounter++);
        context.getPilhaRotulos().push(novoRotulo1); 

        
        String novoRotulo2 = "label" + (labelCounter++);
        context.getCodigoObjeto().append("brfalse ").append(novoRotulo2).append("\n");
        context.getPilhaRotulos().push(novoRotulo2); 
    }
}

