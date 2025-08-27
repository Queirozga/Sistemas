package model;

public class Carro {

    public Carro(){
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setValorVenda(double valorVenda){
        this.valorVenda = valorVenda;
    }
    
    public double getValorVenda(){
        return valorVenda;
    }
            
    public String printCarro(){
        return "\nId: " + this.getId()
                + "\nMarca: " + this.getMarca()
                + "\nModelo: " + this.getModelo()
                + "\nAno: " +this.getAno()
                + "\nValor da venda: " + this.getValorVenda();
    }
            
    private int id;
    private String marca;
    private String modelo;
    private int ano;
    private double valorVenda;
}
