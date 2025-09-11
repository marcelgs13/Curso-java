package entities;

public class Student {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public Student(String name, double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double finalGrade() {
        return nota1 + nota2 + nota3;
    }

    public double missingPoints() {
        if (finalGrade() < 60.0) {
            return 60.00 - finalGrade();
        } else {
            return 0;
        }
    }

    public String toString() {
        if (finalGrade() >= 60.00) {
            return "FINAL GRADE = " + String.format("%.2f%n", finalGrade()) +
                    "PASS";
        } else {
            return "FINAL GRADE = " + String.format("%.2f%n", finalGrade()) +
                    "FAILED\n" +
                    "MISSING " + String.format("%.2f", missingPoints()) + " POINTS";
        }
    }
}
