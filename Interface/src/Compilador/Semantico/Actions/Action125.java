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
public class Action125 implements SemanticAction {

    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
        // Verifica se há pelo menos dois tipos na pilha de tipos
        if (context.getPilhaTipos().size() < 2) {
            throw new SemanticError("Erro semântico: tipos insuficientes na pilha para a operação aritmética binária '*'.",
                    token.getPosition());
        }

        // Desempilha os dois tipos do topo da pilha
        String tipoOperando2 = context.getPilhaTipos().pop();
        String tipoOperando1 = context.getPilhaTipos().pop();

        // Determina o tipo resultante com base na tabela de tipos
        String tipoResultante;
        if (tipoOperando1.equals("int64") && tipoOperando2.equals("int64")) {
            tipoResultante = "int64";
        } else if ((tipoOperando1.equals("int64") || tipoOperando1.equals("float64")) &&
                   (tipoOperando2.equals("int64") || tipoOperando2.equals("float64"))) {
            tipoResultante = "float64";
        } else {
            throw new SemanticError("Erro semântico: tipos incompatíveis para a operação aritmética '*'.",
                    token.getPosition());
        }

        // Empilha o tipo resultante da operação
        context.getPilhaTipos().push(tipoResultante);

        // Gera o código objeto para a multiplicação
        context.getCodigoObjeto().append("mul\n");
    }
}

