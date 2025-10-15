package entities;

import java.util.List;

public class Funcionario {
    private Integer id;
    private String name;
    private Double salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
//Construtor da classe
    public Funcionario(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString(){
        return id+", "+name+", "+String.format("%.2f", salary);
    }

    public static void ListaFuncionarios(List<Funcionario> funcionarios){
        System.out.println("List of employees:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }

    public void increaseSalary(double percentage) {
		salary += salary * percentage / 100.0;
	}
}

