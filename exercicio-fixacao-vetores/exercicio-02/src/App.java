import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] array = new double[n];

        double soma = 0.0;
        for(int i =0;i<array.length;i++){
            System.out.print("Digite um numero: ");
            array[i]=sc.nextDouble();
            soma+=array[i];
        }
        System.out.println();//linha pendente
        System.out.print("VALORES =");
        for(int i =0;i<array.length;i++){
            System.out.printf("  %.1f",array[i]);
        }
        System.out.println();

        double media = soma/array.length;
        System.out.printf("SOMA = %.2f%n",soma);
        System.out.printf("MEDIA = %.2f%n",media);
        sc.close();
    }
}
