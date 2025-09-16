package model;

import java.util.Objects;

public class OrdemServico {
     
    private int id;
    private String nomeCliente;
    private String nomeProfissional;
    private double valorServicoHora;
    private double valorKmDeslocamento;
    private double nroHorasTrabalhadas;
    private double nroKmPercorrido;
    private double valorServico;
    private double valorDeslocamento;
    private double valorPagar;

    public OrdemServico(){
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeProfissional() {
        return nomeProfissional;
    }

    public void setNomeProfissional(String nomeProfissional) {
        this.nomeProfissional = nomeProfissional;
    }

    public double getValorKmDeslocamento() {
        return valorKmDeslocamento;
    }

    public void setValorKmDeslocamento(double valorKmDeslocamento) {
        this.valorKmDeslocamento = valorKmDeslocamento;
    }

    public double getNroHorasTrabalhadas() {
        return nroHorasTrabalhadas;
    }

    public void setNroHorasTrabalhadas(double nroHorasTrabalhadas) {
        this.nroHorasTrabalhadas = nroHorasTrabalhadas;
    }

    public double getNroKmPercorrido() {
        return nroKmPercorrido;
    }

    public void setNroKmPercorrido(double nroKmPercorrido) {
        this.nroKmPercorrido = nroKmPercorrido;
    }
    
    public double getValorServicoHora() {
        return valorServicoHora;
    }

    public void setValorServicoHora(double valorServicoHora) {
        this.valorServicoHora = valorServicoHora;
    }

    public double calculaValorServico(){
       return this.valorServico = this.valorServicoHora * this.nroHorasTrabalhadas;
    }
    
    public double calculaValorDeslocamento(){
        return this.valorDeslocamento = this.valorKmDeslocamento * this.nroKmPercorrido;
    }
    
    public double calculaValorPagar(){
        return this.valorPagar = this.valorServico + this.valorDeslocamento;
    } 
    
    @Override
    public String toString(){
     return "\nId: "+ this.getId()
             + "\nNome do Cliente: "+ this.getNomeCliente()
             + "\nNome Profissional: "+this.getNomeProfissional()
             + "\nValor da hora trabalhada: "+this.getValorServicoHora()
             + "\nHoras trabalhadas: "+ this.getNroHorasTrabalhadas()
             + "\nValor a receber referente as horas: "+ this.calculaValorServico()
             + "\nValor do km percorrido: "+ this.getValorKmDeslocamento()
             + "\nKms percorridos: "+ this.getNroKmPercorrido()
             + "\nValor a receber referente ao deslocamento: "+ this.calculaValorDeslocamento()
             + "\nValor total a receber: "+ this.calculaValorPagar();
             
        }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.nomeCliente);
        hash = 67 * hash + Objects.hashCode(this.nomeProfissional);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.valorServicoHora) ^ (Double.doubleToLongBits(this.valorServicoHora) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.valorKmDeslocamento) ^ (Double.doubleToLongBits(this.valorKmDeslocamento) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.nroHorasTrabalhadas) ^ (Double.doubleToLongBits(this.nroHorasTrabalhadas) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.nroKmPercorrido) ^ (Double.doubleToLongBits(this.nroKmPercorrido) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.valorServico) ^ (Double.doubleToLongBits(this.valorServico) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.valorDeslocamento) ^ (Double.doubleToLongBits(this.valorDeslocamento) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.valorPagar) ^ (Double.doubleToLongBits(this.valorPagar) >>> 32));
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
        final OrdemServico other = (OrdemServico) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorServicoHora) != Double.doubleToLongBits(other.valorServicoHora)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorKmDeslocamento) != Double.doubleToLongBits(other.valorKmDeslocamento)) {
            return false;
        }
        if (Double.doubleToLongBits(this.nroHorasTrabalhadas) != Double.doubleToLongBits(other.nroHorasTrabalhadas)) {
            return false;
        }
        if (Double.doubleToLongBits(this.nroKmPercorrido) != Double.doubleToLongBits(other.nroKmPercorrido)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorServico) != Double.doubleToLongBits(other.valorServico)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorDeslocamento) != Double.doubleToLongBits(other.valorDeslocamento)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorPagar) != Double.doubleToLongBits(other.valorPagar)) {
            return false;
        }
        if (!Objects.equals(this.nomeCliente, other.nomeCliente)) {
            return false;
        }
        return Objects.equals(this.nomeProfissional, other.nomeProfissional);
    }
    
    
    
}
