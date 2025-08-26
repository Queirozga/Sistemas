package com.mycompany.ex_jeff_1;
import java.util.Scanner;

public class Ex_Jeff_5 {
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
        
        int[] carroca1 = new int[3];
        int[] carroca2 = new int[3];
        
        double tempo1, tempo2;
        
        System.out.println("Código carroça 1: ");
        carroca1[0] = sc.nextInt();
        System.out.println("Distância carroça 1 (metros): ");
        carroca1[1] = sc.nextInt();
        System.out.println("Velocidade carroça 1 (Km/h): ");
        carroca1[2] = sc.nextInt();
        
        System.out.println("Código carroça 2: ");
        carroca2[0] = sc.nextInt();
        System.out.println("Distância carroça 2 (metros): ");
        carroca2[1] = sc.nextInt();
        System.out.println("Velocidade carroça 2 (Km/h): ");
        carroca2[2] = sc.nextInt();
        
        tempo1 = carroca1[1] / (carroca1[2] * 3.6); 
        tempo2 = carroca2[1] / (carroca2[2] * 3.6);
        
        
        if (tempo1 < tempo2) {
            System.out.println(carroca1[0]);
            
        } else {
            System.out.println(carroca2[0]);
        }
        
                

    }
}
