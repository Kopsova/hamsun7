package com.company;

public class Excercise22 {
    public static void main (String[] args){
        double a = 24;
        int out = 0;
        // if a is even increment out by one
        if (a%2 == 0){
            out --;
        }

        System.out.println(out);

        int b = 13;
        String out2 = "";
        // if b is between 10 and 20 set out2 to "Sweet!"
        // if less than 10 set out2 to "Less!",
        // if more than 20 set out2 to "More!"
        if (b > 10 && b< 20){
            out2="Sweet!";
        }
        else if(b < 10){
            out2 = "Less!";
        }
        else {
            out2 = "More!";
        }


        System.out.println(out2);

        int c = 123;
        int credits = 100;
        boolean isBonus = false;
        // if credits are at least 50,
        // and isBonus is false decrement c by 2
        // if credits are smaller than 50,
        // and isBonus is false decrement c by 1
        // if isBonus is true c should remain the same
        if (credits >= 50 && isBonus == false){
            c -= 2;
        }
        else if (credits < 50 && isBonus == false){
            c -= 1;
        }
        else if ( isBonus == true){

        }


        System.out.println(c);











    }
}
