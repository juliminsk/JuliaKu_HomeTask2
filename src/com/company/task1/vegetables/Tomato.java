package com.company.task1.vegetables;

public class Tomato extends Vegetables {

    public Tomato(String name, int weight, int calories, boolean GMO, String country) {
        super(name, weight, calories, GMO, country);
    }

    @Override
    public String cooking() {
        return "Slice into small pieces";
    }
}
