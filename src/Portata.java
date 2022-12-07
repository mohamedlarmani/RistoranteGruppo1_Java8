
public class Portata{

    private String name;
    private double price;

    private PreferencesEnum preferencesEnum;

    public Portata(String name, double price){
        this.name = name;
        this.price = price;
    }

    //TODO Eliminare
    /*public boolean isVegetariano() {
        return isVegetariano;
    }

    public void setVegetariano(boolean vegetariano) {
        isVegetariano = vegetariano;
    }

    public boolean isVegano() {
        return isVegano;
    }

    public void setVegano(boolean vegano) {
        isVegano = vegano;
    }*/


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
        System.out.println(name + "  €" + price);
    }

    //TODO eliminare
    @Override
    public String toString() {
        return  "Portata: " + name + '\'' +
                " € " + price
                ;
    }


}