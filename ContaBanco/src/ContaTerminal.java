import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Por favor, digite o número da conta corrente:");
        int conta = scanner.nextInt();
        scanner.nextLine(); // Consumir o caractere de nova linha
        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o saldo da conta corrente:");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.%n", 
                          nome, agencia, conta, saldo);

        scanner.close();
    }
}