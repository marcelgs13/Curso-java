import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        Pessoa[] pessoas = new Pessoa[n];
        for(int i = 0;i<pessoas.length;i++){
            sc.nextLine();//linha pendente
            System.out.print("Altura da "+(i+1)+"a pessoa: ");
            double altura = sc.nextDouble();
            System.out.print("Genero da "+(i+1)+"a pessoa: ");
            char genero = sc.next().charAt(0);
            pessoas[i] = new Pessoa(altura, genero);
        }
        Pessoa.menorAltura(pessoas);
        Pessoa.maiorAltura(pessoas);
        Pessoa.mediaMulheres(pessoas);
        Pessoa.numHomems(pessoas);

        sc.close();
    }
}
