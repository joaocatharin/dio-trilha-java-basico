public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        double salarioMinimo = 2500.28;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;       // Sem a palavra final, a variável poderá ser alterada por um outro valor
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14; // Assim, essa variável nunca poderá ser alterada.
        System.out.println(VALOR_DE_PI);


        /*int a, b;
        a = 5;
        b = 8;
        String resultado = "";

        if (a<b)
            System.out.println("Verdadeiro");

            else
                System.out.println("Falso"); */

    //  Ou posso fazer assim:
        
        int a, b;
        a = 7;
        b = 4;

        String resultado = a==b ? "verdadeiro" : "falso";  // Forma abreviada (Operador Ternário)

        // ou  int resultado = a>b ? 1:0;

        System.out.println(resultado);
        
    }
}
