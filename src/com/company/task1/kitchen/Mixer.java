package com.company.task1.kitchen;

import com.company.task1.console.Console;
import com.company.task1.kitchen.exceptions.NotEnoughProductsInFridgeException;
import com.company.task1.vegetables.*;

import java.util.ArrayList;
import java.util.Random;

public class Mixer {
    private ArrayList<Vegetables> vegetables;

    public ArrayList<Vegetables> getVegetables() {
        return vegetables;
    }

    public void setVegetables(ArrayList<Vegetables> vegetables) {
        this.vegetables = vegetables;
    }

    public Mixer(ArrayList vegetables) {
        this.vegetables = vegetables;
    }

    public static Mixer fillMixer(Fridge fridge, int quantity) {
        Random random = new Random();
        ArrayList<Vegetables> veggi = new ArrayList<>();
        while (true){
            try {
                validator(fridge,quantity);
                for (int i=0; i<quantity; i++){
                    int product = random.nextInt(fridge.getVegetables().size());
                    Vegetables someVeg = fridge.getVegetables().get(product);
                    someVeg.cooking();
                    veggi.add(someVeg);
                    fridge.getVegetables().remove(product);
                    System.out.println("Salad is ready");
                    return new Mixer(veggi);
                }
            } catch (NotEnoughProductsInFridgeException e){
                System.out.println(e.getMessage());
                Console.vegQuantity();
            }
        }

    }

    private static void validator (Fridge fridge, int quantity) throws NotEnoughProductsInFridgeException {
        try {
            fridge.getVegetables().get(quantity);
        }
        catch (IndexOutOfBoundsException e){
            throw new NotEnoughProductsInFridgeException("Not enough ingredients, please, try again", e);
        }
    }
}
