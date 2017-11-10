package com.company.task1.vegetables;

public abstract class Vegetables {
    private String name;
    private int weight;
    private int calories;
    private boolean GMO;
    private String country;

    public Vegetables(String name, int weight, int calories, boolean GMO, String country) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
        this.GMO = GMO;
        this.country = country;
    }

    public abstract String cooking();

    public String printRecipe(){
        String recipeString = "To prepare "
                + this.toString() + " you need to: " + this.cooking();
        return recipeString;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    @Override
    public String toString() {
        return name + '(' +
                ", weight=" + weight +
                ", calories=" + calories +
                ", GMO=" + GMO +
                ", country='" + country + '\'' + ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vegetables that = (Vegetables) o;

        return getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
