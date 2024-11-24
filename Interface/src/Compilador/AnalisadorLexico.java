package Compilador;

import java.io.StringReader;
import java.util.Arrays;
import pkggals.*;

public class AnalisadorLexico {

    public String analisarLexico(String input) {
        Lexico lexico = new Lexico();
        Sintatico sintatico = new Sintatico();
        Semantico semantico = new Semantico();
        StringBuilder sb = new StringBuilder();
        
        lexico.setInput(new StringReader(input));

        try {
            processarLexico(lexico, input);
            sintatico.parse(lexico, semantico);
            sb.append("Programa compilado com sucesso!");

        } catch (LexicalError e) {
            return tratarErroLexico(e, input);

        } catch (SyntaticError e) {
            return tratarErroSintatico(e, input);

        } catch (SemanticError e) {
            // Tratamento de erros semânticos, se necessário
        }

        return sb.toString();
    }

    private String tratarErroLexico(LexicalError e, String input) {
        int posicao = e.getPosition();
        int linha = obterLinha(input, posicao);
        String mensagemOriginal = e.getMessage();
        String lexema = obterLexemaNaPosicao(input, posicao);

        String[] palavrasEscolhidas = {"palavra", "símbolo", "identificador"};
        String mensagem = "Erro na linha " + linha + " - ";
        if (Arrays.asList(palavrasEscolhidas).contains(mensagemOriginal.split(" ")[0])) {
            mensagem += lexema + " " + mensagemOriginal;
        } else {
            mensagem += mensagemOriginal;
        }
        
        return mensagem;
    }

    private String tratarErroSintatico(SyntaticError e, String input) {
        int posicao = e.getPosition();
        int linha = obterLinha(input, posicao);
        String mensagemOriginal = e.getMessage();
        String lexemaTemp = obterLexemaNaPosicao(input, posicao);
        String constanteString = identificaConstanteString(lexemaTemp);
        
        String lexema = (constanteString == null && lexemaTemp != null && !lexemaTemp.trim().isEmpty()) 
                        ? lexemaTemp 
                        : (constanteString != null ? constanteString : "EOF");

        return "Erro na linha " + linha + " - " + lexema + " " + mensagemOriginal;
    }

    private static String obterTipoToken(int id) {
        if (id >= 20 && id <= 35) return "simbolo especial";
        return switch (id) {
            case 2 -> "constante_float";
            case 3 -> "constante_int";
            case 4 -> "reservadaX";
            case 5 -> "identificador";
            case 6 -> "constante_string";
            case 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 -> "reservada";
            default -> "token_desconhecido";
        };
    }

    private static int obterLinha(String input, int posicao) {
        return (int) input.substring(0, posicao).chars().filter(c -> c == '\n').count() + 1;
    }

    public static String obterLexemaNaPosicao(String input, int posicao) {
        int start = posicao;
        while (start < input.length() && Character.isWhitespace(input.charAt(start))) start++;
        
        if (start < input.length() && input.charAt(start) == '\"') {
            int end = input.indexOf('\"', start + 1);
            return end >= 0 ? input.substring(start, end + 1) : input.substring(start);
        } else {
            int end = start;
            while (end < input.length() && !Character.isWhitespace(input.charAt(end))) end++;
            return input.substring(start, end);
        }
    }

    public static String identificaConstanteString(String input) {
        return input.matches("^\".*\"$") ? "constante_string" : null;
    }

    private void processarLexico(Lexico lexico, String input) throws LexicalError {
        Token token;
        while ((token = lexico.nextToken()) != null) {
            int posicao = token.getPosition();
            String classe = obterTipoToken(token.getId());
            
            if ("reservadaX".equals(classe)) {
                throw new LexicalError("palavra reservada inválida", posicao);
            }
        }
    }
}
