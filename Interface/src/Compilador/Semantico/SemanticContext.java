package Compilador.Semantico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
public class SemanticContext {

    private String operadorRelacional = "";
    private StringBuilder codigoObjeto = new StringBuilder();
    private Stack<String> pilhaTipos = new Stack<>();
    private Stack<String> pilhaRotulos = new Stack<>();
    private List<String> listaIdentificadores = new ArrayList<>();
    private Map<String, String> tabelaSimbolos = new HashMap<>();

    public String getOperadorRelacional() {
        return operadorRelacional;
    }
    public void setOperadorRelacional(String operadorRelacional) {
        this.operadorRelacional = operadorRelacional;
    }
    public StringBuilder getCodigoObjeto() {
        return codigoObjeto;
    }
    public void setCodigoObjeto(StringBuilder codigoObjeto) {
        this.codigoObjeto = codigoObjeto;
    }

    public void appendCodigoObjeto(String codigo){
        this.codigoObjeto.append(codigo);
    }
    
    public Stack<String> getPilhaTipos() {
        return pilhaTipos;
    }
    public void setPilhaTipos(Stack<String> pilhaTipos) {
        this.pilhaTipos = pilhaTipos;
    }
    public Stack<String> getPilhaRotulos() {
        return pilhaRotulos;
    }
    public void setPilhaRotulos(Stack<String> pilhaRotulos) {
        this.pilhaRotulos = pilhaRotulos;
    }
    public List<String> getListaIdentificadores() {
        return listaIdentificadores;
    }
    public void setListaIdentificadores(List<String> listaIdentificadores) {
        this.listaIdentificadores = listaIdentificadores;
    }

    public void addListaIdentificadores(String indentificador){
        this.listaIdentificadores.add(indentificador);
    }

    public Map<String, String> getTabelaSimbolos() {
        return tabelaSimbolos;
    }
    public void setTabelaSimbolos(Map<String, String> tabelaSimbolos) {
        this.tabelaSimbolos = tabelaSimbolos;
    }
}
