

public class Tester {
    public static void main(String[] args) {
        Primipiatti risoBianco = new Primipiatti("Riso Bianco",  2.50, "Ciotola di riso bianco e sesamo");
        Primipiatti risoFrutti = new Primipiatti("Riso Frutti", 10.00, "Riso alla piastra con frutti di mare");
        Primipiatti risoSalmone = new Primipiatti("Riso Salmone", 12.00, "Riso alla piastra con salmone");
        Primipiatti risoPollo = new Primipiatti("Riso Pollo", 10.00, "Riso alla piastra con pollo in salsa tariyaki");
        Primipiatti spaghettiUdon = new Primipiatti("Spaghetti udon Vegetariani", 7.00, "Spaghetti di grano tenero alla piastra con verdure");

        risoBianco.printPortataDetail();
        risoFrutti.printPortataDetail();
        risoSalmone.printPortataDetail();
        risoPollo.printPortataDetail();
        spaghettiUdon.printPortataDetail();

        System.out.println("----------------------");
        Secondipiatti gamberiFritti = new Secondipiatti("Gamberi Fritti",6.00,"con mandorle");
        Secondipiatti gamberiThai = new Secondipiatti("Gamberi Thai",6.00,"Gamberi");
        Secondipiatti polloFritto = new Secondipiatti("Pollo Fritto",5.00,"Pollo");
        Secondipiatti filettoDiSalmone = new Secondipiatti("Filetto di Salmone",8.00,"Salmone e salsa Yakitori");

        gamberiFritti.printPortataDetail();
        gamberiThai.printPortataDetail();
        polloFritto.printPortataDetail();
        filettoDiSalmone.printPortataDetail();


    }
}
