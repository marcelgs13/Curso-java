import java.util.Scanner;

import entities.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        Pessoa[] pessoas = new Pessoa[n];
        for(int i =0;i<pessoas.length;i++){
            System.out.println("Dados da "+(i+1)+"a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            pessoas[i] = new Pessoa(name, age);
        }
        System.out.println("PESSOA MAIS VELHA: " + Pessoa.pessoaMaisVelha(pessoas));
        sc.close();
    }
}
