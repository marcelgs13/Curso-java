import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] array = new int[n];
        int count = 0;
        for(int i =0;i<array.length;i++){
            System.out.print("Digite um numero: ");
            array[i] = sc.nextInt();
            if (array[i]%2 == 0) {
                count++;
            }
        }
        System.out.println("\nNUMEROS PARES:");
        for (int i : array) {
            if (i%2 ==0) {
                System.out.print(i+" ");
            }
        }
        System.out.println("\nQUANTIDADE DE PARES = "+count);
        sc.close();
    }
}
