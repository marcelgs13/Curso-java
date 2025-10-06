import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int[] array = new int[n];
        int count = 0;
        double media = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite um numero: ");
            array[i] = sc.nextInt();
            if (array[i] % 2 == 0) {
                media += array[i];
                count++;
            }
        }
        media = (double) media / count;
        if (count != 0) {
            System.out.println("MEDIA DOS PARES = " + String.format("%.1f", media));
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }

        sc.close();
    }
}
