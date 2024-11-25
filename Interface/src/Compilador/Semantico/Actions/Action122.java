package Compilador.Semantico.Actions;

import Compilador.Semantico.SemanticAction;
import Compilador.Semantico.SemanticContext;
import pkggals.SemanticError;
import pkggals.Token;

public class Action122 implements SemanticAction{

    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {

        if (context.getPilhaTipos().size() < 2) {
            throw new SemanticError("Erro: Não há tipos suficientes na pilha para realizar a operação.", token.getPosition());
        }

        String tipo1 = context.getPilhaTipos().pop();
        String tipo2 = context.getPilhaTipos().pop();

        String operadorRelacional = context.getOperadorRelacional();

        String tipoResultante = retornaTipoResultante(tipo1, tipo2, operadorRelacional);
        context.getPilhaTipos().push(tipoResultante);

        String codigoIL = retornaCodigoIL(operadorRelacional);
        context.appendCodigoObjeto(codigoIL + "\n");

    }

    public String retornaTipoResultante(String tipo1, String tipo2, String operador) throws SemanticError {
        switch (operador) {
            case "+":
            case "-":
            case "*":
                if (tipo1.equals("int64") && tipo2.equals("int64")) return "int64";
                if ((tipo1.equals("int64") && tipo2.equals("float64")) ||
                    (tipo1.equals("float64") && tipo2.equals("int64")) ||
                    (tipo1.equals("float64") && tipo2.equals("float64"))) {
                    return "float64";
                }
                break;

            case "/":
                if ((tipo1.equals("int64") || tipo1.equals("float64")) &&
                    (tipo2.equals("int64") || tipo2.equals("float64"))) {
                    return "float64";
                }
                break;

            case "==":
            case "!=":
            case "<":
            case ">":
                if ((tipo1.equals("int64") && tipo2.equals("int64")) ||
                    (tipo1.equals("float64") && tipo2.equals("float64")) ||
                    (tipo1.equals("string") && tipo2.equals("string"))) {
                    return "bool";
                }
                break;

            case "!":
                if (tipo1.equals("bool") && tipo2.equals("")) return "bool";
                break;

            case "&&":
            case "||":
                if (tipo1.equals("bool") && tipo2.equals("bool")) return "bool";
                break;
        }

        throw new SemanticError("Erro: Operação inválida entre tipos: " + tipo1 + " " + operador + " " + tipo2);
    }

    public String retornaCodigoIL(String operador) throws SemanticError {
        switch (operador) {
            case "+":
                return "add";  
            case "-":
                return "sub"; 
            case "*":
                return "mul";  
            case "/":
                return "div";  
            case "==":
                return "ceq";  
            case "!=":
                return "cne";  
            case "<":
                return "clt";  
            case ">":
                return "cgt";  
            case "&&":
                return "and"; 
            case "||":
                return "or";   
            case "!":
                return "not"; 
            default:
                throw new SemanticError("Erro: Operador não suportado para geração de código IL: " + operador);
        }
    
    }
}
