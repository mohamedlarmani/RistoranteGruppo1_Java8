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
    public void printPortataDetail() {
        super.printPortataDetail();
        System.out.println("Ingredienti "+ ingredients);
    }

}
