package com.company;

public class Excercise01 {
    public static void main(String[] args) {
        String example = "In a dishwasher far far away";
        String replacement = example.replace("dishwasher", "galaxy");
        example = replacement;
        System.out.println(example);
    }
}
