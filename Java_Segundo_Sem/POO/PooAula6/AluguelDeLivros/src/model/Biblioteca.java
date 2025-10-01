package model;

import java.util.Objects;

public class Biblioteca {
    private int idEmprestimo;
    private String nomeAluno;
    private String nomeLivro;
    private double valorMultaDia;
    private int nroDiasAtraso;
    private double valorMultaPagar;

    public Biblioteca(){
    }
    
    public Biblioteca(int idEmprestimo, String nomeAluno, String nomeLivro, 
            double valorMultaDia, int nroDiasAtraso, double valorMultaPagar){
        this.idEmprestimo = idEmprestimo;
        this.nomeAluno = nomeAluno;
        this.nomeLivro = nomeLivro;
        this.valorMultaDia = valorMultaDia;
        this.nroDiasAtraso = nroDiasAtraso;
        this.valorMultaPagar = valorMultaPagar;
    }
    
    public double calculaMultaPagar(){
        return this.valorMultaPagar = this.valorMultaDia * this.nroDiasAtraso;
    }
    
    @Override
    public String toString(){
        return "\nId do emprestimo: "+ getIdEmprestimo()+
               "\nNome do aluno: "+ getNomeAluno()+
               "\nNome do livro: "+ getNomeLivro()+
               "\nValor da multa por dia: "+ getValorMultaDia()+
               "\nDias de atraso: "+ getNroDiasAtraso()+
               "\nValor total da multa: "+ calculaMultaPagar();
    }
    
    public int getIdEmprestimo(){
        return idEmprestimo; 
    }
    
    public void setIdEmprestimo(int idEmprestimo){
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

    public int getNroDiasAtraso() {
        return nroDiasAtraso;
    }

    public void setNroDiasAtraso(int nroDiasAtraso) {
        this.nroDiasAtraso = nroDiasAtraso;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.idEmprestimo;
        hash = 37 * hash + Objects.hashCode(this.nomeAluno);
        hash = 37 * hash + Objects.hashCode(this.nomeLivro);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.valorMultaDia) ^ (Double.doubleToLongBits(this.valorMultaDia) >>> 32));
        hash = 37 * hash + this.nroDiasAtraso;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.valorMultaPagar) ^ (Double.doubleToLongBits(this.valorMultaPagar) >>> 32));
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
        if (this.nroDiasAtraso != other.nroDiasAtraso) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorMultaPagar) != Double.doubleToLongBits(other.valorMultaPagar)) {
            return false;
        }
        if (!Objects.equals(this.nomeAluno, other.nomeAluno)) {
            return false;
        }
        return Objects.equals(this.nomeLivro, other.nomeLivro);
    }

    
    
}
