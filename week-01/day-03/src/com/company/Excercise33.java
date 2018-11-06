package com.company;

import java.util.Scanner;

public class Excercise33 {
    /*
Write a program that stores a number, and the user has to figure it out.
The user can input guesses, after each guess the program would tell one
of the following:

The stored number is higher
The stried number is lower
You found the number: 8
*/
    public static void main(String[] args) {

        int number = 8;

        Scanner scenner = new Scanner(System.in);
        System.out.println("Please, guess the number");
        int inputNumb = scenner.nextInt();

        if (inputNumb < number) {
            System.out.println("The stored number is higher");
        } else if (inputNumb > number) {
            System.out.println("The stried number is lower");
        } else {
            System.out.println("You found the number: " + number);
        }


    }
}
