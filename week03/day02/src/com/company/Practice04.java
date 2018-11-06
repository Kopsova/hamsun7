package com.company;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Practice04 {
    public static void main(String[] args) {
        List<String> content = new ArrayList();
        content.add("Ivana");
        try {
            Path filePath = Paths.get("new-file.txt");
            Files.write(filePath, content);
        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }

}

