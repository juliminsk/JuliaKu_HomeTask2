package com.company.task1.vegetables;

public class Pepper extends Vegetables {
    public Pepper(int weight, int calories, String country, boolean GMO) {

        this.weight = weight;
        this.calories = calories;
        this.country = country;
        this.GMO = GMO;
    }

    @Override
    public void cooking() {
        System.out.println("Preparing pepper");
    }
}
