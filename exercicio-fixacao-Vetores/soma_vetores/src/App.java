import java.util.Scanner;

/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado. 
 */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores vai ter cada vetor? ");
        int num = sc.nextInt();
        sc.nextLine(); // CONSUMIR LINHA
        int[] a = new int[num];
        int[] b = new int[num];
        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < num; i++) {
            a[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < num; i++) {
            b[i] = sc.nextInt();
            sc.nextLine();
        }
        int[] c = new int[num];
        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < num; i++) {
            c[i] = a[i] + b[i];
            System.out.println(c[i]);
        }
        sc.close();
    }
}
