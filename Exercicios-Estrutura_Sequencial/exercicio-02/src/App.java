import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o raio do círculo:");
        double num = sc.nextDouble();
        System.out.printf("A = %.4f%n",area_circulo(num));
        sc.close();
    }
    public static double area_circulo(double num){
        double pi = 3.14159;
        double area = pi * Math.pow(num, 2);
        return area;
    }
}
