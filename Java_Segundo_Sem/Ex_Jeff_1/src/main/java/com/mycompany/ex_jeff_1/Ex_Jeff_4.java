package com.mycompany.ex_jeff_1;
import java.util.Scanner;
public class Ex_Jeff_4 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int duplo, pecas = 0;
        System.out.println("Duplo: ");
        duplo = sc.nextInt();

        for (int i = 1; i <= duplo + 1; i++) {
            pecas += i;
        }
        System.out.println(pecas);

    }
}
