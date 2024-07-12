import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int num = sc.nextInt();
        sc.nextLine(); //Consumir LINHA
        int[] vect = new int[num];
        for (int i =0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        int contadorPares = 0;
        System.out.println("NUMEROS PARES:");
        for (int i =0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                System.out.printf("%d ",vect[i]);
                contadorPares ++;
            }
        }
        System.out.println(); // QUEBRA LINHA
        System.out.println("QUANTIDADE DE PARES = "+ contadorPares);
        sc.close();
    }
}
