package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Excercise11 {
    public static void main(String... args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        checkNums(list);
        // Check if list contains all of the following elements: 4,8,12,16
        // Create a method that accepts list as an input
        // it should return "true" if it contains all, otherwise "false"

    }

    public static boolean checkNums(ArrayList listOfNums) {
        ArrayList<Integer> listNums = new ArrayList<>(Arrays.asList(4, 8, 12, 16));
        if (listOfNums.containsAll(listNums)) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }
}
