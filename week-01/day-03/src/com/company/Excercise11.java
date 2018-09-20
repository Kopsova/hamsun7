package com.company;

public class Excercise11 {
    public static void main(String[]args) {
        int a = 3;
        a *= 10;
        System.out.println(a);

        int b = 100;
        b /= 7;
        System.out.println(b);

        int c = 44;
        c *= 2;
        System.out.println(c);

        int d = 125;
        d /= 5;
        System.out.println(d);

        int e = 8;
        e *= 4;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean bigger = f1 > f2 ;
        System.out.println(bigger);

        int g1 = 350;
        int g2 = 200;
        boolean biggerDuble = g2 *2 > g1;
        System.out.println(biggerDuble);

        int h = 135798745;
        boolean isitdivasor = h % 11 == 0 ;
        System.out.println(isitdivasor);

        int i1 = 10;
        int i2 = 3;
        boolean whatisbigger = i1 > i2 *i2 && i1 < i2*i2*i2 ;
        System.out.println(whatisbigger);

        int j = 1521;
        boolean isitdividable = j%3== 0 || j%5 == 0;
        System.out.println(isitdividable);

        String k = "Apple";
        k = k+k+k+k;
        System.out.println(k);


    }
}
