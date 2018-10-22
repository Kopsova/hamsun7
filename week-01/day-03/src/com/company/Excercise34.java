package com.company;

import java.util.Scanner;

public class Excercise34 {
    /*
Write a program that asks for a number.
It would ask this many times to enter an integer,
if all the integers are entered, it should print the sum and average of these
integers like:

Sum: 22, Average: 4.4
*/

    public static void main(String[] args) {

        Scanner scenner = new Scanner(System.in);
        System.out.println("Please type how many numbers you want to enter");
        int numbEntry = scenner.nextInt();


        int sum = 0;

        for (int i = 0; i < numbEntry; i++) {
            System.out.println("Please type one number");
            int number = scenner.nextInt();
            sum += number;

             }

            System.out.println("Sum of all entered numbers is: " + sum);


            System.out.println("Average of all entered numbers is: " + (sum / numbEntry));


        }
    }

