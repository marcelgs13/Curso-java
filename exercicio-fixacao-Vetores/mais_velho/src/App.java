import java.util.Scanner;
import entities.Pessoa;
/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha. 
 */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas voce vai digitar? ");
        int num = sc.nextInt();
        sc.nextLine();//CONSUMIR LINHA PENDENTE
        Pessoa[] pessoa = new Pessoa[num];
        for(int i =0; i < num; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa: ");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            pessoa[i] = new Pessoa(nome, idade);
            sc.nextLine();// CONSUMIR LINHA PENDENTE
        }
        Pessoa pessoaMaisVelha = pessoa[0];
        for(int i =0; i < num; i++) {
            if (pessoa[i].getIdade() > pessoaMaisVelha.getIdade()) {
                pessoaMaisVelha = pessoa[i];
            }
        }
        System.out.println("PESSOA MAIS VELHA: "+ pessoaMaisVelha.getNome());
        sc.close();
    }
}
