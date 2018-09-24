package com.company;

public class Excercise04 {
    public static void main(String [] args) {
        int a = 3;
        sum(a);
        sum(15);
    }

    public static void sum(int allSum){
        int sum = 0 ;
        for (int i =1; i<= allSum; i++) {
            sum += i;


        }
        System.out.println(sum);
    }


}
