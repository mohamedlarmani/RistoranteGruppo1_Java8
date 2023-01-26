package Entities;

import Enum.*;


public class Primipiatti extends Portata{

    private String ingredients;

    public Primipiatti(String name, double price, PreferencesEnum preferencesEnum, String ingredients) {
        super(name, price, preferencesEnum);
        this.ingredients = ingredients;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public void printPortataDetail() {
        super.printPortataDetail();
        System.out.println( "\uD83C\uDF71 Ingredienti :  " + ingredients);
    }
}
