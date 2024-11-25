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
        // Desempilha o tipo da expressão
        String tipoExpressao = context.getPilhaTipos().pop();

        // Gera código para converter int64 para float64, se necessário
        if (tipoExpressao.equals("int64")) {
            context.getCodigoObjeto().append("conv.i8\n");
        }

        // Processa cada identificador na lista
        for (String identificador : context.getListaIdentificadores()) {
            // Verifica se o identificador está na tabela de símbolos
            if (!context.getTabelaSimbolos().containsKey(identificador)) {
                throw new SemanticError(identificador + " não declarado.");
            }

            // Gera código para armazenar o valor no identificador
            context.getCodigoObjeto().append("stloc ").append(identificador).append("\n");
        }

        // Limpa a lista de identificadores
        context.getListaIdentificadores().clear();
    }
}

