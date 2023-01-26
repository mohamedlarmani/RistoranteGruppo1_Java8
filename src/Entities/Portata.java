package Entities;
import Enum.*;

public class Portata{

    private String name;
    private double price;
    private PreferencesEnum preferencesEnum;

    public Portata(String name, double price, PreferencesEnum preferencesEnum){
        this.name = name;
        this.price = price;
        this.preferencesEnum = preferencesEnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public PreferencesEnum getPreferencesEnum() {
        return preferencesEnum;
    }

    public void setPreferencesEnum(PreferencesEnum preferencesEnum) {
        this.preferencesEnum = preferencesEnum;
    }


    public void printPortataDetail(){
        System.out.println( " ▸  €  "  + price + "        Entities.Portata : " + " " + name );
    }

}


