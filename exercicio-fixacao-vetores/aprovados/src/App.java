import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        
        Aluno[] alunos = new Aluno[n];
        for(int i =0;i<alunos.length;i++){
            sc.nextLine();
            System.out.println("Digite nome, primeira e segunda nota do "+(i+1)+"o aluno:");
            String nome = sc.nextLine();
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            alunos[i] = new Aluno(nome, n1, n2);
        }
        System.out.println("Alunos aprovados:");
        Aluno.aprovados(alunos);

        sc.close();
    }
}
