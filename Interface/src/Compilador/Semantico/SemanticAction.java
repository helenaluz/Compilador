package Compilador.Semantico;

import pkggals.*;

public interface SemanticAction {
    void execute(Token token, SemanticContext context) throws SemanticError;
}
