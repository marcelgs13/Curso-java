import java.util.Scanner;
import entities.Conta;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double saldo = 0;

        System.out.print("Enter account number: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        String resposta = sc.nextLine();

        while (!resposta.equals("y") && !resposta.equals("n")) {
            System.out.print("Is there an initial deposit (y/n)? ");
            resposta = sc.nextLine();
        }
        if (resposta.equals("y")) {
            System.out.print("Enter initial deposit value: ");
            saldo = sc.nextDouble();
            System.out.println();
        }
        System.out.println(); // QUEBRA DE LINHA

        Conta conta = new Conta(numero, name, saldo);

        System.out.println("Account data:");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", conta.getNumero(), conta.getName(), conta.getSaldo());
        System.out.println();; //QUEBRA DE LINHA

        System.out.print("Enter a deposit value: ");
        saldo = sc.nextDouble();
        conta.depositoSaldo(saldo);

        System.out.println("Updated account data:");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", conta.getNumero(), conta.getName(), conta.getSaldo());
        System.out.println();// QUEBRA DE LINHA
        System.out.print("Enter a withdraw value: ");
        saldo = sc.nextDouble();
        conta.saqueSaldo(saldo);

        System.out.println("Updated account data:");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", conta.getNumero(), conta.getName(), conta.getSaldo());

        sc.close();
    }
}
