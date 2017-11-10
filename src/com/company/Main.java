package com.company;

import com.company.task1.processor.InputProcessor;
import com.company.task1.kitchen.Fridge;
import com.company.task1.kitchen.Mixer;
import com.company.task1.kitchen.VegFilter;
import com.company.task1.kitchen.exceptions.NotEnoughProductsInFridgeException;
import com.company.task1.processor.OutputProcessor;
import com.company.task1.vegetables.Vegetables;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        OutputProcessor.outputMessage("---------------------------------------------------------");
        OutputProcessor.outputMessage("Time to make a salad!");
        Fridge fridge = Fridge.fillFridge();
        while(true) {
            try {
                int vegQuantity = InputProcessor.vegQuantity();
                Mixer mixveg = Mixer.fillMixer(fridge, vegQuantity);
                ArrayList <Vegetables> resultVeg = VegFilter.findVeg(mixveg, InputProcessor.readCountry(), InputProcessor.readCalories(), InputProcessor.readGmo());
                for (int i=0; i<resultVeg.size(); i++){
                    OutputProcessor.outputMessage(resultVeg.get(i).toString());
                }
                break;
            } catch (NotEnoughProductsInFridgeException e) {
                OutputProcessor.outputMessage(e.getMessage());
            }
        }
        OutputProcessor.outputMessage("---------------------------------------------------------");

    }
}
