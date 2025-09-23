package ordemserviço;
import java.util.Scanner;
import model.OrdemServico;
import java.util.ArrayList;
import java.util.List;

public class Servico {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        OrdemServico s = new OrdemServico();
        List <OrdemServico> ListServicos = new ArrayList<>();
        
        int escolha = 1;
        
        do{
            System.out.println("\n-----Consultor de Ordem de Serviço-----\n");
            System.out.println("Escolha o que quer fazer\n1- Calcular Ordem de servico\n9-Parar Programa");
            escolha = sc.nextInt();
                
            switch (escolha){
                case 1:                     
                    System.out.println("\nInforme o id: ");
                    int id = sc.nextInt();
                    System.out.println("\nNome do Cliente: ");
                    String nomeCliente = sc.next();
                    System.out.println("\nNome Profissional: ");
                    String nomeProfissional = sc.next();
                    System.out.println("\nValor da hora trabalhada: ");
                    double valorServicoHora = sc.nextDouble();
                    System.out.println("\nHoras trabalhadas: ");
                    double nroHorasTrabalhadas = sc.nextDouble();
                    System.out.println("\nValor por Km deslocado: ");
                    double valorKmDeslocado = sc.nextDouble();
                    System.out.println("\nKms deslocados: ");
                    double nroKmPercorrido = sc.nextDouble();

                    s.setId(id);
                    s.setNomeCliente(nomeCliente);
                    s.setNomeProfissional(nomeProfissional);
                    s.setValorServicoHora(valorServicoHora);
                    s.setNroHorasTrabalhadas(nroHorasTrabalhadas);
                    s.setValorKmDeslocamento(valorKmDeslocado);
                    s.setNroKmPercorrido(nroKmPercorrido);

                    ListServicos.add(s);

                    for(OrdemServico ItemServicos : ListServicos){
                        System.out.println("\n-----Ordem de serviço-----");
                        System.out.println(ItemServicos.toString());
                    };
                    break;
                case 9: 
                    break;
                default: 
                    System.out.println("Numero invalido!");
                    break;  
        }
        } while (escolha != 9);
        
        System.out.println(ListServicos.toString());
    }
    
}
