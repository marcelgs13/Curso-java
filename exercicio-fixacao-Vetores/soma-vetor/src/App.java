import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos números você vai digitar? ");
        int num = sc.nextInt();
        double[] vect = new double[num];
        double soma = 0.0;
        double media;
        for (int i = 0; i < num; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }
        System.out.println(); // QUEBRA DE LINHA
        media = soma / num;
        System.out.print("Valores = ");
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.1f ", vect[i]);
        }
        System.out.printf("%nSoma = %.2f%n", soma);
        System.out.printf("Media = %.2f%n", media);

        sc.close();
    }
}
