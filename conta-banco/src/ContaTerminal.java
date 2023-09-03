import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;    

        System.out.println("-----ContaBancaria----- (4025)");
        System.out.println("Por favor, digite o número da conta: (4025)");
        numero = sc.nextInt();
        System.out.println("Por favor, digite o número da Agência: (081-0)");
        agencia = sc.nextLine();
        System.out.println("Informe seu Nome: (Joao Simpson)");
        nomeCliente = sc.nextLine();
        System.out.println("Informe seu Saldo Atual (20.20):");
        saldo = sc.nextDouble();
        System.out.println();
        System.out.printf("Olá JoaoSimpson%s, obrigado por criar uma conta em nosso banco. Sua agência é 081-0%s, conta 4025%d e seu saldo 20.20%.2f já está disponível para saque.\n",
            nomeCliente, agencia, numero, saldo);

            sc.close();
    }
}