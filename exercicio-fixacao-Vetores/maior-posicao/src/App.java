import java.util.Scanner;
import java.util.Locale;
/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero). 
 */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Quantos numeros voce vai digitar? ");
        int num = sc.nextInt();
        sc.nextLine(); // Consumir LINHA
        double[] vect = new double[num];
        for(int i = 0; i < num; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        System.out.println(); //QUEBRA DE LINHA
        double maiorNumero = vect[0];
        int cont = 0;
        for(int i = 0; i < num; i++) {
            if(vect[i] > maiorNumero) {
                maiorNumero = vect[i];
                cont = i;          
            }
        }
        System.out.printf("MAIOR VALOR = %.1f%n",maiorNumero);
        System.out.printf("POSICAO DO MAIOR VALOR = %d%n",cont);


        sc.close();
    }
}
