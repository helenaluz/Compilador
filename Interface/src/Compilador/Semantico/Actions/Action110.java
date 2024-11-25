/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Compilador.Semantico.Actions;

import pkggals.*;
import Compilador.Semantico.*;

/**
 *
 * @author lbnitsche
 */
public class Action110 implements SemanticAction {

    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {

        if (context.getPilhaRotulos().size() < 2) {
            throw new SemanticError("Erro semântico: pilha de rótulos contém menos de dois elementos.");
        }

        String rotuloDesempilhado2 = context.getPilhaRotulos().pop();
        String rotuloDesempilhado1 = context.getPilhaRotulos().pop();

        context.getCodigoObjeto().append("br ").append(rotuloDesempilhado1).append("\n");

        context.getPilhaRotulos().push(rotuloDesempilhado1);

        context.getCodigoObjeto().append(rotuloDesempilhado2).append(":\n");
    }
}

