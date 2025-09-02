package model;

import java.util.Objects;

public class Biblioteca {
    
    private int idEmprestimo;
    private String nomeAluno;
    private String nomeLivro;
    private double valorMultaDia;
    private double nroDiasAtraso;
    
    public Biblioteca(int idEmprestimo, String nomeAluno, String nomeLivro,
        double valorMultaDia, double nroDiasAtraso){
        this.idEmprestimo = idEmprestimo;
        this.nomeAluno = nomeAluno;
        this.nomeLivro = nomeLivro;
        this.valorMultaDia = valorMultaDia;
        this.nroDiasAtraso = nroDiasAtraso;
        
    }
    
    public Biblioteca(){
    }
    
    public void setIdEmprestimo(int idEmprestimo){
        this.idEmprestimo = idEmprestimo;
    }
    
    public int getIdEmprestimo(){
        return this.idEmprestimo;
    }
    
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    
    public String getNomeAluno(){
        return this.nomeAluno;
    }
    
    public void setNomeLivro(String nomeLivro){
        this.nomeLivro = nomeLivro;
    }
    
    public String getNomeLivro(){
        return this.nomeLivro;
    }
    
    public void setValorMultaDia(double valorMultaDia){
        this.valorMultaDia = valorMultaDia;
    }
    
    public double getValorMultaDia(){
        return this.valorMultaDia;
    }
    
    public void setNroDiasAtraso(double nroDiasAtraso){
        this.nroDiasAtraso = nroDiasAtraso;
    }
    
    public double getNroDiasAtraso(){
        return this.nroDiasAtraso;
    }
    
    
    public double valorMultaPagar(){
        return this.nroDiasAtraso * this.valorMultaDia;
    }
    
    public String printBiblioteca(){
        return "\nId do empréstimo: " + this.idEmprestimo +
                "\nNome do aluno: " + this.nomeAluno + 
                "\nNome do livro: " + this.nomeLivro +
                "\nValor da multa por dia de atraso: " + this.valorMultaDia +
                "\nDias de atraso: " + this.nroDiasAtraso +
                "\nValor da multa a pagar: " + this.valorMultaPagar();
     }

    @Override
    public String toString() {
        return "\nId do empréstimo: " + this.idEmprestimo +
                "\nNome do aluno: " + this.nomeAluno + 
                "\nNome do livro: " + this.nomeLivro +
                "\nValor da multa por dia de atraso: " + this.valorMultaDia +
                "\nDias de atraso: " + this.nroDiasAtraso +
                "\nValor da multa a pagar: " + this.valorMultaPagar();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.idEmprestimo;
        hash = 53 * hash + Objects.hashCode(this.nomeAluno);
        hash = 53 * hash + Objects.hashCode(this.nomeLivro);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.valorMultaDia) ^ (Double.doubleToLongBits(this.valorMultaDia) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.nroDiasAtraso) ^ (Double.doubleToLongBits(this.nroDiasAtraso) >>> 32));
        return hash;
    }

    

    
    
    
}
