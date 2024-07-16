import java.util.Scanner;
import java.util.Locale;
import entities.Pessoa;

/*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens. 
 */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Quantas pessoas serao digitadas? ");
        int num = sc.nextInt();
        sc.nextLine();// CONSUMIR LINHA PENDENTE
        Pessoa[] pessoa = new Pessoa[num];
        for (int i = 0; i < pessoa.length; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa:");
            double altura = sc.nextDouble();
            System.out.println("Genero da " + (i + 1) + "a pessoa:");
            char genero = sc.next().charAt(0);
            sc.nextLine();// CONSUMIR LINHA PENDENTE
            pessoa[i] = new Pessoa(altura, genero);
        }
        Pessoa menorPessoa = pessoa[0];
        Pessoa maiorPessoa = pessoa[0];
        int contHomens = 0;
        int contMulheres = 0;
        double somaAlturaMulheres = 0;
        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getAltura() < menorPessoa.getAltura()) {
                menorPessoa = pessoa[i];
            }
            if (pessoa[i].getAltura() > maiorPessoa.getAltura()) {
                maiorPessoa = pessoa[i];
            }
            if (pessoa[i].getGenero() == 'F') {
                somaAlturaMulheres += pessoa[i].getAltura();
                contMulheres++;
            } else if (pessoa[i].getGenero() == 'M') {
                contHomens++;
            }
        }
        double mediaMulheres = contMulheres > 0 ? somaAlturaMulheres / contMulheres : 0;
        System.out.printf("Menor altura = %.2f%n",menorPessoa.getAltura());
        System.out.printf("Maior altura = %.2f%n",maiorPessoa.getAltura());
        System.out.printf("Media das alturas das mulheres = %.2f%n",mediaMulheres);
        System.out.printf("Numero de homens = %d%n",contHomens);
        
        sc.close();
    }
}
