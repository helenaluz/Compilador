package pkginterface.utils;

import javax.swing.JTextArea;

public class EditorUtils {

    public static void limpaAreas(JTextArea... textAreas) {
        for (JTextArea textArea : textAreas) {
            textArea.setText("");
        }
    }


    public static void atualizaStatus(String filePath) {
        //recebe caminho do arquivo atual
    }
}
