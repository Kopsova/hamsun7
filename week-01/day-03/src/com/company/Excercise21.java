package com.company;

import java.util.Scanner;

public class Excercise21 {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);
        System.out.println("Please,type number of girls and number of boys coming to the party");
        int girls = scenner.nextInt();
        int boys = scenner.nextInt();
        int all = girls + boys;

        if (girls == boys &&  all == 20 || all > 20) {
            System.out.println("The party is excellent!");
        }
        if( all > 20 && girls != boys) {
            System.out.println("Quite cool party!");
        }
        if ( all < 20) {
            System.out.println("Average party..");
        }
        if ( girls == 0) {
            System.out.println("Sausage party");
        }
    }
}
