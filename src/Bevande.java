public class Bevande extends Portata {

    private String type;

    public Bevande(String name, double price) {
        super(name, price);
    }

    public Bevande(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    @Override
    public void printPortataDetail() {
        super.printPortataDetail();
        System.out.println(type);
    }



}
