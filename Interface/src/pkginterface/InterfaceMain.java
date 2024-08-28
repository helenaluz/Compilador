/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pkginterface;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import pkginterface.actions.FileActionHandler;
import pkginterface.utils.EditorUtils;
import pkginterface.NumberedBorder;  

/**
 *
 * @author Samsung
 */
public class InterfaceMain extends javax.swing.JPanel {

    /**
     * Creates new form InterfaceMain
     */
    public InterfaceMain() {
        
        initComponents();
        configureShortcuts();
        jTextArea4.setBorder(new NumberedBorder());
// Def
    }
    
    private void configureShortcuts() {
        //TODO: atalhos copiar, colar, recortar

        //atalhos botoes de acao
        EditorUtils.addShortcut(this, KeyStroke.getKeyStroke("control N"), "newFile", e -> btnNewFileActionPerformed(null));
        EditorUtils.addShortcut(this, KeyStroke.getKeyStroke("control O"), "openFile", e -> btnOpenFileActionPerformed(null));
        EditorUtils.addShortcut(this, KeyStroke.getKeyStroke("control S"), "saveFile", e -> btnSaveFileActionPerformed(null));
        EditorUtils.addShortcut(this, KeyStroke.getKeyStroke("F7"), "compile", e -> btnCompileActionPerformed(null));
        EditorUtils.addShortcut(this, KeyStroke.getKeyStroke("F1"), "team", e -> btnTeamActionPerformed(null));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        MessageTxt = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnNewFile = new javax.swing.JButton();
        btnOpenFile = new javax.swing.JButton();
        btnSaveFile = new javax.swing.JButton();
        btnCopy = new javax.swing.JButton();
        btnPaste = new javax.swing.JButton();
        btnCut = new javax.swing.JButton();
        btnCompile = new javax.swing.JButton();
        btnTeam = new javax.swing.JButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(900, 250));
        setName("PainelPrimcipal"); // NOI18N
        setPreferredSize(new java.awt.Dimension(900, 250));
        setLayout(new java.awt.BorderLayout(10, 0));

