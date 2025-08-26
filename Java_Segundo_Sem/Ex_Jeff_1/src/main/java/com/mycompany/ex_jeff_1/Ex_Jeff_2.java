package com.mycompany.ex_jeff_1;
import java.util.Scanner;

public class Ex_Jeff_2 {
    
    public static void main(String[] args){
     
        var sc = new Scanner(System.in);

        int participante, vitorias = 0, derrotas = 0, grupo = 0;
        char result, aux;
        
        for (int i = 0; i < 6; i++) {
            System.out.println("Resultado: ");
            result = sc.next().charAt(0);
            aux = Character.toUpperCase(result);
            
            if (aux == 'V') vitorias++;
            if (aux == 'P') derrotas++;
            if (aux != 'V' && aux != 'P') System.out.println("Opção inválida!");
        }
        
        if (vitorias == 1 || vitorias == 2 || vitorias == 5 || vitorias == 6 ) grupo = 1;
        if (vitorias == 3 || vitorias == 4) grupo = 2;
        if (vitorias == 0) grupo = -1;
        
        System.out.println(grupo);
    }
}
