import java.util.Scanner;
import entities.Rent;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Rent[] rooms = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine(); // CONSUMIR LINHA PENDENTE
        for (int i = 0; i < n; i++) {
            System.out.println(); // QUEBRA DE LINHA
            System.out.println("Rent #" + (i + 1) + ":");
            System.out.print("Name: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int numRoom = sc.nextInt();
            sc.nextLine(); // Consumir linha pendente
            rooms[numRoom] = new Rent(nome, email);
        }
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++) {
            if (rooms[i] != null) {
                System.out.println(i + ": " + rooms[i].getName() + ", " + rooms[i].getEmail());
            }
        }

        sc.close();
    }
}
