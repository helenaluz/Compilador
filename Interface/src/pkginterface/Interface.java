/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkginterface;

import pkginterface.InterfaceMain;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Samsung
 */
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
                createAndShowGUI();
        }
        });
        // TODO code application logic here
    }
    
    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        
        // Cria e adiciona o painel da interface
        InterfaceMain interfaceMain = new InterfaceMain();
        frame.add(interfaceMain);
        
        // Torna o frame visível
        frame.setVisible(true);    
        
    }
    
}
