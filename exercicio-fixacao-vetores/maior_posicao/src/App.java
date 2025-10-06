import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] array = new double[n];
        double number = 0;
        int posicao = 0;
        for(int i =0;i<array.length;i++){
            System.out.print("Digite um numero: ");
            array[i] = sc.nextDouble();
            if(array[i]>number){
                number = array[i];
                posicao = i;
            }
        }
        System.out.print("\nMAIOR VALOR = "+String.format("%.1f%n", number));
        System.out.println("POSICAO DO MAIOR VALOR = "+posicao);
        
        sc.close();
    }
}
