public class Secondipiatti extends Portata{

   private String ingredients;


    public Secondipiatti(String name, double price, String ingredients) {
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
        return  "Secondi Piatti: " + getName() + '\'' +
                " € " + getPrice()
                ;
    }

}
