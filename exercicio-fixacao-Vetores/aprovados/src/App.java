import java.util.Scanner;
import entities.Aluno;
import java.util.Locale;
/*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis). 
 */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Quantos alunos serao digitados? ");
        int num = sc.nextInt();
        sc.nextLine();//CONSUMIR LINHA PENDENTE
        Aluno[] aluno = new Aluno[num];
        for (int i = 0; i < aluno.length;i++) {
            System.out.println("Digite nome, primeira e segunda nota do "+(i+1)+"o aluno:");
            String nome = sc.nextLine();
            double nota01 = sc.nextDouble();
            double nota02 = sc.nextDouble();
            sc.nextLine(); //CONSUMIR LINHA PENDENTE
            aluno[i] = new Aluno(nome, nota01, nota02);
        }
        System.out.println("Alunos aprovados:");
        for (int i=0; i < num; i++) {
            if (aluno[i].mediaAprovado() >= 6.0) {
                System.out.println(aluno[i].getNome());
            }
        }
        sc.close();
        
    }
}
