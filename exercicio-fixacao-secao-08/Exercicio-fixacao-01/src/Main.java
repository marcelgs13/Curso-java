import java.util.Scanner;
import java.util.Locale;
import entities.Rectangle;
/*Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado. */
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Rectangle retangulo = new Rectangle();
        System.out.println("Enter rectangle width and height:");
        retangulo.width = sc.nextDouble();
        retangulo.height = sc.nextDouble();
        System.out.printf("Área= %.2f%n",retangulo.area());
        System.out.printf("Perimeter= %.2f%n",retangulo.perimeter());
        System.out.printf("Diagonal= %.2f%n",retangulo.diagonal());

        sc.close();
    }
}
