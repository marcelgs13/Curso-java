import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas? ");
        int number = sc.nextInt();
        Pessoa[] pessoas = new Pessoa[number];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            pessoas[i] = new Pessoa();// INSTANCIANDO A PESSOA
            sc.nextLine();// LINHA PENDENTE
            System.out.print("Nome: ");
            pessoas[i].setNome(sc.nextLine());
            System.out.print("Idade: ");
            pessoas[i].setIdade(sc.nextInt());
            System.out.print("Altura: ");
            pessoas[i].setAltura(sc.nextDouble());
        }

        double soma = 0.0;
        double porcentagem = 0.0;
        for (Pessoa p : pessoas) {
            soma += p.getAltura();
            if (p.getIdade() < 16) {
                porcentagem++;
            }
        }
        double media = soma / pessoas.length;
        porcentagem = (porcentagem * 100) / number;

        System.out.printf("\nAltura média: %.2f%n", media);
        System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.1f%%%n", porcentagem);
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                System.out.println(pessoas[i].getNome());
            }
        }

        sc.close();
    }
}
