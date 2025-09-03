package banco;
import java.util.Scanner;
import model.Conta;

public class Banco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int escolha = 0;
        int valorDeposito = 0;
        int valorSaque = 0;
        
        System.out.println("-----BANCO-----\n");
        System.out.println("Preencha seus dados para continuar\n");
        System.out.println("Digite o nome do banco: ");
        String nomeBanco = sc.next();
        System.out.println("\nDigite o número da agência: ");
        int numeroAgencia = sc.nextInt();
        System.out.println("\nDigite o número da conta: ");
        int numeroConta = sc.nextInt();
        System.out.println("\nSaldo atual: ");
        double saldoAtual = sc.nextDouble();
       
        
        
        Conta c1 = new Conta();
        c1.setBanco(nomeBanco);
        c1.setNumeroDaAgência(numeroAgencia);
        c1.setNumeroConta(numeroConta);
        c1.setSaldoAtual(saldoAtual);
        
        do{
            System.out.println("Escolha uma ação: \n");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver dados");
            System.out.println("4 - Sair\n");
            escolha = sc.nextInt();
        
         switch (escolha) {
             case 1:
                 System.out.println("Valor do depósito: ");
                 valorDeposito = sc.nextInt();
                 c1.deposita(valorDeposito);
                 continue;
             case 2:
                 System.out.println("Valor do saque: ");
                 valorSaque = sc.nextInt();
                 c1.saca(valorSaque);
                 continue;
             case 3:
                 System.out.println(c1.toString());
                 continue;
             case 4:
                return;
         }
        } while (escolha != 4);
    }
    
}
