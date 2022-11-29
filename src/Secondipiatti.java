public class Secondipiatti extends Portata{

    //TODO mettere sempre il modificatore di accesso e getter e setter perchè queste deve essere private
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
