import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();// Consumir linha
        System.out.print("Enter account holder: ");
        String nome = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        String escolha = sc.nextLine();
        Conta conta = new Conta(number, nome);
        while (!escolha.equals("y") && !escolha.equals("n")) {
            System.out.println("Is there na initial deposit (y/n)? ");
            escolha = sc.nextLine();
        }

        if (escolha.equals("y")) {
            System.out.print("Enter initial deposit value: ");
            double deposito = sc.nextDouble();
            conta.setSaldo(deposito);
        }
        System.out.println();

        System.out.println("Account data:");
        System.out.println(conta);

        System.out.print("Enter a deposit value: ");
        double dinheiro = sc.nextDouble();
        conta.deposito(dinheiro);
        System.out.println("Updated account data:");
        System.out.println(conta);

        System.out.print("Enter a withdraw value: ");
        dinheiro = sc.nextDouble();
        conta.saque(dinheiro);
        System.out.println("Updated account data:");
        System.out.println(conta);
        sc.close();
    }
}
