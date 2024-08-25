/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkginterface;

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
        createAndShowGUI();
        // TODO code application logic here
    }
    
    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Interface");
        JTextArea textArea  = new JTextArea();
        frame.add(textArea);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);     
        
    }
    
}
