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
public class Action103 implements SemanticAction {
    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
        String tipoExpressao = context.getPilhaTipos().pop();

        if (tipoExpressao.equals("int64")) {
            context.getCodigoObjeto().append("conv.i8\n");
        }

        for (String identificador : context.getListaIdentificadores()) {
            if (!context.getTabelaSimbolos().containsKey(identificador)) {
                throw new SemanticError(identificador + " não declarado.");
            }

            context.getCodigoObjeto().append("stloc ").append(identificador).append("\n");
        }

        // Limpa a lista de identificadores
        context.getListaIdentificadores().clear();
    }
}

