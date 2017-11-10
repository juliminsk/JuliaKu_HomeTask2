package com.company.task1.console;

import com.company.task1.console.exceptions.IncorrectUserInputException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {
    public static int vegQuantity() {
        int vegCuantity;
        System.out.println("How many ingredients do you want?");
        while (true){
            try {
                vegCuantity = consoleInput();
                return vegCuantity;
            } catch (IncorrectUserInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static Integer consoleInput() throws IncorrectUserInputException {
        int input;
        Scanner scanner = new Scanner(System.in);
        try {
            input = scanner.nextInt();
        } catch (InputMismatchException e){
            throw new IncorrectUserInputException("Please, enter valid numbers", e);
        }
        return input;
    }

    public static Integer readCalories() {
        System.out.println("Calories?");
        Integer input;
        while (true){
            try {
                input = consoleInput();
                if (input == 0) {
                    input = null;
                }
                return input;
            } catch (IncorrectUserInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String readCountry() {
        System.out.println("Country?");
        int input;
        while (true){
            try {
                input = consoleInput();
                break;
            } catch (IncorrectUserInputException e) {
                System.out.println(e.getMessage());
            }
        }
        String country;
        switch (input){
            case 1:
                country = "Belarus";
                break;
            case 2:
                country = "Import";
                break;
            default:
                country = null;
                break;
        }
        return country;
    }

    public static Boolean readGmo() {
        System.out.println("GMO?");
        int input;
        while (true){
            try {
                input = consoleInput();
                break;
            } catch (IncorrectUserInputException e) {
                System.out.println(e.getMessage());
            }
        }
        Boolean gmo;
        switch (input){
            case 0:
                gmo = false;
                break;
            case 1:
                gmo = true;
                break;
            default:
                gmo = null;
        }
        return gmo;
    }
}
