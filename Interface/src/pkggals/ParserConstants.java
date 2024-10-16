package pkggals;

public interface ParserConstants
{
    int START_SYMBOL = 36;

    int FIRST_NON_TERMINAL    = 36;
    int FIRST_SEMANTIC_ACTION = 70;

    int[][] PARSER_TABLE =
    {
        { -1, -1, -1, -1, -1, -1,  0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1,  1, -1, -1, -1,  1, -1, -1, -1, -1,  1,  1,  1,  1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1,  4, -1, -1, -1,  5, -1, -1, -1, -1,  5,  5,  5,  5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1,  8, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, 19, -1, -1, -1, 17, -1, -1, -1, -1, 15, 16, 16, 18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 21, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, 23, 22, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 42, 42, -1, 42, 42, -1, -1, -1, -1, -1, 42, 42, -1, -1, -1, -1, -1, -1, -1, -1, 42, -1, -1, -1, -1, 42, 42, -1, -1, -1, -1, -1, 42, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 26, 27, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 28, 28, -1, 28, 28, -1, -1, -1, -1, -1, 28, 28, -1, -1, -1, -1, -1, -1, -1, -1, 28, -1, -1, -1, -1, 28, 28, -1, -1, -1, -1, -1, 28, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, 32, -1, -1, -1, 32, -1, -1, -1, -1, 32, 32, 32, 32, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, 36, -1, 35, 36, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 39, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, 43, -1, -1, -1, 43, -1, -1, -1, -1, 43, 43, 43, 43, -1, -1, 44, 45, -1, -1, -1, -1, -1, -1, -1, -1, -1, 43, 43, -1, -1, 43 },
        { -1, 46, 46, -1, 46, 46, -1, -1, -1, -1, -1, 48, 47, -1, -1, -1, -1, -1, -1, -1, -1, 49, -1, -1, -1, -1, 46, 46, -1, -1, -1, -1, -1, 46, -1 },
        { -1, 50, 50, -1, 50, 50, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 50, 50, -1, -1, -1, -1, -1, 50, -1 },
        { -1, -1, -1, -1, 51, -1, -1, -1, 51, -1, -1, -1, -1, 51, 51, 51, 51, -1, -1, 51, 51, -1, 52, 52, 52, 52, -1, -1, -1, -1, 51, 51, -1, -1, 51 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 53, 54, 55, 56, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 57, 57, -1, 57, 57, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 57, 57, -1, -1, -1, -1, -1, 57, -1 },
        { -1, -1, -1, -1, 58, -1, -1, -1, 58, -1, -1, -1, -1, 58, 58, 58, 58, -1, -1, 58, 58, -1, 58, 58, 58, 58, 59, 60, -1, -1, 58, 58, -1, -1, 58 },
        { -1, 61, 61, -1, 61, 61, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 61, 61, -1, -1, -1, -1, -1, 61, -1 },
        { -1, -1, -1, -1, 62, -1, -1, -1, 62, -1, -1, -1, -1, 62, 62, 62, 62, -1, -1, 62, 62, -1, 62, 62, 62, 62, 62, 62, 63, 64, 62, 62, -1, -1, 62 },
        { -1, 67, 66, -1, 65, 68, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 70, 71, -1, -1, -1, -1, -1, 69, -1 },
        { -1, -1, -1, -1,  3, -1, -1,  2,  3, -1, -1, -1, -1,  3,  3,  3,  3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  9, 10, 10, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  6,  7, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 24, -1, -1, -1, 25 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 29, -1, -1, -1, 30 },
        { -1, -1, -1, -1, 34, -1, -1, 33, 34, 33, 33, -1, -1, 34, 34, 34, 34, 33, 33, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 41, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 11, 12, 12, 14, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
    };

    int[][] PRODUCTIONS = 
    {
        {  7, 37,  8 },
        { 38, 32, 61 },
        {  0 },
        { 37 },
        { 39, 63 },
        { 68 },
        {  0 },
        { 33, 43 },
        {  5, 62 },
        { 31, 39 },
        {  0 },
        { 41 },
        { 44 },
        { 46 },
        { 50 },
        { 41 },
        { 44 },
        { 46 },
        { 50 },
        { 69 },
        { 39, 33, 43 },
        { 14, 34, 42, 35 },
        {  6, 31,  5, 64 },
        {  5, 64 },
        { 31, 42 },
        {  0 },
        { 15, 34, 45, 35 },
        { 16, 34, 45, 35 },
        { 43, 65 },
        { 31, 45 },
        {  0 },
        {  9, 43, 47, 48, 49,  8 },
        { 40, 32, 66 },
        {  0 },
        { 47 },
        { 10, 43, 47, 48 },
        {  0 },
        { 11, 47 },
        {  0 },
        { 17, 47, 67 },
        { 19, 43 },
        { 18, 43 },
        { 52, 51 },
        {  0 },
        { 20, 52, 51 },
        { 21, 52, 51 },
        { 53 },
        { 13 },
        { 12 },
        { 22, 52 },
        { 56, 54 },
        {  0 },
        { 55, 56 },
        { 23 },
        { 24 },
        { 25 },
        { 26 },
        { 58, 57 },
        {  0 },
        { 27, 58, 57 },
        { 28, 58, 57 },
        { 60, 59 },
        {  0 },
        { 29, 60, 59 },
        { 30, 60, 59 },
        {  5 },
        {  3 },
        {  2 },
        {  6 },
        { 34, 43, 35 },
        { 27, 60 },
        { 28, 60 }
    };

    String[] PARSER_ERROR =
    {
        "",
        "esperado FOP",
        "esperado contante float",
        "esperado constante int",
        "esperado palavra reservada",
        "esperado identificador",
        "esperado constante string",
        "esperado main",
        "esperado end",
        "esperado if",
        "esperado elif",
        "esperado else",
        "esperado false",
        "esperado true",
        "esperado read",
        "esperado write",
        "esperado writeln",
        "esperado repeat",
        "esperado until",
        "esperado while",
        "esperado &&",
        "esperado ||",
        "esperado !",
        "esperado ==",
        "esperado !=",
        "esperado <",
        "esperado >",
        "esperado +",
        "esperado -",
        "esperado *",
        "esperado /",
        "esperado ,",
        "esperado ;",
        "esperado =",
        "esperado (",
        "esperado )",
        "esperado main",
        "esperado identificador if read write writeln repeat",
        "esperado identificador if read write writeln repeat",
        "esperado identificador",
        "esperado identificador if read write writeln repeat",
        "esperado read",
        "esperado identificador",
        "esperado expressão",
        "esperado write writeln",
        "esperado constante_float constante_int identificador contante_string false true ! + - (",
        "esperado if",
        "esperado identificador if read write writeln repeat",
        "esperado end elif else",
        "esperado end else",
        "esperado repeat",
        "esperado expressão",
        "esperado expressão",
        "esperado expressão",
        "esperado expressão",
        "esperado == != < >",
        "esperado expressão",
        "esperado expressão",
        "esperado expressão",
        "esperado expressão",
        "esperado expressão",
        "esperado identificador end if read write writeln repeat",
        "esperado , ; =",
        "esperado ; =",
        "esperado , )",
        "esperado , )",
        "esperado identificador if elif else end",
        "esperado read write writeln repeat until while",
        "esperado if read write writeln repeat",
        "esperado identificador"
    };
}
