public class Dessert extends Portata {

   private  String ingredients;

    public Dessert(String name, double price, PreferencesEnum preferencesEnum, String ingredients) {
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
        System.out.println(" \uD83C\uDF6C Dolci : " + ingredients);
    }
}