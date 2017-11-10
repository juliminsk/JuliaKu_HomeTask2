package com.company.task1.vegetables;

public abstract class Vegetables {
    protected int weight;
    protected int calories;
    protected boolean GMO;
    protected String country;

    public abstract void cooking();

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public boolean isGMO() {
        return GMO;
    }

    public void setGMO(boolean GMO) {
        this.GMO = GMO;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
