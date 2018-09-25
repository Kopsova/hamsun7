package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Excercise06 {
    public static void main(String[] args){
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

        System.out.println(putSaturn(planetList));

    }
    public static ArrayList putSaturn(ArrayList list) {
        list.add(5,"Saturn");
        return list;


    }

}
