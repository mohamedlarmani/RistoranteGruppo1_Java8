import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ristorante {

    private static int numeroTavolo = 0;

    private String restaurantName;

    private CampagnaPromozionale p;



    private List<Tavolo> tavoloList;

    private Integer totaleTavoli;


    //TODO
    public Ristorante(String restaurantName) {
        this.restaurantName = restaurantName;
        clienteList = new ArrayList<>();
        tavoloList = new ArrayList<>();
    }


    public void addPromo(CampagnaPromozionale p){
        this.p = p;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public CampagnaPromozionale getP() {
        return p;
    }

    public void setP(CampagnaPromozionale p) {
        this.p = p;
    }


    public void stampaListaClienti(List <Cliente> clienteList) {
        for (Cliente c : clienteList) {
            System.out.println("Nome: " + c.getNome() + ", Cognome: " + c.getCognome());
            if (c.haPrenotato()) {
                System.out.println("✔ Prenotazione effettuata:  " + c.getPrenotazione().getDataOraPrenotazione() + "   per  " +c.getPrenotazione().getNumeroClienti() + " persone");
            } else {
                System.out.println("❌ Prenotazione non effettuata");
            }
        }
    }

    //TODO ci dovrebbe essere un metodo che mi prenota un tavolo nel ristorante

    private Prenotazione prenotazioneRistorante(Cliente cliente){
        //TODO costruttore di defaoult
        Prenotazione nuovaPrenotazione= new Prenotazione();
        //ogni volta che non abbiamo raggiunto il limite di tavoli
        if (tavoloList.size() <= totaleTavoli){
            //creiamo la prenotazione e aggiongiamo il tavolo prenotato alla lista
            //TODO
            nuovaPrenotazione = new Prenotazione(new Date(),2);

            Tavolo nuovoTavolo = new Tavolo(numeroTavolo,cliente);
            numeroTavolo++;
            tavoloList.add(nuovoTavolo);

        }
        return nuovaPrenotazione;
    }
}

