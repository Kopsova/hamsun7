package com.company;

import java.util.Scanner;

public class Excercise26 {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);
        System.out.println("Please, enter two numbers");
        int n1 = scenner.nextInt();
        int n2 = scenner.nextInt();
        if (n2 < n1) {
            System.out.println("The second number should be bigger");
        } else {
            for (int i = n1; i < n2; i++) {
                System.out.println(i);
            }

        }

    }
}
