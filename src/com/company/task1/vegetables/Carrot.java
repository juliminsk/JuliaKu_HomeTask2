package com.company.task1.vegetables;

public class Carrot extends Vegetables {

    public Carrot(String name, int weight, int calories, boolean GMO, String country) {
        super(name, weight, calories, GMO, country);
    }

    @Override
    public String cooking() {
        return "wash, clean and slice";
    }
}
