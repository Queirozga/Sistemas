package com.mycompany.ex_jeff_1;
import java.util.Scanner;

public class Ex_Jeff_1 {

    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
        int iddDoMeio = 0;
        
        System.out.println("Digite a idade 1: ");
        int idd1 = sc.nextInt();
        
        System.out.println("Digite a idade 2:  ");
        int idd2 = sc.nextInt();
        
        System.out.println("Digite a idade 3: ");
        int idd3 = sc.nextInt();
        
        
        if ((idd1 > idd2 && idd1 < idd3) || (idd1 == idd2 && idd1 < idd3)) {
            iddDoMeio = idd1;
        
        } else if ((idd2 > idd1 && idd2 < idd3) || (idd2 == idd1 && idd2 < idd3)) {
            iddDoMeio = idd2;
            
        } else {
            iddDoMeio = idd3;
        }
            
                                 
        System.out.println(iddDoMeio);
    }
}
