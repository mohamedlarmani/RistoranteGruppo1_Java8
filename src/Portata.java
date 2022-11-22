
public class Portata{

    private String name;
    private double price;
    private String ingredients;



    public Portata(String name, double price, String ingredients){

        this.name = name;
        this.price = price;
        this.ingredients = ingredients;

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

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void printPortataDetail(){
        System.out.println(name + " " + price);
        System.out.println(ingredients);
    }

}