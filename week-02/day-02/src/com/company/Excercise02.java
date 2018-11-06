package com.company;

public class Excercise02 {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";
        String change = url.replace("bots", "odds");
        String add = change.substring(0, 5) + ":" + change.substring(5, change.length());
        url = add;

        System.out.println(url);

    }
}
