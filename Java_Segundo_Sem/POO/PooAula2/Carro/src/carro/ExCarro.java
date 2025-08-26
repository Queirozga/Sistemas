package carro;
import model.Carro;

public class ExCarro {

    
    public static void main(String[] args) {
        
        Carro carro1 = new Carro();
        carro1.setId(01);
        carro1.setMarca("ferrari");
        carro1.setModelo("Spider");
        carro1.setAno(2025);
        carro1.setValorVenda(2000000);
        
        int idCar1 = carro1.getId();
        String MarcaCar1 = carro1.getMarca();
        String ModeloCar1 = carro1.getModelo();
        int AnoCar1 = carro1.getAno();
        double ValorVendaCar1 = carro1.getValorVenda();
        
        Carro carro2 = new Carro(02, "Audi", "a3", 2024, 287000);
        
        System.out.println(carro1.printCarro());
    }
}
