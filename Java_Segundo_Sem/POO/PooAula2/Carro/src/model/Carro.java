package model;

public class Carro {
    
    
    public Carro(int id, String marca, String modelo, int ano, double valorVenda){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valorVenda = valorVenda;
    }
    
    public Carro(){
    }
    
    public void setId(int id){
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
        return "Id: " + this.id 
                + "Marca: " + this.marca
                + "Modelo: " + this.modelo
                + "Ano: " +this.ano
                + "Valor da venda: " + this.valorVenda;
    }
            
    private int id;
    private String marca;
    private String modelo;
    private int ano;
    private double valorVenda;
}
