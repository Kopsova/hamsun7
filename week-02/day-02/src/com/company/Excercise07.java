package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Excercise07 {
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList makingMatches(ArrayList<String> list1, ArrayList<String> list2) {


        ArrayList<String> finalList = new ArrayList<>();


        for (int i = 0; i < list1.size(); i++) {

            finalList.add(list1.get(i));
            finalList.add(list2.get(i));

        }
        return finalList;
    }
}
