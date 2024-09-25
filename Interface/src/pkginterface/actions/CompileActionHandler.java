package pkginterface.actions;

import java.io.StringReader;
import pkggals.*;
import javax.swing.*;
import Compilador.*;


public class CompileActionHandler {
    
    public static String compilar(String input) {
        AnalisadorLexico lexico = new AnalisadorLexico();
        String output = lexico.AnaisadorLexico(input);
        return output;
    }
}

