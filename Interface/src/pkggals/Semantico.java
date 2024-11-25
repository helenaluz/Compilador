package pkggals;

import Compilador.Semantico.SemanticAnalyzer;

public class Semantico implements Constants
{
    SemanticAnalyzer analizador = new SemanticAnalyzer();
    
    public void executeAction(int action, Token token)	throws SemanticError
    {
        analizador.executeAction(action, token);
        System.out.println("Ação #"+action+", Token: "+token);
    }	
}
