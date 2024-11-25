package Compilador.Semantico;

import java.util.HashMap;
import java.util.Map;
import Compilador.Semantico.Actions.*;
import pkggals.SemanticError;
import pkggals.Token;

public class SemanticAnalyzer {
    private final Map<Integer, SemanticAction> actions = new HashMap<>();
    private final SemanticContext context = new SemanticContext();

    public SemanticAnalyzer() {
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
