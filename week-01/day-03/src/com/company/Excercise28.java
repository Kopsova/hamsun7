package com.company;

import java.util.Scanner;

public class Excercise28 {
    public static void main(String [] args) {
        Scanner scenner = new Scanner(System.in);
        System.out.println("Please, type number of rows");
        int numbRows = scenner.nextInt();
        for (int i=1; i <= numbRows; i++ ) {
            for (int j= 1; j<= i; j++) {
                System.out.print( "*");
            }
            System.out.println( );

        }

    }
}
