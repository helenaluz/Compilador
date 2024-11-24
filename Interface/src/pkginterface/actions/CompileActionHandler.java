package pkginterface.actions;

import java.io.StringReader;
import pkggals.*;
import javax.swing.*;
import Compilador.*;


public class CompileActionHandler {
    
    public static String compilar(String input, String caminhoArquivo) {
        AnalisadorLexico lexico = new AnalisadorLexico();
        String output = lexico.analisarLexico(input, caminhoArquivo);
        return output;
    }
}

