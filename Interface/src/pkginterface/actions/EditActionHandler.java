package pkginterface.actions;
import java.awt.Component;
import pkginterface.*;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import javax.swing.*;
import java.io.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class EditActionHandler {
    //TODO: copiar, colar, recortar e talvez equipe (mais basico)

    public static void copiar(JTextArea conteudo) {
        String selecionado = ""; 
        selecionado = conteudo.getSelectedText(); 
        
        if(selecionado != null && !selecionado.isEmpty()){
         StringSelection textoSelecionado = new StringSelection(selecionado); 
         Clipboard areaTranfe = Toolkit.getDefaultToolkit().getSystemClipboard();
         areaTranfe.setContents(textoSelecionado, null);
        }
        else{   
         selecionado = conteudo.getText(); 
         StringSelection textoSelecionado = new StringSelection(selecionado); 
         Clipboard areaTranfe = Toolkit.getDefaultToolkit().getSystemClipboard(); 
         areaTranfe.setContents(textoSelecionado, null);
        }
    }

    public static void colar(JTextArea conteudo) throws UnsupportedFlavorException, IOException {
        Clipboard areaTranfe = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable dados = areaTranfe.getContents(null);
        
        try{
        if(dados != null && dados.isDataFlavorSupported(DataFlavor.stringFlavor)){  // verifica se p tipo de dado é suportado pelo Tranferable
            String textoCopiado = (String)dados.getTransferData(DataFlavor.stringFlavor);
            conteudo.insert(textoCopiado, conteudo.getCaretPosition()); // getCaretPosition possição do cursor
        }
        }catch(UnsupportedFlavorException | IOException e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }    

    }

    public void cortar() {

    }

    public void equipe() {
        /*
        return "Helena Luz, Luana Nitsche, Maria Eduarda Nascimento";
         */
    }

    /*
    Talvez criar uma funcao para os atalhos que chamarao as funcoes de cada botao (nao sei como funciona essa parte)
    att: vi algo sobre KeyBind;
     */
}
