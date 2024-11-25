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

    private static int labelCounter = 0; // Contador estático para rótulos únicos

    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
        // Cria um novo rótulo com base no contador
        String novoRotulo = "label" + (labelCounter++);

        // Adiciona o rótulo ao código objeto
        context.getCodigoObjeto().append(novoRotulo).append(":\n");

        // Empilha o rótulo para resolução posterior
        context.getPilhaRotulos().push(novoRotulo);
    }
}
