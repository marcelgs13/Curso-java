import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] numbers = new double[n];
        double media = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextDouble();
            media += numbers[i];
        }
        media = media / numbers.length;
        System.out.println("\nMEDIA DO VETOR = " + String.format("%.3f", media));
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (double numero : numbers) {
            if (numero < media) {
                System.out.println(numero);
            }
        }
        sc.close();
    }
}
