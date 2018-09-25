package com.company;

public class Excercise05 {
    public static void main (String[] args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        StringBuilder reverse = new StringBuilder(reversed);
        reverse.reverse();
        System.out.println(reverse);
    }
}
