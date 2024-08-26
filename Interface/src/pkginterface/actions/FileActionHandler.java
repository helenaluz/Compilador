package pkginterface.actions;

import java.awt.Component;

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
                //EditorUtils.limpaAreas();

                // Atualiza a barra de status com o nome do arquivo
                //EditorUtils.atualizaStatus(selectedFile.getPath());

            } catch (IOException e) {
                // Tratar possíveis exceções de leitura de arquivo
                JOptionPane.showMessageDialog(parent, "Erro ao abrir o arquivo.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Nenhum arquivo foi selecionado, restaura o conteúdo anterior do editor
            editor.setText(currentEditorContent);
        }
    }

  
      private static boolean atualizaArquivo(File arquivo, JTextArea conteudo) {
        try (FileWriter escrever = new FileWriter(arquivo)) {
            escrever.write(conteudo.getText()); 
            return true;
        } catch (IOException e) {
            System.out.println("Não foi possível atualizar o conteúdo do arquivo.");
            e.printStackTrace();
            return false; 
        }
    }



    public static String  criarSalvarArquivo(JTextArea conteudo) {     
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Escolha o local e o nome do arquivo");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int selecaoUsuario = fileChooser.showSaveDialog(null);

        if (selecaoUsuario == JFileChooser.APPROVE_OPTION) {
            fileChooser.setDialogTitle("Escolha o local e o nome do arquivo");
            File arquivo = fileChooser.getSelectedFile();
            
            if (!arquivo.getName().endsWith(".txt")) {
                arquivo = new File(arquivo.getAbsolutePath() + ".txt");
            }
                        
            try {
                if (arquivo.createNewFile() || arquivo.exists()) {
                    if (atualizaArquivo(arquivo, conteudo)) {
                        return arquivo.getAbsolutePath();
                    } else {
                        return null; 
                    }
                } else {
                    System.out.println("Não foi possível criar o arquivo.");
                    return null; 
                }
            } catch (IOException e) {
                System.out.println("Falha ao criar o arquivo.");
                e.printStackTrace();
                return null;
            }
        }
        return null; 
    }


    public static void salvar(JTextArea conteudo, File existeArquivo){
       if(existeArquivo != null || existeArquivo.exists()){
           atualizaArquivo(existeArquivo, conteudo);
      }else{
           criarSalvarArquivo(conteudo);
      }    
   
    }
        
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
