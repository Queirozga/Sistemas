package emprestimo;
import java.util.Scanner;
import model.Emprestimo;

 //@author Gabriel H. Queiroz

public class Banco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int acao = 0;
        
        System.out.println("-----Empréstimo-----\n");
        System.out.println("Preencha com seus dados:\n");
        System.out.println("Nome: ");
        String cliente = sc.nextLine();
        System.out.println("\nBanco: ");
        String banco = sc.nextLine();
        System.out.println("\nValor do emprestimo: ");
        double valorEmprestimo = sc.nextDouble();
        System.out.println("\nNúmero de parcelas: ");
        int numeroParcelas = sc.nextInt();
        
        Emprestimo e1 = new Emprestimo();
        e1.setCliente(cliente);
        e1.setBanco(banco);
        e1.setValorEmprestimo(valorEmprestimo);
        e1.setNumeroParcelas(numeroParcelas);
        e1.setNumParcelasRestantes(numeroParcelas);
        e1.setValorParcela(valorEmprestimo / numeroParcelas);
        e1.setValorParcelasAPagar(valorEmprestimo);      
      
        do{
            System.out.println("\nO que deseja fazer? \n"
                    + "1 - Pagar parcela.\n"
                    + "2 - Extrato do contrato\n"
                    + "9 - Sair da conta\n");
            acao = sc.nextInt();
            
            switch (acao) {
                case 1:
                    e1.pagaParcela();
                    continue;
                case 2:
                    System.out.println(e1.toString());
                    continue;
                case 9:
                    return;
            }
        } while(acao != 9);
        
        
   
    }
    
}
