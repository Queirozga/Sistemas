package notaaluno;
import com.sun.source.tree.ContinueTree;
import java.util.Scanner;
import model.Aluno;

public class NotaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-----Calculador de Medias-----");
        
        int acao = 0;
          
        do{
          System.out.println("\nEscolha o que quer fazer:\n1- Calcular Médias\n"
                + "2- Fechar Programa\n");
        acao = sc.nextInt();    
            
        switch (acao) {
            case 1:
                 System.out.println("Digite o id do aluno:");
                int idAluno = sc.nextInt();
                System.out.println("Digite o nome do aluno:");
                String nomeAluno = sc.next();
                System.out.println("Nota do trabalho da Av1: ");
                double notaTrabalhoAv1 = sc.nextDouble();
                if (notaTrabalhoAv1 < 0 || notaTrabalhoAv1 > 10) {
                    System.out.println("\nNota inváláida!");
                    continue;
                }
                System.out.println("Nota da Av1: ");
                double notaProvaAv1 = sc.nextDouble();
                 if (notaProvaAv1 < 0 || notaProvaAv1 > 10) {
                    System.out.println("\nNota inváláida!");
                    continue;
                }
                System.out.println("Nota do trabalho da Av2: ");
                double notaTrabalhoAv2 = sc.nextDouble();
                 if (notaTrabalhoAv2 < 0 || notaTrabalhoAv2 > 10) {
                    System.out.println("\nNota inváláida!");
                    continue;
                }
                System.out.println("Nota da Av2: ");
                double notaProvaAv2 = sc.nextDouble();
                 if (notaProvaAv2 < 0 || notaProvaAv2 > 10) {
                    System.out.println("\nNota inváláida!");
                    continue;
                }

                Aluno aluno = new Aluno();
                aluno.setIdAluno(idAluno);
                aluno.setNomeAluno(nomeAluno);
                aluno.setNotaTrabalhoAv1(notaTrabalhoAv1);
                aluno.setNotaProvaAv1(notaProvaAv1);
                aluno.setNotaTrabalhoAv2(notaTrabalhoAv2);
                aluno.setNotaProvaAv2(notaProvaAv2);
                System.out.println("\nMédia Av1: "+aluno.calculaMediaAv1());
                System.out.println("\nMédia Av2: "+aluno.calculaMediaAv2());
                System.out.println("\nMédia Final: "+aluno.calculaMediaFinal());
                break;
            case 2:
                return;
        }
        } while (acao != 2);
    }
}
