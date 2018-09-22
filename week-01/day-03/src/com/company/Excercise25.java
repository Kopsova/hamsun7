package com.company;

import java.util.Scanner;

public class Excercise25 {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);
        System.out.println("Please, type one number" );
        int numb = scenner.nextInt();
        System.out.println(numb);
        for (int a= 1; a<= 10; a++) {
            System.out.println(numb + "*" + a + "=" + ( numb*a));
        }



    }
}
