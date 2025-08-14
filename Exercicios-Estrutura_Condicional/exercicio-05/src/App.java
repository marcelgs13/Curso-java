import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double valorTotal = 0;

        switch (codigo) {
            case 1:
                valorTotal = 4.00 * quantidade;
                break;

            case 2:
                valorTotal = 4.50 * quantidade;
                break;

            case 3:
                valorTotal = 5.00 * quantidade;
                break;

            case 4:
                valorTotal = 2.00 * quantidade;
                break;
            case 5:
                valorTotal = 1.50 * quantidade;
                break;
        }
        System.out.printf("Total: R$ %.2f%n", valorTotal);
        sc.close();
    }
}
