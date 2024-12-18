import java.util.Scanner;

public class ContaTerminal {
    private int numeroConta;
    private int agencia;
    private String nomeCliente;
    private double saldo;

    // Construtor
    public ContaTerminal(int numeroConta, int agencia, String nomeCliente, double saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    // Método para exibir informações da conta
    public void exibirInformacoes() {
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Saldo: " + saldo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar ao usuário que insira os dados da conta bancária
        System.out.println("Digite o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Digite a agência: ");
        int agencia = sc.nextInt();
        sc.nextLine(); // Consumir a nova linha deixada pelo nextInt()

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Digite o saldo inicial: ");
        double saldo = sc.nextDouble();

        // Criar uma instância de ContaBancaria
        ContaTerminal conta = new ContaTerminal(numeroConta, agencia, nomeCliente, saldo);

        // Exibir as informações da conta
        System.out.println("\nInformações da Conta Bancária: ");
        conta.exibirInformacoes();

        sc.close();
    }
}

