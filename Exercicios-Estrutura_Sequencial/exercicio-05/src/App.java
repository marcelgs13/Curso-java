import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int cod01, num01,cod02,num02;
        double valor01,valor02;

        cod01 = sc.nextInt();
        num01 = sc.nextInt();
        valor01 = sc.nextDouble();
        sc.nextLine();
        cod02 = sc.nextInt();
        num02 = sc.nextInt();
        valor02 = sc.nextDouble();

        double valor_a_pagar = num01*valor01 + num02*valor02;
        System.out.printf("VALOR A PAGAR: R$ %.2f%n",valor_a_pagar);
        sc.close();
    }
}
