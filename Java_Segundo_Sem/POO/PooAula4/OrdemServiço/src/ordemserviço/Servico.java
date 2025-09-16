package ordemserviço;
import java.util.Scanner;
import model.OrdemServico;

public class Servico {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-----Consultor de Ordem de Serviço-----");
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
        
        OrdemServico s1 = new OrdemServico();
        s1.setId(id);
        s1.setNomeCliente(nomeCliente);
        s1.setNomeProfissional(nomeProfissional);
        s1.setValorServicoHora(valorServicoHora);
        s1.setNroHorasTrabalhadas(nroHorasTrabalhadas);
        s1.setValorKmDeslocamento(valorKmDeslocado);
        s1.setNroKmPercorrido(nroKmPercorrido);
        
        System.out.println("\n-----Ordem de serviço-----");
        System.out.println(s1.toString());
    }
    
}
