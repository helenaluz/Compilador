package pkginterface.actions;

import pkginterface.utils.EditorUtils;

import javax.swing.*;
import java.io.*;


public class FileActionHandler {
    //TODO: novo arquivo, abrir arquivo, salvar arquivo

    public void openFile(JFrame parent, JTextArea editor) {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(parent);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            try {

                BufferedReader reader = new BufferedReader(new FileReader(selectedFile));
                editor.read(reader, null);
                EditorUtils.limpaAreaMsg();
                EditorUtils.atualizaStatus(selectedFile.getPath());

            } catch (IOException e) {
                // Tratar exceções
            }
            /*
            precisa ter:
             - o conteudo do arquivo no editor
             - chamar funcao para limpar a area de mensagens
             - chamar funcao para atualizar a barra de status(nome_arquivo)
             */
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
