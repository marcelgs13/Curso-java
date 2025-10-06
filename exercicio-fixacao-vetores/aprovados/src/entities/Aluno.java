package entities;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;

    public Aluno(String nome, double nota1,double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public static void aprovados(Aluno[] alunos){
        double media =0;
        for(int i =0;i<alunos.length;i++){
            media = (alunos[i].nota1 + alunos[i].nota2)/2;
            if(media >= 6){
                System.out.println(alunos[i].nome);;
            }
        }
    }
    
}
