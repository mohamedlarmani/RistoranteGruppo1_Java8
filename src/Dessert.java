public class Dessert extends Portata {

    //TODO il metodo toString non serve a stampare perchè il tostring è :  11232324234234@nomeclasseeccecc
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
    public void printPortataDetail() {
        super.printPortataDetail();
        System.out.println(ingredients);
    }
}