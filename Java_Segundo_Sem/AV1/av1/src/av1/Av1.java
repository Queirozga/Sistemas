package av1;
import java.util.Scanner;
import model.Biblioteca;

public class Av1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("\n-----Calculador de Multa de Atraso-----\n");
        System.out.println("Informe o id do emprestimo: ");
        int idEmprestimo = sc.nextInt();
        System.out.println("\nInforme o nome do aluno: ");
        String nomeAluno = sc.next();
        System.out.println("\nInforme o nome do livro: ");
        String nomeLivro = sc.next();
        System.out.println("\nDigite o valor da multa por dia de atraso: ");
        double valorMultaDia = sc.nextDouble();
        System.out.println("\nDias de atraso: ");
        double nroDiasAtraso = sc.nextDouble();
        
        Biblioteca b1 = new Biblioteca();
        b1.setIdEmprestimo(idEmprestimo);
        b1.setNomeAluno(nomeAluno);
        b1.setNomeLivro(nomeLivro);
        b1.setValorMultaDia(valorMultaDia);
        b1.setNroDiasAtraso(nroDiasAtraso);
        
        System.out.println(b1.toString());
    }
    
}
