import java.util.Scanner;
import entities.Pessoa;
import java.util.Locale;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Quantas pessoas serao digitadas? ");
        int num = sc.nextInt();
        Pessoa[] pessoa = new Pessoa[num];
        double somador = 0;
        for (int i = 0; i < pessoa.length; i++) {
            System.out.println("Dados da "+(i+1)+"a pessoa:");
            sc.nextLine(); //Consome a quebra de linha pendente
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            System.out.println("Altura: ");
            double altura = sc.nextDouble();
            pessoa[i] = new Pessoa(nome, idade, altura);
            somador += pessoa[i].getAltura();
        }
        System.out.println(); //QUEBRA DE LINHA
        double alturaMedia = somador / num;
        double porcentagem = 0;
        System.out.printf("Altura média: %.2f%n",alturaMedia);
        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getIdade()< 16) {
                porcentagem ++;
            }
        }
        porcentagem = (porcentagem * 100)/num;
        System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.1f%%%n",porcentagem);
        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getIdade()< 16) {
                System.out.println(pessoa[i].getName());
            }
        }
        sc.close();
    }
}
