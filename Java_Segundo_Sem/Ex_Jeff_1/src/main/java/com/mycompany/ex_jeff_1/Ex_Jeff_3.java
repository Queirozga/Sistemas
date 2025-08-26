package com.mycompany.ex_jeff_1;
import java.util.Scanner;

public class Ex_Jeff_3 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int s, a, b, somados = 0;
        String auxI;


        System.out.println("S: ");
        s = sc.nextInt();
        System.out.println("A: ");
        a = sc.nextInt();
        System.out.println("B: ");
        b = sc.nextInt();

        if (s < 1 || s > 36 || a < 1 || a > 10000 || b < 1 || b > 10000 || a > b) {
            System.out.println("Algo está errado! \nO S só pode ir até 36 e A/B até 10000");
            return;
        }

        for (int i = a; i <= b; i++) {
            int soma = 0;
            int n = i;
            while (n > 0) {
                soma = soma + n % 10;
                n = n / 10;
            }
            if (soma == s) somados++;
        }

        System.out.println(somados);
    }
}
