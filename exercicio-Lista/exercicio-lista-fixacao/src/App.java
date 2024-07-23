import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Employee;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Employee> lista = new ArrayList<>();
        Locale.setDefault(Locale.US);

        System.out.print("How many employees will be registered? ");
        int num = sc.nextInt();
        sc.nextLine(); // Consumir linha pendente

        for (int i = 0; i < num; i++) {
            System.out.println();// QUEBRA DE LINHA
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(lista, id)) {
                System.out.println("Id already taken! Try again: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();// CONSUMIR LINHA PENDENTE
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            lista.add(new Employee(id, name, salary));
        }
        System.out.println();
        System.out.print("Enter the employee id that will have salary increase : ");
        int idsalary = sc.nextInt();

        // Integer pos = position(list, idsalary);

        Employee emp = lista.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

        // if (pos == null) {
        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            // list.get(pos).increaseSalary(percent);
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employee e : lista) {
            System.out.printf("%d, %s, %.2f%n", e.getId(), e.getName(), e.getSalary());
        }

        sc.close();
    }

    public static Integer position(List<Employee> lista, int id) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