        jSplitPane2.setDividerLocation(-3);
        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setMinimumSize(new java.awt.Dimension(200, 200));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(244, 200));

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane1.setViewportView(jTextArea4);

        jSplitPane2.setTopComponent(jScrollPane1);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        MessageTxt.setEditable(false);
        MessageTxt.setColumns(20);
        MessageTxt.setRows(5);
        jScrollPane2.setViewportView(MessageTxt);

        jSplitPane2.setRightComponent(jScrollPane2);

        add(jSplitPane2, java.awt.BorderLayout.CENTER);

        jLabel1.setText("Status");
        add(jLabel1, java.awt.BorderLayout.PAGE_END);

        jPanel1.setMinimumSize(new java.awt.Dimension(900, 25));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 80));

        btnNewFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkginterface/resources/newfile.png"))); // NOI18N
        btnNewFile.setText("<html>Salvar<br>arquivo<br>[Ctrl+S]</html>");
        btnNewFile.setMinimumSize(new java.awt.Dimension(100, 25));
        btnNewFile.setPreferredSize(new java.awt.Dimension(100, 70));
        btnNewFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewFileActionPerformed(evt);
            }
        });
        jPanel1.add(btnNewFile);

        btnOpenFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkginterface/resources/openfile.png"))); // NOI18N
        btnOpenFile.setText("<html>Abrir <br> arquivo<br>[Ctrl+N]</html>");
        btnOpenFile.setMinimumSize(new java.awt.Dimension(100, 25));
        btnOpenFile.setPreferredSize(new java.awt.Dimension(100, 70));
        btnOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenFileActionPerformed(evt);
            }
        });
        jPanel1.add(btnOpenFile);

        btnSaveFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkginterface/resources/savefile.png"))); // NOI18N
        btnSaveFile.setText("<html>Salvar<br>arquivo<br> [Ctrl+S]</html>");
        btnSaveFile.setMinimumSize(new java.awt.Dimension(100, 25));
        btnSaveFile.setPreferredSize(new java.awt.Dimension(100, 70));
        btnSaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveFileActionPerformed(evt);
            }
        });
        jPanel1.add(btnSaveFile);

        btnCopy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkginterface/resources/copy.png"))); // NOI18N
        btnCopy.setText("<html>Copiar<br> [Ctrl+C]</html>");
        btnCopy.setMinimumSize(new java.awt.Dimension(100, 25));
        btnCopy.setPreferredSize(new java.awt.Dimension(100, 70));
        btnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyActionPerformed(evt);
            }
        });
        jPanel1.add(btnCopy);

        btnPaste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkginterface/resources/paste.png"))); // NOI18N
        btnPaste.setText("<html>Colar<br> [Ctrl+V]</html>");
        btnPaste.setMinimumSize(new java.awt.Dimension(100, 25));
        btnPaste.setPreferredSize(new java.awt.Dimension(100, 70));
        btnPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasteActionPerformed(evt);
            }
        });
        jPanel1.add(btnPaste);

        btnCut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkginterface/resources/cut.png"))); // NOI18N
        btnCut.setText("<html>Recortar<br> [Ctrl+X]<html>");
        btnCut.setMinimumSize(new java.awt.Dimension(100, 25));
        btnCut.setPreferredSize(new java.awt.Dimension(100, 70));
        btnCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCutActionPerformed(evt);
            }
        });
        jPanel1.add(btnCut);

        btnCompile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkginterface/resources/compile.png"))); // NOI18N
        btnCompile.setText("<html>Compilar <br>[F7]</html>");
        btnCompile.setMinimumSize(new java.awt.Dimension(100, 25));
        btnCompile.setPreferredSize(new java.awt.Dimension(100, 70));
        btnCompile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompileActionPerformed(evt);
            }
        });
        jPanel1.add(btnCompile);

        btnTeam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkginterface/resources/equipe.png"))); // NOI18N
        btnTeam.setText("<html>Equipe <br>[F1]</html>");
        btnTeam.setToolTipText("Aqui você encontrará informações sobre a equipe que realizou esse projeto.");
        btnTeam.setMinimumSize(new java.awt.Dimension(100, 25));
        btnTeam.setName("Equipe"); // NOI18N
        btnTeam.setPreferredSize(new java.awt.Dimension(100, 70));
        btnTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeamActionPerformed(evt);
            }
        });
        jPanel1.add(btnTeam);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewFileActionPerformed
        // TODO add your handling code here:
        EditorUtils.limpaAreas(jTextArea4);
    }//GEN-LAST:event_btnNewFileActionPerformed

    private void btnOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenFileActionPerformed
        // TODO add your handling code here:
        FileActionHandler fah = new FileActionHandler();
        //TODO: linkar elementos que serao 'limpos' ao abrir um arquivo
        fah.openFile(this, jTextArea4);
        //EditorUtils.limpaAreas();
    }//GEN-LAST:event_btnOpenFileActionPerformed

    private void btnSaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveFileActionPerformed
        // TODO add your handling code here:
        FileActionHandler.criarSalvarArquivo(jTextArea4);
    }//GEN-LAST:event_btnSaveFileActionPerformed

    private void btnCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCopyActionPerformed

    private void btnPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPasteActionPerformed

    private void btnCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCutActionPerformed

    private void btnCompileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompileActionPerformed
        // TODO add your handling code here:
        MessageTxt.setText("compilação de programas ainda não foi implementada");
    }//GEN-LAST:event_btnCompileActionPerformed

    private void btnTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeamActionPerformed
        // TODO add your handling code here:
        MessageTxt.setText("Helena Luz, Luana Nitsche, Maria Eduarda Nascimento");
    }//GEN-LAST:event_btnTeamActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea MessageTxt;
    private javax.swing.JButton btnCompile;
    private javax.swing.JButton btnCopy;
    private javax.swing.JButton btnCut;
    private javax.swing.JButton btnNewFile;
    private javax.swing.JButton btnOpenFile;
    private javax.swing.JButton btnPaste;
    private javax.swing.JButton btnSaveFile;
    private javax.swing.JButton btnTeam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane2;
    public javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables
}
