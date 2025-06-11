import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Conta !");
        int bankAccountNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite o código da Agência !");
        String bankCodeNumber = scanner.nextLine();
        System.out.println("Por favor, digite o seu Nome !");
        String name = scanner.nextLine();
        System.out.println("Por favor, digite o seu Saldo !");
        float amount = scanner.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu " +
                "saldo %s já está disponível para saque \n", name, bankCodeNumber, bankAccountNumber, amount);
    }
}