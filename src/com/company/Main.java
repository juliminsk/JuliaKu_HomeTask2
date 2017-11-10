package com.company;

import com.company.task1.console.Console;
import com.company.task1.kitchen.Fridge;
import com.company.task1.kitchen.Mixer;
import com.company.task1.kitchen.VegFilter;
import com.company.task1.vegetables.Vegetables;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Time to make a salad!");
        Fridge fridge = Fridge.fillFridge();
        int vegQuantity = Console.vegQuantity();
        Mixer mixveg = Mixer.fillMixer(fridge,vegQuantity);

        ArrayList <Vegetables> resultVeg = VegFilter.findVeg(mixveg, Console.readCountry(), Console.readCalories(),Console.readGmo());
        for (int i=0; i<resultVeg.size(); i++){
            System.out.println(resultVeg.get(i));
        }
    }
}
