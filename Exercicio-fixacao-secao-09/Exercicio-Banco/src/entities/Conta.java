package entities;

public class Conta {
    private int numero;
    private String name;
    private double saldo;
    //Construtor da classe Conta
    public Conta (int numero, String name, double saldo) {
        this.numero = numero;
        this.name = name;
        this.saldo = saldo;
    }
    public String getName () {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }
    public int getNumero () {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo (double saldo) {
        this.saldo = saldo;
    }
    public void depositoSaldo (double saldo) {
        this.saldo += saldo;
    }
    public void saqueSaldo (double saldo) {
        this.saldo -= (saldo + 5.00);
    }


}