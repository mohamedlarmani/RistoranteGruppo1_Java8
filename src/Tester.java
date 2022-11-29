
public class Tester {
    public static void main(String[] args) {



        System.out.println("----------BEVANDE-----------");
        Bevande acqua25cl = new Bevande("ACQUA PANNA - SAN PELLEGRINO 25cl", 3.50, "Frizzante, Naturale");
        Bevande acqua75cl = new Bevande("ACQUA PANNA - SAN PELLEGRINO 75cl", 3.50, "Frizzante, Naturale");
        Bevande te = new Bevande("TÈ FREDDO", 3.50, "Limone, Pesca");
        Bevande succhi = new Bevande("SUCCHI DI FRUTTA PLOSE BIO 20cl", 4.50, "Limone, Pesca, Pera, Pesca, Albicocca, Ace, Mela, Ananas, Arancia e Pompelmo");
        Bevande bibiteLattina = new Bevande("BIBITE IN LATTINA", 4.00, "Coca-Cola, Coca-Cola Zero, Sprite, Estate', Fanta, Lemonsoda");

        acqua25cl.printPortataDetail();
        acqua75cl.printPortataDetail();
        te.printPortataDetail();
        succhi.printPortataDetail();
        bibiteLattina.printPortataDetail();


        System.out.println("----------PRIMI PIATTI-----------");
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

        System.out.println("----------SECONDI PIATTI------------");
        Secondipiatti gamberiFritti = new Secondipiatti("Gamberi Fritti",6.00,"con mandorle");
        Secondipiatti gamberiThai = new Secondipiatti("Gamberi Thai",6.00,"Gamberi");
        Secondipiatti polloFritto = new Secondipiatti("Pollo Fritto",5.00,"Pollo");
        Secondipiatti filettoDiSalmone = new Secondipiatti("Filetto di Salmone",8.00,"Salmone e salsa Yakitori");

        gamberiFritti.printPortataDetail();
        gamberiThai.printPortataDetail();
        polloFritto.printPortataDetail();
        filettoDiSalmone.printPortataDetail();


        System.out.println("----------DESSERT------------");
        Dessert friedNutella = new Dessert("fried nutella",3.50,"con nutella fritta");
        Dessert friedChocolateIceCream = new Dessert("fried chocolate ice cream",6.00,"con cioccolata fritta");
        Dessert sushiDessert = new Dessert("sushi dessert",6.00,"bocconcini di gelato e meringa alla frutta");
        Dessert sorbettoAlLimone = new Dessert("sorbetto al limone",3.50,"lemon sorbet");

        friedNutella.printPortataDetail();
        friedChocolateIceCream.printPortataDetail();
        sushiDessert.printPortataDetail();
        sorbettoAlLimone.printPortataDetail();

    }
}
