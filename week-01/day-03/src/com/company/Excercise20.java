package com.company;

import java.util.Scanner;

public class Excercise20<number2> {
    public static void main(String[]args) {
        Scanner scenner = new Scanner(System.in);
        System.out.println("Please type two numbers");
        int number1 = scenner.nextInt();
        System.out.println(number1);
        int number2 = scenner.nextInt();
        System.out.println(number2);
        if ( number1 > number2) {
            System.out.println(number1);
        }
        else {
            System.out.println(number2);
        }
    }

}
