
package Compilador;


import java.io.StringReader;
import pkggals.*;
import javax.swing.*;

public class AnalisadorLexico {
    
    public String AnaisadorLexico(String input){
        
        Lexico lexico = new Lexico();
        StringBuilder sb = new StringBuilder();
        
        lexico.setInput(input);
        
        sb.append(String.format("%-7s %-30s %-100s\n", "Linha", "Classe", "Lexema"));
        
        try {
            Token t = null;
            
            while ( (t = lexico.nextToken()) != null ) {
                
                int posicao = t.getPosition();
                int linha = obterLinha(input, posicao);
                var classe = obterTipoToken(t.getId());
                String lexema = t.getLexeme();
                
                sb.append(String.format("%-10d %-30s %-100s\n", linha, classe, lexema));
              // esse código apresenta os tokens enquanto não ocorrer erro
              // no entanto, os tokens devem ser apresentados SÓ se não ocorrer erro, necessário adaptar 
             // para atender o que foi solicitado		   
            }
            
            sb.append("\nPrograma compilado com sucesso!");
        }
        catch ( LexicalError e ) {  
            int posicao = e.getPosition();
            int linha = obterLinha(input, posicao);
            return ("Linha "+linha+": "+e.getMessage());
          // e.getMessage() - retorna a mensagem de erro de SCANNER_ERRO (olhar ScannerConstants.java 
          // e adaptar conforme o enunciado da parte 2)
         } 
        
        return sb.toString();
    }
    
    private static String obterTipoToken(int id) {

        int[] idsSimbolosEspeciais = {20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35};
        
        for (int simbolo : idsSimbolosEspeciais) {
            if (id == simbolo) {
                return "simbolo especial";
            }
        }
    
        switch (id) {
            case 2:
                return "constante_float";
            case 3:
                return "constante_int";
            case 4:
                return "reservada";
            case 5:
                return "identificador";
            case 6:
                return "constante_string";
            case 7:
                return "pr_main";
            case 8:
                return "pr_end";
            case 9:
                return "pr_if";
            case 10:
                return "pr_elif";
            case 11:
                return "pr_else";
            case 12:
                return "pr_false";
            case 13:
                return "pr_true";
            case 14:
                return "pr_read";
            case 15:
                return "pr_write";
            case 16:
                return "pr_writeln";
            case 17:
                return "pr_repeat";
            case 18:
                return "pr_until";
            case 19:
                return "pr_while";
            default:
                return "token_desconhecido";
        }
    }

    private static int obterLinha(String input, int posicao) {
        String substring = input.substring(0, posicao);
    
        int linha = 1; 
        for (char c : substring.toCharArray()) {
            if (c == '\n') {
                linha++;
            }
        }
        return linha;
    }
}
