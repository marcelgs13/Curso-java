import java.util.Scanner;
import java.util.Locale;
import entities.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Student estudante = new Student();
        System.out.println("Digite o nome do aluno: ");
        estudante.name = sc.nextLine();
        System.out.println("Digite a primeira nota do aluno: ");
        estudante.nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        estudante.nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota do aluno: ");
        estudante.nota3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", estudante.notaFinal());
        if (estudante.notaFinal() >= 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", estudante.pontosPerdidos());
        }
        sc.close();
    }
}
