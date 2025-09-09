
package model;

public class Aluno {
    
    private int idAluno;
    private String nomeAluno;
    private double notaTrabalhoAv1;
    private double notaProvaAv1;
    private double mediaAv1;
    private double notaTrabalhoAv2;
    private double notaProvaAv2;
    private double mediaAv2;
    private double mediaFinal;

    public Aluno(){
    }
    
    public int getIdAluno(int idAluno){
        return this.idAluno;
    }
    
    public void setIdAluno(){
        this.idAluno = idAluno;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public double getNotaTrabalhoAv1() {
        return notaTrabalhoAv1;
    }

    public void setNotaTrabalhoAv1(double notaTrabalhoAv1) {
        this.notaTrabalhoAv1 = notaTrabalhoAv1;
    }

    public double getNotaProvaAv1() {
        return notaProvaAv1;
    }

    public void setNotaProvaAv1(double notaProvaAv1) {
        this.notaProvaAv1 = notaProvaAv1;
    }

    public double getNotaTrabalhoAv2() {
        return notaTrabalhoAv2;
    }

    public void setNotaTrabalhoAv2(double notaTrabalhoAv2) {
        this.notaTrabalhoAv2 = notaTrabalhoAv2;
    }

    public double getNotaProvaAv2() {
        return notaProvaAv2;
    }

    public void setNotaProvaAv2(double notaProvaAv2) {
        this.notaProvaAv2 = notaProvaAv2;
    }

    public double calculaMediaAv1(){
        return this.mediaAv1 = (this.notaTrabalhoAv1 + this.notaProvaAv1) / 2;
    }
    
    public double calculaMediaAv2(){
        return this.mediaAv2 = (this.notaTrabalhoAv2 + this.notaProvaAv2) / 2;
    }
    
    public double calculaMediaFinal(){
       return this.mediaFinal = (this.mediaAv1 + this.mediaAv2) / 2;
    }
}
