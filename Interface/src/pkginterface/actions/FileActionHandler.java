package pkginterface.actions;

import java.awt.Component;
import pkginterface.utils.EditorUtils;

import javax.swing.*;
import java.io.*;
import javax.swing.filechooser.FileNameExtensionFilter;


public class FileActionHandler {
    
    public void openFile(Component parent, JTextArea editor) {
        // Cria o JFileChooser e define um filtro para arquivos de texto (.txt)
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));

        // Armazena o conteúdo atual do editor
        String currentEditorContent = editor.getText();

        // Mostra a janela de diálogo para abrir arquivos
        int result = fileChooser.showOpenDialog(parent);

        if (result == JFileChooser.APPROVE_OPTION) {
            // Usuário selecionou um arquivo
            File selectedFile = fileChooser.getSelectedFile();

            try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                // Lê o conteúdo do arquivo no editor
                editor.read(reader, null);

                // Limpa a área de mensagens
                EditorUtils.limpaAreaMsg();

                // Atualiza a barra de status com o nome do arquivo
                EditorUtils.atualizaStatus(selectedFile.getPath());

            } catch (IOException e) {
                // Tratar possíveis exceções de leitura de arquivo
                JOptionPane.showMessageDialog(parent, "Erro ao abrir o arquivo.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Nenhum arquivo foi selecionado, restaura o conteúdo anterior do editor
            editor.setText(currentEditorContent);
        }
    }





    public void saveFile(JFrame parent) {
        //TODO: logica para salvar o arquivo
        /*
        precisa ter:
         - verificacao se arquivo ja existe ou nao
         se existir:
            - atualiza o .txt com o conteudo do editor
            - chama funcao para limpar a area de mensagens
         senao:
            - selecao de pasta + nomeacao do arquivo
            - salvar o conteudo do editor em .txt
            - chamar funcao para limpar area de mensagem
            - chamar funcao para atualizar barra de status
         */
    }

    public void newFile(){
        //TODO: logica para novo arquivo
        /*
        precisa ter:
         - chamar funcao de limpar o editor
         - chamar funcao para limpar area de mensagem
         - chamar funcao para limpar barra de status

         */
    }


}
