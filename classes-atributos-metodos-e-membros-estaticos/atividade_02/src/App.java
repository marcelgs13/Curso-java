import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee empregado = new Employee();
        System.out.print("Name: ");
        empregado.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        empregado.grossSalary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Tax: ");
        empregado.tax = sc.nextDouble();
        System.out.println();
        System.out.println("Employee: " + empregado);
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        empregado.increaseSalary(percentage);
        System.out.println();
        System.out.printf("Updated data: %s, $ %.2f%n", empregado.name, empregado.netSalary());
        sc.close();
    }
}
