package com.company;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class Practice02 {
    public static void main (String[] args) {
        try {
            Path filePath = Paths.get("my-file.txt");
            List<String> lines = Files.readAllLines(filePath);
            for (int i = 0; i < lines.size() ; i++) {
                System.out.println(lines.get(i));

            }

        } catch (Exception e) {
            System.out.println("Unable to read file: my-file.txt");
        }


    }

}

