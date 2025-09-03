package model;

import java.util.Objects;

public class Emprestimo {
    
    private String cliente;
    private String banco;
    private double valorEmprestimo;
    private int numeroParcelas;
    private double valorParcela;
    private double valorParcelasPagas;
    private int NumParcelasRestantes;
    private double valorParcelasAPagar;
    
    public Emprestimo() {
    
    }
    
    public String getCliente(){
        return cliente;
    }
    
    public void setCliente(String cliente){
        this.cliente = cliente;
    }
    

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public double getValorEmprestimo() {
        return valorEmprestimo;
    }

    public void setValorEmprestimo(double valorEmprestimo) {
        this.valorEmprestimo = valorEmprestimo;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public int getNumParcelasRestantes() {
        return NumParcelasRestantes;
    }

    public void setNumParcelasRestantes(int NumParcelasRestantes) {
        this.NumParcelasRestantes = NumParcelasRestantes;
    }

    public double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(double valorParcela) {
        this.valorParcela = valorParcela;
    }

    public double getValorParcelasPagas() {
        return valorParcelasPagas;
    }

    public void setValorParcelasPagas(double valorParcelasPagas) {
        this.valorParcelasPagas = valorParcelasPagas;
    }

    public double getValorParcelasAPagar() {
        return valorParcelasAPagar;
    }

    public void setValorParcelasAPagar(double valorParcelasAPagar) {
        this.valorParcelasAPagar = valorParcelasAPagar;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.cliente);
        hash = 61 * hash + Objects.hashCode(this.banco);
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.valorEmprestimo) ^ (Double.doubleToLongBits(this.valorEmprestimo) >>> 32));
        hash = 61 * hash + this.numeroParcelas;
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.valorParcela) ^ (Double.doubleToLongBits(this.valorParcela) >>> 32));
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.valorParcelasPagas) ^ (Double.doubleToLongBits(this.valorParcelasPagas) >>> 32));
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.valorParcelasAPagar) ^ (Double.doubleToLongBits(this.valorParcelasAPagar) >>> 32));
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
        final Emprestimo other = (Emprestimo) obj;
        if (Double.doubleToLongBits(this.valorEmprestimo) != Double.doubleToLongBits(other.valorEmprestimo)) {
            return false;
        }
        if (this.numeroParcelas != other.numeroParcelas) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorParcela) != Double.doubleToLongBits(other.valorParcela)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorParcelasPagas) != Double.doubleToLongBits(other.valorParcelasPagas)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorParcelasAPagar) != Double.doubleToLongBits(other.valorParcelasAPagar)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        return Objects.equals(this.banco, other.banco);
    }
    
    public void pagaParcela(){
        this.valorParcelasPagas += this.valorParcela;
        this.calculaContrato();
        System.out.println("Parabéns, uma parcela foi paga!");
    }
    
    public void calculaContrato(){
        this.valorParcelasAPagar -= this.valorParcela;
        this.NumParcelasRestantes--;
    }
    
    @Override
    public String toString(){
        return "\nCliente: " + this.cliente +
               "\nBanco: " + this.banco + 
               "\nValor do emprestimo: " + this.valorEmprestimo +
               "\nNumero de parcelas: " + this.numeroParcelas +
               "\nValor da parcela: " + this.valorParcela +
               "\nValor Parcela pagas: " + this.valorParcelasPagas +
               "\nParcelas restantes: " + this.NumParcelasRestantes +
               "\nValor Parcelas restantes " + this.valorParcelasAPagar;
                
    }
}

