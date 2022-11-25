public class Secondipiatti extends Portata{

    String ingredients;

    public Secondipiatti(String name, double price, String ingredients) {
        super(name, price);
        this.ingredients = ingredients;
    }

    @Override
    public void printPortataDetail() {
        super.printPortataDetail();
        System.out.println("Ingredienti "+ ingredients);
    }
}
