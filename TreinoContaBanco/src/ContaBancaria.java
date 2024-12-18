import java.util.Scanner;

public class ContaBancaria {
    public int numConta;
    public int agencia;
    public String nomeCliente;
    public double saldo;


    // Método Construtor
    public ContaBancaria(int numConta, int agencia, String nomeCliente, double saldo) {
        this.numConta = numConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }
    
    // Métodos getters
    public int getNumConta() {
        return numConta;
    }
    public int getAgencia() {
        return agencia;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public double getSaldo() {
        return saldo;
    }

    // Métodos setters
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    

    // Metodos para exibir informações da conta
    public void exibirInformacoes() {
        System.out.println("Número da conta: " + numConta);
        System.out.println("Número da agência: " + agencia);
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("saldo da conta: " + saldo);
    }


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numConta = sc.nextInt();

        System.out.println("Digite o número da agência: ");
        int agencia = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Digite o saldo inicial: ");
        double saldo = sc.nextDouble();

       

       // Criar uma instância de conta bancária
       ContaBancaria conta = new ContaBancaria(numConta, agencia, nomeCliente, saldo);

       // Exibir as informações da conta
       System.out.println("---------------Informações da Conta Bancária---------------");
       conta.exibirInformacoes();

       sc.close();
    
    }
    }
