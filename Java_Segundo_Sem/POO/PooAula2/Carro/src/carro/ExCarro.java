package carro;
import java.util.Scanner;
import model.Carro;

public class ExCarro {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Carro carro1 = new Carro();
        System.out.println("Digite o ID do carro: ");
        carro1.setId(sc.nextInt());
        
        System.out.println("Digite a marca do carro: ");
        carro1.setMarca(sc.next());
        
        System.out.println("Digite o modelo do carro: ");
        carro1.setModelo(sc.next());
        
        System.out.println("Digite o ano do carro: ");
        carro1.setAno(sc.nextInt());
        
        System.out.println("Digite o valor da venda: ");
        carro1.setValorVenda(sc.nextDouble());
        
        System.out.println(carro1.printCarro());
    }
}
