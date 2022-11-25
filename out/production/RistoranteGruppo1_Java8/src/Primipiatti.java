public class Primipiatti extends Portata{

    String ingredients;

    public Primipiatti(String name, double price, String ingredients) {
        super(name, price);
        this.ingredients = ingredients;
    }

    @Override
    public void printPortataDetail() {
        super.printPortataDetail();
        System.out.println(ingredients);
    }
}
