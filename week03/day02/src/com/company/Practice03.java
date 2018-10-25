package com.company;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class Practice03 {
    public static void main (String[] args) {
        System.out.println(numbersOfLines("text.txt"));

    }


    public static int numbersOfLines(String fileName) {
        int count = 0;

        try {
            Path filePath = Paths.get(fileName);
            List<String> lines = Files.readAllLines(filePath);
            for (int i = 0; i < lines.size(); i++) {
                count++;

            }

        } catch (Exception e) {
            System.out.println("Unable to read file");
        }
        return count;
    }

}
