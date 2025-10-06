package entities;

public class Pessoa {
    public double altura;
    public char genero;

    public Pessoa(double altura,char genero){
        this.altura = altura;
        this.genero = genero;
    }

    public static void menorAltura(Pessoa[] pessoas){
        double menor = pessoas[0].altura;
        for(int i =0;i<pessoas.length;i++){
            if (pessoas[i].altura<menor){
                menor = pessoas[i].altura;
            }
        }
        System.out.println("Menor altura = "+String.format("%.2f", menor)); 
    }

    public static void maiorAltura(Pessoa[] pessoas){
        double maior = pessoas[0].altura;
        for(int i =0;i<pessoas.length;i++){
            if (pessoas[i].altura>maior){
                maior = pessoas[i].altura;
            }
        }
        System.out.println("Maior altura = "+String.format("%.2f", maior)); 
    }

    public static void mediaMulheres(Pessoa[] pessoas){
        char gen = 'F';
        int count = 0;
        double media = 0;
        for (int i =0;i<pessoas.length;i++){
            if(pessoas[i].genero == gen) {
                media += pessoas[i].altura;
                count++;
            }
        }
        media = media / count;
        System.out.println("Media das alturas das mulheres = "+String.format("%.2f", media));
    }

    public static void numHomems(Pessoa[] pessoas){
        char gen = 'M';
        int count = 0;
        for (int i =0;i<pessoas.length;i++){
            if(pessoas[i].genero == gen) {
                count++;
            }
        }
        System.out.println("Numero de homens = "+count);
    }
    
}
