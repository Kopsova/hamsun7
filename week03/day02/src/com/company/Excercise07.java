package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Excercise07 {
    public static void main(String [] args) {
        System.out.println(getUniqueIps("log.txt").size());

    }

    public static List<String> getUniqueIps(String filename) {
        List<String> uniqueIps = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(filename));
            for(String line : lines) {
                if (!uniqueIps.contains(line.split("   ")[1])) {
                    uniqueIps.add(line.split("   ")[1]);


                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return uniqueIps;
    }
}
