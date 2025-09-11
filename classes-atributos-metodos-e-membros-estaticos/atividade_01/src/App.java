import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height:");
        Rectangle retangulo = new Rectangle();
        retangulo.width = sc.nextDouble();
        retangulo.height = sc.nextDouble();
        System.out.println(retangulo);

        sc.close();
    }
}
