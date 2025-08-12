import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numero,horas_trabalhadas;
        double valor_hora,salario;
        numero = sc.nextInt();
        horas_trabalhadas = sc.nextInt();
        valor_hora = sc.nextDouble();

        salario =horas_trabalhadas*valor_hora;
        System.out.println("NUMBER = "+numero);
        System.out.printf("SALARY = U$ %.2f%n",salario);
    }
}
