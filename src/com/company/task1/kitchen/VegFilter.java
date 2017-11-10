package com.company.task1.kitchen;

import com.company.task1.vegetables.Vegetables;

import java.util.ArrayList;

public class VegFilter {
    public static ArrayList<Vegetables> findVeg(Mixer mixer, String country, Integer maxCalories, Boolean gmo){
        ArrayList<Vegetables> filteredVeg= new ArrayList<Vegetables>();
        for (int i=0; i<mixer.getVegetables().size(); i++){
            Vegetables vegetable = mixer.getVegetables().get(i);
            boolean isOriginMatches = country == null;
            if (country != null && country.equals(vegetable.getCountry())){
                isOriginMatches = true;
            }
            boolean isMaxCalories = maxCalories == null;
            if (maxCalories != null && maxCalories.intValue() >= vegetable.getCalories()){
                isMaxCalories = true;
            }
            boolean isGMOMatches = gmo == null;
            if (gmo != null && gmo.booleanValue() == vegetable.isGMO()){
                isGMOMatches = true;
            }

            if (isGMOMatches && isMaxCalories && isOriginMatches){
                filteredVeg.add(vegetable);
            }
        }
        return filteredVeg;
    }
}
