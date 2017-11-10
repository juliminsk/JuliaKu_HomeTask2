package com.company.task1.processor;

import com.company.task1.processor.exceptions.IncorrectUserInputException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputProcessor {
    public static int vegQuantity() {
        int vegCuantity;
        OutputProcessor.outputMessage("How many ingredients do you want?");
        while (true){
            try {
                vegCuantity = consoleInput();
                OutputProcessor.outputMessage("user Entered: " + vegCuantity, false);
                return vegCuantity;
            } catch (IncorrectUserInputException e) {
                OutputProcessor.outputMessage(e.getMessage());
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
        OutputProcessor.outputMessage("XXX. Enter maximum amount of calories (0 skip filter):");
        Integer input;
        while (true){
            try {
                input = consoleInput();
                if (input == 0) {
                    input = null;
                }
                OutputProcessor.outputMessage("user Entered: " + input, false);
                return input;
            } catch (IncorrectUserInputException e) {
                OutputProcessor.outputMessage(e.getMessage());
            }
        }
    }

    public static String readCountry() {
        OutputProcessor.outputMessage("XXX. Enter Country of origin [1] - 'Belarus', [2] - 'Import', [other] - Skip Filter");
        int input;
        while (true){
            try {
                input = consoleInput();
                break;
            } catch (IncorrectUserInputException e) {
                OutputProcessor.outputMessage(e.getMessage());
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
        OutputProcessor.outputMessage("user Entered: " + country, false);

        return country;
    }

    public static Boolean readGmo() {
        OutputProcessor.outputMessage("XXX. Enter if should be with GMO [0] - Without GMO, [1] - With GMO, [other] - Skip Filter");
        int input;
        while (true){
            try {
                input = consoleInput();
                break;
            } catch (IncorrectUserInputException e) {
                OutputProcessor.outputMessage(e.getMessage());
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
        OutputProcessor.outputMessage("user Entered: " + gmo, false);
        return gmo;
    }
}
