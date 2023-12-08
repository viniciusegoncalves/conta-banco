import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner inputDados = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        int numeroAgencia = inputDados.nextInt();

        System.out.println("Agora digite o número da Conta !");
        String numeroConta = inputDados.next();

        System.out.println("Insira o nome completo do cliente !");
        String nomeCliente = inputDados.next();

        System.out.println("Insira o saldo inicial da conta !");
        double saldoInicial = inputDados.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %s e seu saldo %.2f já está disponível para saque.", nomeCliente, numeroAgencia, numeroConta, saldoInicial);
    }
}
