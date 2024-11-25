/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Compilador.Semantico.Actions;

import Compilador.Semantico.*;
import pkggals.*;

/**
 *
 * @author lbnitsche
 */
public class Action128 implements SemanticAction {

    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
        // Obtém o lexema do token, que representa o valor da constante
        String lexeme = token.getLexeme();

        // Empilha o tipo correspondente (float64) na pilha de tipos
        context.getPilhaTipos().push("float64");

        // Gera o código objeto para carregar a constante int como float64
        context.getCodigoObjeto().append("ldc.i8 ").append(lexeme).append("\n");
        context.getCodigoObjeto().append("conv.r8\n");
    }
}
