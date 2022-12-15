
import java.util.ArrayList;
import java.util.List;


public class Tester {
    public static void main(String[] args) {
        List<Portata> piattiMenu = new ArrayList<>();

        Menu menu1 = new Menu("Menu Test", PreferencesEnum.VEGETARIANO, piattiMenu);

        //BEVANDE
        Bevande acqua25cl = new Bevande("ACQUA PANNA - SAN PELLEGRINO 25cl", 3.50, "Frizzante, Naturale");
        Bevande acqua75cl = new Bevande("ACQUA PANNA - SAN PELLEGRINO 75cl", 3.50, "Frizzante, Naturale");
        Bevande te = new Bevande("TÈ FREDDO", 3.50, "Limone, Pesca");
        Bevande succhi = new Bevande("SUCCHI DI FRUTTA PLOSE BIO 20cl", 4.50, "Limone, Pesca, Pera, Pesca, Albicocca, Ace, Mela, Ananas, Arancia e Pompelmo");
        Bevande bibiteLattina = new Bevande("BIBITE IN LATTINA", 4.00, "Coca-Cola, Coca-Cola Zero, Sprite, Estate', Fanta, Lemonsoda");

        //PRIMI PIATTI
        Primipiatti risoBianco = new Primipiatti("Riso Bianco",  2.50, "Ciotola di riso bianco e sesamo");
        Primipiatti risoFrutti = new Primipiatti("Riso Frutti", 10.00, "Riso alla piastra con frutti di mare");
        Primipiatti risoSalmone = new Primipiatti("Riso Salmone", 12.00, "Riso alla piastra con salmone");
        Primipiatti risoPollo = new Primipiatti("Riso Pollo", 10.00, "Riso alla piastra con pollo in salsa tariyaki");
        Primipiatti spaghettiUdon = new Primipiatti("Spaghetti udon Vegetariani", 7.00, "Spaghetti di grano tenero alla piastra con verdure");

        //SECONDI PIATTI
        Secondipiatti gamberiFritti = new Secondipiatti("Gamberi Fritti",6.00,"con mandorle");
        Secondipiatti gamberiThai = new Secondipiatti("Gamberi Thai",6.00,"Gamberi");
        Secondipiatti polloFritto = new Secondipiatti("Pollo Fritto",5.00,"Pollo");
        Secondipiatti filettoDiSalmone = new Secondipiatti("Filetto di Salmone",8.00,"Salmone e salsa Yakitori");

        //DESSERT
        Dessert friedNutella = new Dessert("fried nutella",3.50,"con nutella fritta");
        Dessert friedChocolateIceCream = new Dessert("fried chocolate ice cream",6.00,"con cioccolata fritta");
        Dessert sushiDessert = new Dessert("sushi dessert",6.00,"bocconcini di gelato e meringa alla frutta");
        Dessert sorbettoAlLimone = new Dessert("sorbetto al limone",3.50,"lemon sorbet");

        risoBianco.setPreferencesEnum(PreferencesEnum.VEGANO);
        risoFrutti.setPreferencesEnum(PreferencesEnum.VEGETARIANO);

        piattiMenu.add(acqua25cl);
        piattiMenu.add(acqua75cl);
        piattiMenu.add(te);
        piattiMenu.add(succhi);

        piattiMenu.add(risoBianco);
        piattiMenu.add(risoFrutti);
        piattiMenu.add(risoSalmone);
        piattiMenu.add(risoPollo);
        piattiMenu.add(spaghettiUdon);

        piattiMenu.add(gamberiFritti);
        piattiMenu.add(gamberiThai);
        piattiMenu.add(polloFritto);
        piattiMenu.add(filettoDiSalmone);

        piattiMenu.add(friedNutella);
        piattiMenu.add(friedChocolateIceCream);
        piattiMenu.add(sushiDessert);
        piattiMenu.add(sorbettoAlLimone);


        Cliente clienteVegeteriano = new Cliente("Rossella", "Bianchi", PreferencesEnum.VEGETARIANO);
        Cliente clienteVegano = new Cliente("Lorenzo", "De Lorenzi", PreferencesEnum.VEGANO);
        Cliente clienteOnnivoro = new Cliente("Alexandru", "Rossi", PreferencesEnum.ONNIVORO);
        System.out.println("-----------------------------");
        // Prova di un Tavolo

        Tavolo MaryRose = new Tavolo(12,clienteOnnivoro,2);
        System.out.println(MaryRose.getNumeroDiTavolo());
        System.out.println(MaryRose.getNumeroPosti());
        System.out.println(MaryRose.getCliente());
        menu1.printMenu();

    }
}