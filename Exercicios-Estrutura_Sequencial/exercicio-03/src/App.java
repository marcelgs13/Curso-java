import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os quatro valores inteiros:");
        int a,b,c,d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        System.out.println("DIFERENCA = "+diferenca(a, b, c, d));
        sc.close();
    }
    public static int diferenca(int num01,int num02,int num03,int num04){
        return (num01*num02-num03*num04);
    }
}
