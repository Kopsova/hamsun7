package com.company;

public class Excercise12 {
    public static void main(String[]args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int secondsInaDay = 24 * 60 *60;
        int curentSecondTime = ( currentHours *60 *60 ) + ( currentMinutes *60 ) + currentSeconds;
        int remainingSeconds = secondsInaDay - curentSecondTime ;
        System.out.println(remainingSeconds);
    }
}
