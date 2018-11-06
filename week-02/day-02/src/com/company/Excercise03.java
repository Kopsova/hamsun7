package com.company;

public class Excercise03 {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        StringBuilder newquote = new StringBuilder(quote);
        newquote.insert(newquote.indexOf("you"), "always takes longer than ");
        System.out.println(newquote);


    }
}
