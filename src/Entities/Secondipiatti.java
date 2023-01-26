package Entities;
import Enum.*;

public class Secondipiatti extends Portata{

   private String ingredients;

    public Secondipiatti(String name, double price, PreferencesEnum preference, String ingredients) {
        super(name, price, preference);
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
        System.out.println("\uD83C\uDF65 Secondi piatti : " + " " + ingredients);
    }




}
