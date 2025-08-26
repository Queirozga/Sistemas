package com.mycompany.exjogodavelha;
import java.util.Scanner;
import java.util.Random;

public class ExJogoDaVelha {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int jogo[][] = new int[3][3];
        int escolha = 0, aux = 0;
        

        System.out.println("Escolha um número de 1 a 9: ");
        carregar_tabuleiro();
        escolha = sc.nextInt();
        
    }        
    public static void carregar_tabuleiro(){ 
        for (int i = 0; i < 3; i++) {
            
            System.out.println("   | " + "  |  ");
            
            for (int j = 0; j < 1; j++){
                
                if(i == 2)continue;
                System.out.println("---*" + "---*" + "---");
            }

            for (int a = 0; a < 9) {
                jogo[i][j] = aux;
                aux++;
            }
        }
    }
        
    
}
