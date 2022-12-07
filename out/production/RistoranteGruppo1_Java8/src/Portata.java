
public class Portata{

    private String name;
    private double price;

    private PreferencesEnum preferencesEnum;

    public Portata(String name, double price){
        this.name = name;
        this.price = price;
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