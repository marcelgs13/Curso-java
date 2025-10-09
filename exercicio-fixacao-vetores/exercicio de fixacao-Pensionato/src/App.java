import java.util.Scanner;

import entities.Pensionato;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);


        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        Pensionato[] pessoaPensionatos = new Pensionato[10];
        
        for(int i =0;i<n;i++){
            sc.nextLine();//LINHA PENDENTE
            System.out.println("\nRent #"+(i+1)+":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int num = sc.nextInt();
            pessoaPensionatos[num] = new Pensionato(name, email);
        }
        System.out.println("\nBusy rooms:");
        Pensionato.busyRooms(pessoaPensionatos);

        sc.close();
    }
}
