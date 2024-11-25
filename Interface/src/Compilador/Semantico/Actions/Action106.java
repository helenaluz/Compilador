package Compilador.Semantico.Actions;
import Compilador.Semantico.SemanticAction;
import Compilador.Semantico.SemanticContext;
import pkggals.SemanticError;
import pkggals.Token;

public class Action106 implements SemanticAction {

    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
     
        if (context == null || context.getPilhaTipos() == null || context.getCodigoObjeto() == null) {
            throw new SemanticError("Contexto semântico inválido para a ação #106.");
        }      
        String lexeme = token.getLexeme();
     
        if (lexeme == null || lexeme.isEmpty()) {
            throw new SemanticError("Valor inválido para constante string: " + lexeme, token.getPosition());
        }
        context.getPilhaTipos().push("string");
    
        String codigo = "ldstr \"" + lexeme + "\""; 
        context.appendCodigoObjeto(codigo);

        context.appendCodigoObjeto("call void [mscorlib]System.Console::Write(string)");

        System.out.println("Ação #106 executada: carregada a constante string '" + lexeme + "' e código gerado '" + codigo + "'");
    }
}
