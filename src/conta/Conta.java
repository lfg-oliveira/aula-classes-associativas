package conta;

import pessoa.Pessoa;

/**
 * Conta
 */
public class Conta {
    private int numero;
    private double saldo;
    private Pessoa dono;

    public Conta(int numero, double saldo, Pessoa dono) {
        this.setNumero(numero);
        this.setSaldo(saldo);
        this.setDono(dono);
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}