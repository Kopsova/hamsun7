package com.company;

public class Excercise05 {
    public static void main(String[] args) {
        int a = 5;
        factorio(a);
    }

    public static void factorio(int willBefactorized) {
        int sum = 1;

        for (int i = 1; i <= willBefactorized; i++) {
            sum *= i;

        }
        System.out.println(sum);
    }
}
