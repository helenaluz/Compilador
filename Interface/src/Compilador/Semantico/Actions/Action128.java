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

        if (context == null || context.getPilhaTipos() == null || context.getCodigoObjeto() == null) {
            throw new SemanticError("Contexto semântico inválido para a ação #128.");
        }

        if (token == null || token.getLexeme() == null) {
            throw new SemanticError("Token inválido para a ação #128.");
        }
        
        String lexeme = token.getLexeme();

        context.getPilhaTipos().push("int64");

        context.getCodigoObjeto().append("ldc.i8 ").append(lexeme).append("\n");
        context.getCodigoObjeto().append("conv.r8\n");
    }
}
