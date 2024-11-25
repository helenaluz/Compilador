package Compilador;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;

public class GeradorArquivoIL {
    
    private static final String CABECALHO = 
        ".assembly extern mscorlib {}\n" +
        ".assembly _codigo_objeto{}\n" +
        ".module _codigo_objeto.exe\n" +
        ".class public UNICA{\n" +
        ".method static public void _principal() {\n" +
        ".entrypoint\n";

    private static final String RODAPE = 
        "ret\n" +
        "}\n" +
        "}\n";

    public static void gerarArquivo(String corpo, String caminhoArquivo) {
        String arquivoCaminhoCompleto = "";
        
        if (caminhoArquivo == null || caminhoArquivo.isBlank()) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Selecione o local para salvar o arquivo");
            
            int userSelection = fileChooser.showSaveDialog(null);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                arquivoCaminhoCompleto = fileChooser.getSelectedFile().getAbsolutePath();

                if (!fileChooser.getSelectedFile().getName().endsWith(".il")) {
                    arquivoCaminhoCompleto = fileChooser.getSelectedFile().getAbsolutePath() + ".il";
            }
            } else {
                System.out.println("Nenhum arquivo selecionado. Operação cancelada.");
                return; 
            }
        }

        else{
            arquivoCaminhoCompleto = caminhoArquivo.replace(".txt", ".il");
        }
        
        try (FileWriter writer = new FileWriter(arquivoCaminhoCompleto)) {
           // writer.write(CABECALHO);
            writer.write(corpo);
            //writer.write(RODAPE);
            System.out.println("Arquivo gerado com sucesso em " + arquivoCaminhoCompleto);
        } catch (IOException e) {
            System.err.println("Erro ao gerar o arquivo: " + e.getMessage());
        }
    }
}
