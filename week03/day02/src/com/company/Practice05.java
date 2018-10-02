package com.company;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Practice05 {
    public static void main(String[]args) {
        writeFile("text.txt", "apple", 5);

    }


    public static void writeFile (String path, String word, int numbLines) {
        List<String> content = new ArrayList();


        try {
            Path filePath = Paths.get(path);
            for (int i = 0; i < numbLines; i++) {
                content.add(word);

            }
            Files.write(filePath,content);



        }catch (Exception e) {
            System.out.println("Unable to write file");
        }
    }


}



