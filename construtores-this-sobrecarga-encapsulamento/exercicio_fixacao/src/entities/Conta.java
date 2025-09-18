package entities;

public class Conta {
    private int id_conta;
    private String nome;
    private double saldo;

    public int getId_conta() {
        return id_conta;
    }

    public void setId_conta(int id_conta) {
        this.id_conta = id_conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta() {
    }

    public Conta(int id_conta, String nome) {
        this.id_conta = id_conta;
        this.nome = nome;
    }

    public String toString() {
        return "Account " + id_conta + ", Holder: " + nome + ", Balance: $ " + String.format("%.2f%n", saldo);
    }
    public double deposito(double dinheiro){
        saldo += dinheiro;
        return saldo;
    }

    public double saque(double dinheiro){
        saldo -= (dinheiro+5.00);
        return saldo;
    }

}
