import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        List<Funcionario> funcionarios = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("\nEmplyoee #" + (i + 1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();// linha pendente
            System.out.print("Name: ");
            String nome = sc.nextLine();
            System.out.print("Salary: ");
            double salario = sc.nextDouble();
            Funcionario f = new Funcionario(id, nome, salario);
            funcionarios.add(f);
        }
        System.out.print("\nEnter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Funcionario emp = null;

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId() == id) {
                emp = funcionario;
                break; // encontrou, pode parar o loop
            }
        }

        if (emp != null) {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        } else {
            System.out.println("This id does not exist!");
        }
        System.out.println();
        Funcionario.ListaFuncionarios(funcionarios);

        sc.close();
    }
}
