import java.util.Locale;
import java.util.Scanner;
/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"*/
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int num = sc.nextInt();
        sc.nextLine(); // CONSUMIR LINHA PENDENTE
        int[] vect = new int[num];
        double soma = 0;
        int contador = 0;
        for (int i =0; i < vect.length;i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
            if ( vect[i] % 2 == 0) {
                soma += vect[i];
                contador ++;
            }
        }
        double media = soma / contador;
        if (soma != 0) {
            System.out.printf("A media dos numeros pares é: %.1f%n",media);
        }
        else {
            System.out.println("NENHUM NUMERO PAR");
        }
        sc.close();
    }
}
