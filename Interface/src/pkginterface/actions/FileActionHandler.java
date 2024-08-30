package pkginterface.actions;

import java.awt.Component;

import javax.swing.*;
import java.io.*;
import javax.swing.filechooser.FileNameExtensionFilter;


public class FileActionHandler {
    
    public static File openFile(Component parent, JTextArea editor) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
        String currentEditorContent = editor.getText();
        int result = fileChooser.showOpenDialog(parent);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                editor.read(reader, null);
                return selectedFile.getAbsoluteFile(); 
            } catch (IOException e) {
                JOptionPane.showMessageDialog(parent, "Erro ao abrir o arquivo.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {        
            editor.setText(currentEditorContent);
            return null; 
        }
        return null;
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

    public static String criarSalvarArquivo(JTextArea conteudo) {     
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


    public static String salvar(JTextArea conteudo, File arquivo){
      String caminho = arquivo.getAbsolutePath();
       if((conteudo != null) && arquivo.exists()){            
           atualizaArquivo(arquivo, conteudo);
      }else{
          caminho = criarSalvarArquivo(conteudo);
      }       
        return caminho;
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
