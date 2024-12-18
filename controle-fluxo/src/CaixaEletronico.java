public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 50.0;
        double valorSolicitado = 26.0;

        if (valorSolicitado <= saldo) {
            saldo = saldo - valorSolicitado;

            System.out.println(saldo);

        } else {
        System.out.println("Valor solicitado maior que o disponível!");
     }
    }
}