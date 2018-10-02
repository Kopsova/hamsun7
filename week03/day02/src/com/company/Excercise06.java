package com.company;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class Excercise06 {
    public static void main (String[] args) {
        copyFiles("new-file.txt", "text.txt");

    }


    public static boolean copyFiles (String copyFrom, String copyTo) {
        Path originalFile = Paths.get(copyFrom);
        Path destinationFile = Paths.get (copyTo);

        try {
            List<String> lines = Files.readAllLines(originalFile);
            Files.write(destinationFile, lines);
            return true;
        }catch(Exception e) {
            return false;
        }


    }

}
