import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        System.out.printf("TRIANGULO: %.3f%n",area_triangulo_retangulo(a, b, c) );
        System.out.printf("CIRCULO: %.3f%n",circulo_raio_C(a, b, c) );
        System.out.printf("TRAPEZIO: %.3f%n",trapezio(a, b, c) );
        System.out.printf("QUADRADO: %.3f%n",area_do_quadrado(a, b, c) );
        System.out.printf("RETANGULO: %.3f%n",area_do_retangulo(a, b, c) );

        sc.close();
    }
    public static double area_triangulo_retangulo(double a,double b, double c){
        double area = (a*c)/2;
        return area;
    }
    public static double circulo_raio_C(double a,double b, double c){
        double pi = 3.14159;
        return pi * Math.pow(c, 2);
    }
    public static double trapezio(double a,double b, double c){
        return (a+b)*c/2;
    }
    public static double area_do_quadrado(double a,double b, double c){
        return Math.pow(b, 2);
    }
    public static double area_do_retangulo(double a,double b, double c){
        return a*b;
    }
}
