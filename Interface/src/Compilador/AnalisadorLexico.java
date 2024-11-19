package Compilador;

import java.io.StringReader;
import java.util.Arrays;
import java.util.Objects;
import pkggals.*;
import javax.swing.*;

public class AnalisadorLexico {

    public String AnaisadorLexico(String input) {

        Lexico lexico = new Lexico();
        Sintatico sintatico = new Sintatico();
        Semantico semantico = new Semantico();
        StringBuilder sb = new StringBuilder();
        StringReader reader = new StringReader(input);
        
        lexico.setInput(reader);
        

        try {
            lexico(lexico, input);
            sintatico.parse(lexico, semantico);
            sb.append("Programa compilado com sucesso!");
            
        } catch (LexicalError e) {
            
            int posicao = e.getPosition();
            int linha = obterLinha(input, posicao);
            String mensagemOriginal = e.getMessage();

            String[] palavrasMensagem = mensagemOriginal.split(" ");
            String primeiraPalavra = palavrasMensagem.length > 0 ? palavrasMensagem[0] : "";

            String[] palavrasEscolhidas = {"palavra", "símbolo", "identificador"};

            String mensagem = "Erro na linha " + linha + " - ";
            String lexema = obterLexemaNaPosicao(input, posicao);
            
            if (Arrays.asList(palavrasEscolhidas).contains(primeiraPalavra)) {
                mensagem += lexema + " " + mensagemOriginal;
            }
            else {
                mensagem += mensagemOriginal;
            }
            
            return mensagem;
        } catch (SyntaticError e) {
            int posicao = e.getPosition();
            int linha = obterLinha(input, posicao);
            String mensagemOriginal = e.getMessage();
            String mensagem = "Erro na linha " + linha + " - ";
            String lexemaTemp = obterLexemaNaPosicao(input, posicao);
            String zoada = identificaConstante(lexemaTemp);
            String lexema = "";
            
            if(zoada== null && lexemaTemp != null && !lexemaTemp.trim().isEmpty()){
                lexema = lexemaTemp;
            } 
            else if(zoada != null) lexema = zoada;
            else lexema = "EOF";
                
            mensagem += lexema + " " + mensagemOriginal;
            return mensagem;
            
        } catch (SemanticError e) {
            //Trata erros semânticos
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
             case 8:  
             case 9: 
             case 10: 
             case 11: 
             case 12: 
             case 13: 
             case 14: 
             case 15: 
             case 16:
             case 17:
             case 18: 
             case 19: 
                return "reservada";
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

    public static String obterLexemaNaPosicao(String input, int posicao) {
        int start = posicao;

        while (start < input.length() && Character.isWhitespace(input.charAt(start))) {
            start++;
        }

        if (start < input.length() && input.charAt(start) == '\"') {
            int end = start + 1;
            while (end < input.length() && input.charAt(end) != '\"') {
                end++;
            }
            if (end < input.length()) {
                end++;
            }
            return input.substring(start, end);

        } else {
            int end = start;
            while (end < input.length() && !Character.isWhitespace(input.charAt(end))) {
                end++;
            }
            return input.substring(start, end);
        }
    }


        public static String identificaConstante(String input) {
        if (input.matches("^\".*\"$")) {
            return "constante_string";}
        
        return null;
        }
    
        
    private void lexico(Lexico lexico, String input) throws LexicalError {
        Token t = null;

        while ((t = lexico.nextToken()) != null) {

            int posicao = t.getPosition();
            int linha = obterLinha(input, posicao);
            String classe = obterTipoToken(t.getId());
            String lexema = t.getLexeme();

            if (classe.equals("reservada")) {
                throw new LexicalError("palavra reservada inválida", posicao);
            }

            // sb.append(String.format("%-10d %-30s %-100s\n", linha, classe, lexema));
            // esse código apresenta os tokens enquanto não ocorrer erro
            // no entanto, os tokens devem ser apresentados SÓ se não ocorrer erro, necessário adaptar 
            // para atender o que foi solicitado		   
        }
    }
}
