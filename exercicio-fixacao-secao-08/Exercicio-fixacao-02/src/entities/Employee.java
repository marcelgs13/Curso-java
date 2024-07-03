package entities;

public class Employee {
    public String name;
    public double grossSalary; //Salário bruto
    public double tax; //taxa

    public double netSalary() { //Método do Salário Líquido
        return grossSalary - tax;
    }
    public void increaseSalary (double percentage) {
        grossSalary += grossSalary * percentage / 100.0;
    } 
}
