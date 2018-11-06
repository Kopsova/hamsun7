package com.company;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter one number");
        int userInput = scanner.nextInt();


        try {

            divideTen(userInput);
        } catch (ArithmeticException e) {
            System.out.println("Fail");
        }

    }


    public static void divideTen(int userInput) {


        System.out.println(10 / userInput);
    }

}
