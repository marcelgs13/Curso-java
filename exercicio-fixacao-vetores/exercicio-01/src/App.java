import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i =0; i <array.length;i++){
            System.out.print("Digite um numero: ");
            int number = sc.nextInt();
            array[i] = number;
        }
        System.out.println("NUMEROS NEGATIVOS:");
        for(int i =0; i <array.length;i++){
            if(array[i]<0){
                System.out.println(array[i]);
            }
        }

        sc.close();
    }
}
