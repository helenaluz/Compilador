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
public class Action111 implements SemanticAction {

    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
        if (context.getPilhaRotulos().isEmpty()) {
            throw new SemanticError("Erro semântico: pilha de rótulos está vazia.");
        }

        String rotuloDesempilhado = context.getPilhaRotulos().pop();

        context.getCodigoObjeto().append(rotuloDesempilhado).append(":\n");
    }
}
