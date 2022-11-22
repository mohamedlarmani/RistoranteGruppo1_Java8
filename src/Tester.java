

public class Tester {

    public static void main(String[] args) {

        Portata risoBianco = new Portata("Riso Bianco", 2.50, "Ciotola di riso bianco e sesamo");
        Portata risoFrutti = new Portata("Riso Fruti",  10.00, "Riso alla piastra con frutti di mare");
        Portata risoSalmone = new Portata("Riso Salmone", 12.00, "Riso alla piastra con salmone");

        risoBianco.printPortataDetail();
        risoFrutti.printPortataDetail();
        risoSalmone.printPortataDetail();


    }
}
