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
        actions.put(102, new Action102());
        actions.put(103,  new Action103());
        actions.put(104, new Action104());
        actions.put(105, new Action105());
        actions.put(106, new Action106());
        actions.put(107, new Action107());
        actions.put(108, new Action108());
        actions.put(109, new Action109());
        actions.put(110, new Action110());
        actions.put(111, new Action111());
        actions.put(112, new Action112());
        actions.put(113, new Action113());
        actions.put(114, new Action114());
        actions.put(115, new Action115());
        actions.put(116, new Action116());     
        actions.put(117, new Action117());
        actions.put(118, new Action118());
        actions.put(119, new Action119());
        actions.put(120, new Action120());
        actions.put(121, new Action121());
        actions.put(122, new Action122());
        actions.put(123, new Action123());
        actions.put(124, new Action124());
        actions.put(125, new Action125());
        actions.put(126, new Action126());
        actions.put(127, new Action127());
        actions.put(128, new Action128());
        actions.put(129, new Action129());
        actions.put(130, new Action130());        
        
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
