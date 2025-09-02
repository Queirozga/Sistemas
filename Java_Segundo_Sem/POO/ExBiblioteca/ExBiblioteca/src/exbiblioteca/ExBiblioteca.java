package exbiblioteca;
import model.Biblioteca;
import java.util.Scanner;

public class ExBiblioteca {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Biblioteca biblio = new Biblioteca();
        System.out.println("Digite o id do empréstimo: ");
        biblio.setIdEmprestimo(sc.nextInt());
        System.out.println("Digite o nome do aluno: ");
        biblio.setNomeAluno(sc.next());
        System.out.println("Digite o nome do livro: ");
        biblio.setNomeLivro(sc.next());
        System.out.println("Digite o valor da multa por cada dia de atraso: ");
        biblio.setValorMultaDia(sc.nextDouble());
        System.out.println("Digite os dias de atraso: ");
        biblio.setNroDiasAtraso(sc.nextDouble());
        
        System.out.println(biblio.toString());
                
                
    }
    
}
