package Compilador.Semantico;

import java.util.HashMap;
import java.util.Map;
import Compilador.Semantico.Actions.*;
import pkggals.SemanticError;
import pkggals.Token;

public class SemanticAnalyzer {
    private final Map<Integer, SemanticAction> actions = new HashMap<>();
    public final SemanticContext context = new SemanticContext();

    public SemanticAnalyzer() {
        actions.put(100, new Action100()); 
        actions.put(101, new Action101());
        actions.put(102, new Action102());//TODO: FIX
        actions.put(103,  new Action103());
        actions.put(104, new Action104());//TODO: FIX
        actions.put(130, new Action130());
        actions.put(106, new Action106());
        

        actions.put(105, new Action105());
    }

    public void executeAction(int action, Token token) throws SemanticError {
        SemanticAction semanticAction = actions.get(action);
        if (semanticAction != null) {
            semanticAction.execute(token, context);
        } else {
            throw new SemanticError("Ação #" + action + " não implementada");
        }
    }

    public String getGeneratedCode() {
        return context.getCodigoObjeto().toString();
    }
}
