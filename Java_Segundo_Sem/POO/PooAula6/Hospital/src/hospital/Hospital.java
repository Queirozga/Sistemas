package hospital;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Paciente;

public class Hospital {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List <Paciente> ListPacientes = new ArrayList<>();

        int escolha = 1;
        int contPacientes = 0;
        double somaIdades = 0;
       
        do{
            System.out.println("-----Cadastro de Pacientes-----");
            System.out.println("Escolha uma Ação:\n1- Cadastrar Paciente.\n9- Sair");
            escolha = sc.nextInt();
        
            switch (escolha) {
                case 1:
                    contPacientes++;
                    Paciente paciente = new Paciente();

                    System.out.println("\nInforme o id: ");
                    int id = sc.nextInt();
                    System.out.println("Informe o nome: ");
                    String nome = sc.next();
                    System.out.println("Informe o diagnostico");
                    String diagnostico = sc.next();
                    System.out.println("Informe a idade: ");
                    int idade= sc.nextInt();

                    paciente.setId(id);
                    paciente.setNome(nome);
                    paciente.setDiagnostico(diagnostico);
                    paciente.setIdade(idade);
                    
                    ListPacientes.add(paciente);
                    break;
                case 9:
                    
                    for(Paciente pacienteListado : ListPacientes){
                        System.out.println(pacienteListado.toString());
                        somaIdades += pacienteListado.getIdade();
                    }
                    System.out.println("\nPacientes Cadastrados: "+ contPacientes);
                    double mediaIdades = somaIdades / contPacientes;
                    System.out.println("Media das idades: "+ mediaIdades);
                    break;
                default:
                    break;
            }
        }while(escolha != 9);
    }
}
