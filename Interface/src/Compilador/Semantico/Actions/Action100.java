package Compilador.Semantico.Actions;

import Compilador.Semantico.SemanticAction;
import Compilador.Semantico.SemanticContext;
import pkggals.SemanticError;
import pkggals.Token;

public class Action100 implements SemanticAction{

    @Override
    public void execute(Token token, SemanticContext context) throws SemanticError {
        String cabecalho = 
        ".assembly extern mscorlib {}\n" +
        ".assembly _codigo_objeto{}\n" +
        ".module _codigo_objeto.exe\n" +
        ".class public UNICA{\n" +
        ".method static public void _principal() {\n" +
        ".entrypoint\n";

        context.appendCodigoObjeto(cabecalho);
    }
    
}
