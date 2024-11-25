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
public class Action107 implements SemanticAction {

    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
        // Gera o código objeto para inserir a quebra de linha
        context.getCodigoObjeto().append("call void [mscorlib]System.Console::WriteLine()\n");
    }
}
