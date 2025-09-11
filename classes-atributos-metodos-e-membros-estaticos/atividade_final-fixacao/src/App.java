import java.util.Scanner;
import java.util.Locale;
import util.CurrencyConverter;
public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("What is a dollar Price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollarBuy = sc.nextDouble();
        double conversaoFinal = CurrencyConverter.conversorReal(dollarPrice, dollarBuy);
        System.out.printf("Amount to be paid in reais = %.2f%n",conversaoFinal);


        sc.close();

    }
}