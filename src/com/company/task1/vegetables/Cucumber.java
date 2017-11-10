package com.company.task1.vegetables;

public class Cucumber extends Vegetables {

    public Cucumber(String name, int weight, int calories, boolean GMO, String country) {
        super(name, weight, calories, GMO, country);
    }


    @Override
    public String cooking() {
        return "put in slicer-dicer";
    }
}
