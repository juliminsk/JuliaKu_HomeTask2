package com.company.task1.kitchen;

import com.company.task1.kitchen.exceptions.DuplicatedProductException;
import com.company.task1.kitchen.exceptions.NotEnoughProductsInFridgeException;
import com.company.task1.processor.OutputProcessor;
import com.company.task1.vegetables.*;

import java.util.*;

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

    public static Mixer fillMixer(Fridge fridge, int quantity) throws NotEnoughProductsInFridgeException {
        if (fridge.getVegetables().size() < quantity){
            throw new NotEnoughProductsInFridgeException("Not enough ingredients, please, try again");
        }
        Set<Vegetables> uniqueProducts = new HashSet<Vegetables>(fridge.getVegetables());

        if (uniqueProducts.size() < quantity){
            throw new NotEnoughProductsInFridgeException("In Fridge there is not enough unique products!");
        }
        Random random = new Random();
        ArrayList<Vegetables> veggi = new ArrayList<>();
        int i=0;
        while (i < quantity){
            try {
                int product = random.nextInt(fridge.getVegetables().size());
                Vegetables someVeg = fridge.getVegetables().get(product);
                if (veggi.contains(someVeg)){
                    throw new DuplicatedProductException("Trying to take " + someVeg.getName() + " , but we already took it. Let's take smth else");
                }
                i++;
                OutputProcessor.outputMessage(someVeg.printRecipe());
                veggi.add(someVeg);
                fridge.getVegetables().remove(product);
            } catch (DuplicatedProductException e) {
                OutputProcessor.outputMessage(e.getMessage(), false);
            }


        }
        OutputProcessor.outputMessage("Salad is ready");
        return new Mixer(veggi);

    }
}

