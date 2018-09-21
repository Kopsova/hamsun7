package com.company;

import java.util.Scanner;

public class Excercise17 {
    public static void main(String[]args) {
        Scanner scenner = new Scanner(System.in);
        System.out.println("Please, enter five numbers");
        int number1 = scenner.nextInt();
        System.out.println(number1);
        int number2 = scenner.nextInt();
        System.out.println(number2);
        int number3 = scenner.nextInt();
        System.out.println(number3);
        int number4 = scenner.nextInt();
        System.out.println(number4);
        int number5 = scenner.nextInt();
        System.out.println(number5);
        System.out.println(number1+number2+number3+number4+number5);
        System.out.println((number1+number2+number3+number4+number5)/ 5);




    }
}
