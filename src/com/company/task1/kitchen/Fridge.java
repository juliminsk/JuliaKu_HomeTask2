package com.company.task1.kitchen;

import com.company.task1.processor.OutputProcessor;
import com.company.task1.vegetables.*;

import java.util.ArrayList;
import java.util.Random;

public class Fridge {
    private ArrayList<Vegetables> vegetables;

    public ArrayList<Vegetables> getVegetables() {
        return vegetables;
    }

    public void setVegetables(ArrayList<Vegetables> vegetables) {
        this.vegetables = vegetables;
    }

    public Fridge (ArrayList vegetables) {
        this.vegetables = vegetables;
    }

    public static Fridge fillFridge() {
        Random random = new Random();
        ArrayList<Vegetables> veggi = new ArrayList<Vegetables>();
        OutputProcessor.outputMessage("Filling the fridge...");
        OutputProcessor.outputMessage("");
        for (int i=0; i<20; i++){
            int product = random.nextInt(6);
            Vegetables someVeg;
            int weight = random.nextInt(300);
            int calories = random.nextInt(100);
            String country = random.nextBoolean()?  "Belarus" : "Import";
            Boolean GMO = random.nextBoolean();
            switch (product){
                case 0: {
                    someVeg = new Tomato ("Tomato", weight, calories, GMO, country);
                    break;
                }
                case 1: {
                    someVeg = new Cucumber("Cucumber", weight, calories, GMO, country);;
                    break;
                }
                case 2: {
                    someVeg = new Potato ("Potato", weight, calories, GMO, country);;
                    break;
                }
                case 3: {
                    someVeg = new Cabbage("Cabbage", weight, calories, GMO, country);;
                    break;
                }
                case 4: {
                    someVeg = new Carrot ("Carrot", weight, calories, GMO, country);;
                    break;
                }
                case 5: {
                    someVeg = new Pepper ("Pepper", weight, calories, GMO, country);;
                    break;
                }
                default:{
                    someVeg = new Pepper("Pepper", weight, calories, GMO, country);;
                }
            }
            veggi.add(someVeg);
        }
        return new Fridge(veggi);
    }
}
