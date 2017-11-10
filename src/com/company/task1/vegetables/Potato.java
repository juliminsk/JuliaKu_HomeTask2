package com.company.task1.vegetables;

public class Potato extends Vegetables{

    public Potato(String name, int weight, int calories, boolean GMO, String country) {
        super(name, weight, calories, GMO, country);
    }

    @Override
    public String cooking() {
        return "Wash and put away the peel";
    }
}
