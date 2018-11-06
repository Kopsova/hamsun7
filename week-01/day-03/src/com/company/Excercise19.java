package com.company;

public class Excercise19 {
    public static void main(String[] args) {
        int a = 6;

        if (a == 0 || a < 0) {
            System.out.println("Number \"a\" is not enough");
        }
        if (a == 1) {
            System.out.println("Number \"a\" is one");
        }
        if (a == 2) {
            System.out.println("Number \"a\" is two");
        } else if (a > 2) {
            System.out.println("Number \"a\" is a lot");
        }
    }
}
