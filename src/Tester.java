

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Tester {
    public static void main(String[] args) {
        List<Portata> piattiMenu = new ArrayList<>();

        Menu menu1 = new Menu("Menu Test", PreferencesEnum.ONNIVORO, piattiMenu);


        //BEVANDE
        Bevande acqua25cl = new Bevande("ACQUA PANNA - SAN PELLEGRINO 25cl", 3.50, PreferencesEnum.ONNIVORO, "Frizzante, Naturale");
        Bevande acqua75cl = new Bevande("ACQUA PANNA - SAN PELLEGRINO 75cl", 3.50,PreferencesEnum.ONNIVORO, "Frizzante, Naturale");
        Bevande te = new Bevande("TÈ FREDDO", 3.50, PreferencesEnum.ONNIVORO, "Limone, Pesca");
        Bevande succhi = new Bevande("SUCCHI DI FRUTTA PLOSE BIO 20cl", 4.50, PreferencesEnum.ONNIVORO, "Limone, Pesca, Pera, Pesca, Albicocca, Ace, Mela, Ananas, Arancia e Pompelmo");
        Bevande bibiteLattina = new Bevande("BIBITE IN LATTINA", 4.00, PreferencesEnum.ONNIVORO,"Coca-Cola, Coca-Cola Zero, Sprite, Estate', Fanta, Lemonsoda");

        //PRIMI PIATTI
        Primipiatti risoBianco = new Primipiatti("Riso Bianco",  2.50, PreferencesEnum.VEGANO ,"Ciotola di riso bianco e sesamo");
        Primipiatti risoFrutti = new Primipiatti("Riso Frutti", 10.00, PreferencesEnum.ONNIVORO, "Riso alla piastra con frutti di mare");
        Primipiatti risoSalmone = new Primipiatti("Riso Salmone", 12.00, PreferencesEnum.ONNIVORO, "Riso alla piastra con salmone");
        Primipiatti risoPollo = new Primipiatti("Riso Pollo", 10.00, PreferencesEnum.ONNIVORO,"Riso alla piastra con pollo in salsa tariyaki");
        Primipiatti spaghettiUdon = new Primipiatti("Spaghetti udon Vegetariani", 7.00, PreferencesEnum.VEGETARIANO,"Spaghetti di grano tenero alla piastra con verdure");

        //SECONDI PIATTI
        Secondipiatti gamberiFritti = new Secondipiatti("Gamberi Fritti",6.00, PreferencesEnum.ONNIVORO,"con mandorle");
        Secondipiatti gamberiThai = new Secondipiatti("Gamberi Thai",6.00, PreferencesEnum.ONNIVORO,"Gamberi");
        Secondipiatti polloFritto = new Secondipiatti("Pollo Fritto",5.00, PreferencesEnum.ONNIVORO, "Pollo");
        Secondipiatti filettoDiSalmone = new Secondipiatti("Filetto di Salmone",8.00, PreferencesEnum.ONNIVORO,"Salmone e salsa Yakitori");

        //DESSERT
        Dessert friedNutella = new Dessert("fried nutella",3.50, PreferencesEnum.VEGANO,"con nutella fritta");
        Dessert friedChocolateIceCream = new Dessert("fried chocolate ice cream",6.00, PreferencesEnum.ONNIVORO,"con cioccolata fritta");
        Dessert sushiDessert = new Dessert("sushi dessert",6.00, PreferencesEnum.ONNIVORO,"bocconcini di gelato e meringa alla frutta");
        Dessert sorbettoAlLimone = new Dessert("sorbetto al limone",3.50,PreferencesEnum.VEGETARIANO, "lemon sorbet");


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
        
        Cliente clienteVegeteriano = new Cliente("Rossella", "Bianchi", PreferencesEnum.VEGETARIANO, 22, "Bergamo", GenereEnum.DONNA, "3270592967","rossellabianchi@gmail.com");
        Cliente clienteVegano = new Cliente("Lorenzo", "De Lorenzi", PreferencesEnum.VEGANO, 30, "Napoli",GenereEnum.UOMO, "3313669897", "lorenzodefranceschi@hotmail.com");
        Cliente clienteOnnivoro = new Cliente("Alexandru", "Rossi", PreferencesEnum.ONNIVORO, 9, "Venezia", GenereEnum.ALTRO, "3247898200", "venezia00@libero.it");
        System.out.println("-----------------------------");

        menu1.printMenu();

        System.out.println("======== PRENOTAZIONI ========");

        Ristorante ristorante = new Ristorante("PROVA1", 2);
        ristorante.stampaListaClienti();
        ristorante.prenotazioneRistorante(clienteOnnivoro, LocalDateTime.of(2023,1,20,12,00), 5);

        ristorante.prenotazioneRistorante(clienteVegano, LocalDateTime.of(2023,1,22,12,00), 5);

        ristorante.stampaListaPrenotazioni();
        ristorante.stampaListaTavoli();
        ristorante.prenotazioneRistorante(clienteVegeteriano, LocalDateTime.of(2023,1,22,12,00), 5);

        System.out.println("======== AREA PERSONALE ========");
        clienteOnnivoro.stampaInfoCliente();
        System.out.println("---");
        clienteVegano.stampaInfoCliente();
        System.out.println("---");
        clienteVegeteriano.stampaInfoCliente();

        LocalDateTime dataInizio = LocalDateTime.of(2023,1,1,0,0);
        LocalDateTime dataFine = LocalDateTime.of(2023,12,31,0,0);
        CampagnaPromozionale promoDonne = new CampagnaPromozionale(dataInizio, dataFine, TipoPromozione.PROMODONNE);
        promoDonne.stampaCampagnaPromozionale();
    }
}