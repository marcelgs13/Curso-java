import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros você vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        if (n <= 10) {
            for (int i = 0; i < vect.length; i++) {
                System.out.print("Digite um numero: ");
                vect[i] = sc.nextInt();
            }
            System.out.println("Números negativos:");
            for (int i = 0; i < vect.length; i++) {
                if (vect[i] < 0) {
                    System.out.println(vect[i]);
                }
            }
        }

        sc.close();
    }
}
