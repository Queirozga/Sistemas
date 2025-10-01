package alugueldelivros;
import java.util.Scanner;
import model.Biblioteca;
import java.util.ArrayList;
import java.util.List;

public class AluguelDeLivros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List <Biblioteca> Aluguel = new ArrayList<>();
        
        int escolha = 1;
        
        do {
            System.out.println("\n-----Alugueis-----");
            System.out.println("O que que fazer?\n1- Adicionar aluguel\n9- Sair");
            escolha = sc.nextInt();
            
            switch (escolha){
                case 1:
                    System.out.println("Informe o id do emprestimo: ");
                    int idEmprestimo = sc.nextInt();
                    System.out.println("Informe o nome do aluno: ");
                    String nomeAluno = sc.next();
                    System.out.println("Informe o nome do livro: ");
                    String nomeLivro = sc.next();
                    System.out.println("Valor da multa por dia de atraso: ");
                    double valorMultaDia = sc.nextDouble();
                    System.out.println("Dias de atraso: ");
                    int nroDiasAtraso = sc.nextInt();
                    
                    Biblioteca aluguel = new Biblioteca();
                    aluguel.setIdEmprestimo(idEmprestimo);
                    aluguel.setNomeAluno(nomeAluno);
                    aluguel.setNomeLivro(nomeLivro);
                    aluguel.setValorMultaDia(valorMultaDia);
                    aluguel.setNroDiasAtraso(nroDiasAtraso);
                    
                    Aluguel.add(aluguel);
                    System.out.println("\nAluguel adicionado!\n");
                    
                    break;
                case 9:
                    for(Biblioteca alugueis : Aluguel){
                        System.out.println(alugueis.toString());
                    }
                    
                    System.out.println("\nAte mais!");
                    break;
                default:
                    break;
            }
        }while (escolha != 9);
    }
    
}
