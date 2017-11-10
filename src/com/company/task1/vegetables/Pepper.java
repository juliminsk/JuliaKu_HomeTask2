package com.company.task1.vegetables;

public class Pepper extends Vegetables {

    public Pepper(String name, int weight, int calories, boolean GMO, String country) {
        super(name, weight, calories, GMO, country);
    }

    @Override
    public String cooking() {
        return "wash and slice";
    }
}
