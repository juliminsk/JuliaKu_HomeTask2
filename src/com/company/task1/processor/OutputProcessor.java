package com.company.task1.processor;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OutputProcessor {

    private static String FILE_NAME = "log.txt";
    public static void outputMessage(String message, boolean outputToConsole){
        if (outputToConsole) {
            outputToConsole(message);
        }
        outputToFile(message);
    }

    public static void outputMessage(String message){
        outputMessage(message, true);
    }
    private static void outputToConsole(String message){
        System.out.println(message);
    }

    private static void outputToFile(String message){
        try {
            List<String> strings = Arrays.asList(message);
            if (Files.exists(Paths.get(FILE_NAME))){
                Files.write(Paths.get(FILE_NAME), strings, StandardOpenOption.APPEND);
            } else {
                Files.write(Paths.get(FILE_NAME), strings, StandardOpenOption.CREATE);
            }

        } catch (IOException e){
            System.out.println("Not possible to write to file: " + FILE_NAME + " message: '" + message + "'");
        }

    }


}
