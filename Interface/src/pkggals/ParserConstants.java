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
        { 170,   7,  37,   8, 171 },
        {  38,  32,  61 },
        {   0 },
        {  37 },
        {  39,  63 },
        {  68 },
        { 172 },
        {  33,  43, 173 },
        {   5, 174,  62 },
        {  31,  39 },
        {   0 },
        {  41 },
        {  44 },
        {  46 },
        {  50 },
        {  41 },
        {  44 },
        {  46 },
        {  50 },
        {  69 },
        {  39,  33,  43, 173 },
        {  14,  34,  42,  35 },
        {   6, 176,  31,   5, 175,  64 },
        {   5, 175,  64 },
        {  31,  42 },
        {   0 },
        {  15,  34,  45,  35 },
        {  16,  34,  45,  35, 177 },
        {  43, 178,  65 },
        {  31,  45 },
        {   0 },
        {   9,  43, 179,  47,  48, 180,  49, 181,   8 },
        {  40,  32,  66 },
        {   0 },
        {  47 },
        { 180,  10,  43, 182,  47,  48 },
        {   0 },
        {  11,  47 },
        {   0 },
        { 183,  17,  47,  67 },
        {  19,  43, 184 },
        {  18,  43, 185 },
        {  52,  51 },
        {   0 },
        {  20,  52, 186,  51 },
        {  21,  52, 187,  51 },
        {  53 },
        {  13, 188 },
        {  12, 189 },
        {  22,  52, 190 },
        {  56,  54 },
        {   0 },
        {  55, 191,  56, 192 },
        {  23 },
        {  24 },
        {  25 },
        {  26 },
        {  58,  57 },
        {   0 },
        {  27,  58, 193,  57 },
        {  28,  58, 194,  57 },
        {  60,  59 },
        {   0 },
        {  29,  60, 195,  59 },
        {  30,  60, 196,  59 },
        {   5, 197 },
        {   3, 198 },
        {   2, 199 },
        {   6, 200 },
        {  34,  43,  35 },
        {  27,  60 },
        {  28,  60, 201 }
    };

    String[] PARSER_ERROR =
    {
        "", //""
        "esperado FOP", //"Era esperado fim de programa"
        "esperado contante float", //"Era esperado constante_float"
        "esperado constante int", //"Era esperado constante_int"
        "esperado palavra reservada", //"Era esperado reservada"
        "esperado identificador", //"Era esperado identificador"
        "esperado constante string", //"Era esperado constante_string"
        "esperado main", //"Era esperado pr_main";
        "esperado end", //"Era esperado pr_end"
        "esperado if", //"Era esperado pr_if"
        "esperado elif", //"Era esperado pr_elif"
        "esperado else", //"Era esperado pr_else"
        "esperado false", //"Era esperado pr_false"
        "esperado true", //"Era esperado pr_true"
        "esperado read", //"Era esperado pr_read"
        "esperado write", //"Era esperado pr_write"
        "esperado writeln", //"Era esperado pr_writeln"
        "esperado repeat", //"Era esperado pr_repeat"
        "esperado until", //"Era esperado pr_until"
        "esperado while", //"Era esperado pr_while"
        "esperado &&", //"Era esperado \"&&\""
        "esperado ||", //"Era esperado \"||\""
        "esperado !", //"Era esperado \"!\""
        "esperado ==", //"Era esperado \"==\""
        "esperado !=", //"Era esperado \"!=\""
        "esperado <", //"Era esperado \"<\""
        "esperado >", //"Era esperado \">\""
        "esperado +", //"Era esperado \"+\""
        "esperado -", //"Era esperado \"-\""
        "esperado *", //"Era esperado \"*\""
        "esperado /", //"Era esperado \"/\""
        "esperado ,", //"Era esperado \",\""
        "esperado ;", //"Era esperado \";\""
        "esperado =", //"Era esperado \"=\""
        "esperado (", //"Era esperado \"(\""
        "esperado )", //"Era esperado \")\""
        "esperado main", //"<pograma> inválido"
        "esperado identificador if read write writeln repeat", //"<lista_de_instrucoes> inválido"
        "esperado identificador if read write writeln repeat", //"<instrucao> inválido"
        "esperado identificador", //"<lista_de_identificadores> inválido"
        "esperado identificador if read write writeln repeat", //"<comando> inválido"
        "esperado read", //"<entrada_dados> inválido"
        "esperado identificador", //"<lista_de_entrada> inválido"
        "esperado expressão", //"<expressao> inválido"
        "esperado write writeln", //"<saida_dados> inválido"
        "esperado constante_float constante_int identificador contante_string false true ! + - (", //"<lista_de_expressao> inválido"
        "esperado if", //"<selecao> inválido"
        "esperado identificador if read write writeln repeat", //"<lista_de_comandos> inválido"
        "esperado end elif else", //"<selecao_elif> inválido"
        "esperado end else", //"<selecao_else> inválido"
        "esperado repeat", //"<repeticao> inválido"
        "esperado expressão", //"<expressao1> inválido"
        "esperado expressão", //"<elemento> inválido"
        "esperado expressão", //"<relacional> inválido"
        "esperado expressão", //"<relacional1> inválido"
        "esperado == != < >", //"<operador_relacional> inválido"
        "esperado expressão", //"<aritmetica> inválido"
        "esperado expressão", //"<aritmetica1> inválido"
        "esperado expressão", //"<termo> inválido"
        "esperado expressão", //"<termo1> inválido"
        "esperado expressão", //"<fator> inválido"
        "esperado identificador end if read write writeln repeat", //"<lista_de_instrucoes1> inválido"
        "esperado , ; =", //"<lista_de_identificadores1> inválido"
        "esperado ; =", //"<instrucao1> inválido"
        "esperado , )", //"<lista_de_entrada1> inválido"
        "esperado , )", //"<lista_de_expressao1> inválido"
        "esperado identificador if elif else end", //"<lista_de_comandos1> inválido"
        "esperado read write writeln repeat until while", //"<repeticao1> inválido"
        "esperado if read write writeln repeat", //"<comando1> inválido"
        "esperado identificador" //"<atribuicao> inválido"
    };
}
