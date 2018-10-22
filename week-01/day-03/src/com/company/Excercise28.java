package com.company;

import java.util.Scanner;

public class Excercise28 {
    // Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
    public static void main(String[] args) {

        Scanner scenner = new Scanner(System.in);
        System.out.println("Please type number of rows");
        int numbRows = scenner.nextInt();

        for (int i = 1; i <= numbRows ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
