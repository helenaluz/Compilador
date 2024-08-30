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
        if(dados != null && dados.isDataFlavorSupported(DataFlavor.stringFlavor)){ 
            String textoCopiado = (String)dados.getTransferData(DataFlavor.stringFlavor);
            conteudo.insert(textoCopiado, conteudo.getCaretPosition()); 
        }
        }catch(UnsupportedFlavorException | IOException e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }    

    }

    public static void cortar(JTextArea conteudo) {
        copiar(conteudo);
        conteudo.setText("");
    }

 

    
}
