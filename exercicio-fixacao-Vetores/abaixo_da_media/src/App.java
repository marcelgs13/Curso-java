import java.util.Scanner;
import java.util.Locale;
/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.  */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int num = sc.nextInt();
        sc.nextLine();//CONSUMIR LINHA PENDENTE
        double[] vect = new double[num];
        int cont= 0;
        double media = 0;
        for(int i =0; i< num; i++) {
            System.out.print("Digite um numero:");
            vect[i] = sc.nextDouble();
            cont ++;
            media += vect[i];
        }
        media = media/cont;
        System.out.printf("%nMEDIA DO VETOR = %.3f%n",media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < vect.length; i++) {
            if ( vect[i] < media) {
                System.out.printf("%.1f%n",vect[i]);
            }
        }
        


        sc.close();
    }
}
