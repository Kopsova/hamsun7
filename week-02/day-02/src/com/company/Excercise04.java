package com.company;

public class Excercise04 {
    public static void main(String[] args) {
        String todoText = " - Buy milk \n";
        StringBuilder list = new StringBuilder(todoText);
        list.append(" - Download games \n" + "   - Diablo");

        System.out.println("My todo:\n" + list);
    }
}
