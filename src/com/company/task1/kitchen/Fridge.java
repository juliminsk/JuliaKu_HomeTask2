package com.company.task1.kitchen;

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
        System.out.println("Filling the fridge...");
        System.out.println();
        for (int i=0; i<20; i++){
            int product = random.nextInt(6);
            Vegetables someVeg;
            int weight = random.nextInt(300);
            int calories = random.nextInt(100);
            String country = random.nextBoolean()?  "Belarus" : "Import";
            Boolean GMO = random.nextBoolean();
            switch (product){
                case 0: {
                    someVeg = new Tomato (weight, calories, country, GMO);
                    break;
                }
                case 1: {
                    someVeg = new Cucumber(weight, calories, country, GMO);
                    break;
                }
                case 2: {
                    someVeg = new Potato (weight, calories, country, GMO);
                    break;
                }
                case 3: {
                    someVeg = new Cabbage(weight, calories, country, GMO);
                    break;
                }
                case 4: {
                    someVeg = new Carrot (weight, calories, country, GMO);
                    break;
                }
                case 5: {
                    someVeg = new Pepper (weight, calories, country, GMO);
                    break;
                }
                default:{
                    someVeg = new Pepper(weight, calories, country, GMO);
                }
            }
            veggi.add(someVeg);
        }
        return new Fridge(veggi);
    }
}
