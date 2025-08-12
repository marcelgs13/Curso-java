import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os dois números inteiros:");
        int num01, num02;
        num01 = sc.nextInt();
        sc.nextLine(); //Quebra de linha Pendente
        num02 = sc.nextInt();
        System.out.println("SOMA = "+soma(num01, num02));
    }

    public static int soma(int num01,int num02){
        return num01 + num02;
    }
}
