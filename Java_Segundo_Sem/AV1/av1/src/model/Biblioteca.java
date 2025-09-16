package model;

import java.util.Objects;

public class Biblioteca {
    
    private int idEmprestimo;
    private String nomeAluno;
    private String nomeLivro;
    private double valorMultaDia;
    private double nroDiasAtraso;
    private double valorMultaPagar;
    
    public Biblioteca(){
    }
    
    public Biblioteca(int idEmprestimo, String nomeAluno, String nomeLivro, double valorMultaDia,
            double nroDiasAtraso){
        this.idEmprestimo = idEmprestimo;
        this.nomeAluno = nomeAluno;
        this.nomeLivro = nomeLivro;
        this.valorMultaDia = valorMultaDia;
        this.nroDiasAtraso = nroDiasAtraso;
    }
    
    public double calculaValorMultaPagar(){
        return this.valorMultaPagar = this.getNroDiasAtraso() * this.getValorMultaDia();
    }
    
    @Override
    public String toString(){
        return "\nId do emprestimo: "+ this.getIdEmprestimo() +
                "\nNome do Aluno: "+ this.getNomeAluno() +
                "\nNome do Livro: "+ this.getNomeLivro() +
                "\nMulta por dia de atraso: "+ this.getValorMultaDia() +
                "\nDias de atraso: "+ this.getNroDiasAtraso() +
                "\nValor da multa a pagar: "+ this.calculaValorMultaPagar();
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public double getValorMultaDia() {
        return valorMultaDia;
    }

    public void setValorMultaDia(double valorMultaDia) {
        this.valorMultaDia = valorMultaDia;
    }

    public double getNroDiasAtraso() {
        return nroDiasAtraso;
    }

    public void setNroDiasAtraso(double nroDiasAtraso) {
        this.nroDiasAtraso = nroDiasAtraso;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.idEmprestimo;
        hash = 67 * hash + Objects.hashCode(this.nomeAluno);
        hash = 67 * hash + Objects.hashCode(this.nomeLivro);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.valorMultaDia) ^ (Double.doubleToLongBits(this.valorMultaDia) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.nroDiasAtraso) ^ (Double.doubleToLongBits(this.nroDiasAtraso) >>> 32));
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
        final Biblioteca other = (Biblioteca) obj;
        if (this.idEmprestimo != other.idEmprestimo) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorMultaDia) != Double.doubleToLongBits(other.valorMultaDia)) {
            return false;
        }
        if (Double.doubleToLongBits(this.nroDiasAtraso) != Double.doubleToLongBits(other.nroDiasAtraso)) {
            return false;
        }
        if (!Objects.equals(this.nomeAluno, other.nomeAluno)) {
            return false;
        }
        return Objects.equals(this.nomeLivro, other.nomeLivro);
    }
    
    
}
