package pkginterface.utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

public class EditorUtils {

    public static void limpaAreas(JTextArea... textAreas) {
        for (JTextArea textArea : textAreas) {
            textArea.setText("");
        }
    }

    public static void addShortcut(JComponent component, KeyStroke keyStroke, String actionName, ActionListener actionListener) {
        InputMap inputMap = component.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        var actionMap = component.getActionMap();

        inputMap.put(keyStroke, actionName);
        actionMap.put(actionName, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionListener.actionPerformed(e);
            }
        });
    }
    public static void atualizaStatus(String filePath) {
        //recebe caminho do arquivo atual
    }
}
