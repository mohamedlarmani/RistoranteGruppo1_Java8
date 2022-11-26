public class Dessert extends Portata {

    String ingredients;

    public Dessert(String name, double price, String ingredients) {
        super(name, price);
        this.ingredients = ingredients;
    }

    @Override
    public void printPortataDetail() {
        super.printPortataDetail();
        System.out.println("Ingredienti " + ingredients);
    }
}