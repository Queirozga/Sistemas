package model;

import java.util.Objects;

public class Conta {
    
    private String banco;
    private int numeroDaAgência;
    private int numeroConta;
    private double saldoAtual;
    
    
    public Conta(){
    }


    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getNumeroDaAgência() {
        return numeroDaAgência;
    }

    public void setNumeroDaAgência(int numeroDaAgência) {
        this.numeroDaAgência = numeroDaAgência;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }
    
    public void deposita(int valor){
        this.saldoAtual += valor;
        System.out.println("Depósito realizado!\n");
    }
    
    public void saca(int valor){
        if (this.saldoAtual >= valor ){
        this.saldoAtual -= valor;
        System.out.println("Saque realizado\n");
        } else {
            System.out.println("Você não te créditos suficiêntes!\n");
        }
    }

    @Override
    public String toString(){
        return "\nBanco: " + this.banco + 
               "\nNúmero da agência: " + this.numeroDaAgência + 
               "\nNúmero da conta: " + this.numeroConta +
               "\nSaldo atual: " + this.saldoAtual;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.banco);
        hash = 29 * hash + this.numeroDaAgência;
        hash = 29 * hash + this.numeroConta;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.saldoAtual) ^ (Double.doubleToLongBits(this.saldoAtual) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Conta other = (Conta) obj;
        if (this.numeroDaAgência != other.numeroDaAgência) {
            return false;
        }
        if (this.numeroConta != other.numeroConta) {
            return false;
        }
        if (Double.doubleToLongBits(this.saldoAtual) != Double.doubleToLongBits(other.saldoAtual)) {
            return false;
        }
        return Objects.equals(this.banco, other.banco);
    }
    
    
    
}


