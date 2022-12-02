public class Dessert extends Portata {

    //TODO
   private  String ingredients;

    public Dessert(String name, double price, String ingredients) {
        super(name, price);
        this.ingredients = ingredients;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return  "Dessert: " + getName() + '\'' +
                " € " + getPrice()
                ;
    }


}