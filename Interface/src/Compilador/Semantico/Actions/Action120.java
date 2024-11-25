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

public class Action120 implements SemanticAction {

    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
        // Verifica se há pelo menos um tipo na pilha de tipos
        if (context.getPilhaTipos().isEmpty()) {
            throw new SemanticError("Erro semântico: nenhum tipo disponível na pilha para o operador lógico unário '!'",
                    token.getPosition());
        }

        // Desempilha o tipo do topo da pilha
        String tipoOperando = context.getPilhaTipos().pop();

        // Verifica se o tipo é compatível com o operador lógico unário
        if (!tipoOperando.equals("bool")) {
            throw new SemanticError("Erro semântico: operador lógico unário '!' requer operando do tipo bool.",
                    token.getPosition());
        }

        // Empilha o tipo resultante da operação
        context.getPilhaTipos().push("bool");

        // Gera o código objeto para o operador lógico unário "!"
        // Em IL, o operador "!" é representado por "ldc.i4.0; ceq"
        context.getCodigoObjeto().append("ldc.i4.0\n");
        context.getCodigoObjeto().append("ceq\n");
    }
}
