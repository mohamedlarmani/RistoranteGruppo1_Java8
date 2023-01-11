import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Ristorante {

    private static int numeroTavolo = 0;

    private String restaurantName;

    private CampagnaPromozionale campagnaPromozionale;

    private List<Cliente> clienteList;

    private List<Tavolo> tavoloList;

    private List<Prenotazione> prenotazioniList;

    private Integer totaleTavoli;


    //TODO
    public Ristorante(String restaurantName, Integer totaleTavoli) {
        this.restaurantName = restaurantName;
        clienteList = new ArrayList<>();
        tavoloList = new ArrayList<>();
        prenotazioniList = new ArrayList<>();
        this.totaleTavoli = totaleTavoli;
    }


    public void addPromo(CampagnaPromozionale p){
        this.campagnaPromozionale = campagnaPromozionale;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public CampagnaPromozionale getCampagnaPromozionale() {
        return campagnaPromozionale;
    }

    public void setCampagnaPromozionale(CampagnaPromozionale campagnaPromozionale) {
        this.campagnaPromozionale = campagnaPromozionale;
    }

    public static int getNumeroTavolo() {
        return numeroTavolo;
    }

    public static void setNumeroTavolo(int numeroTavolo) {
        Ristorante.numeroTavolo = numeroTavolo;
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    public List<Tavolo> getTavoloList() {
        return tavoloList;
    }

    public void setTavoloList(List<Tavolo> tavoloList) {
        this.tavoloList = tavoloList;
    }

    public List<Prenotazione> getPrenotazioniList() {
        return prenotazioniList;
    }

    public void setPrenotazioniList(List<Prenotazione> prenotazioniList) {
        this.prenotazioniList = prenotazioniList;
    }

    public Integer getTotaleTavoli() {
        return totaleTavoli;
    }

    public void setTotaleTavoli(Integer totaleTavoli) {
        this.totaleTavoli = totaleTavoli;
    }

    public void stampaListaTavoli() {
        for (Tavolo t : tavoloList) {
            System.out.println("Numero Tavolo : " + t.getNumeroDiTavolo() + " Nome: " + t.getCliente().getNome() + ", Cognome: " + t.getCliente().getCognome());
        }
        System.out.println("Tavoli occupati: " + numeroTavolo);
    }

    public void stampaListaClienti() {
        for (Cliente c : clienteList) {
            System.out.println("Nome: " + c.getNome() + ", Cognome: " + c.getCognome());
        }
    }

    public void stampaListaPrenotazioni() {
        for (Prenotazione p : prenotazioniList) {
            System.out.println("Nome: " + p.getCliente().getNome() + ", Cognome: " + p.getCliente().getCognome() + ", Ha prenotato il: " + p.getDataOraPrenotazione() + " per: " + p.getNumeroClienti() + " persone");
        }
    }

    public Prenotazione prenotazioneRistorante(Cliente cliente, LocalDateTime data, int numeroPersone){
        Prenotazione nuovaPrenotazione = new Prenotazione();
        if (tavoloList.size() < totaleTavoli){
            nuovaPrenotazione = new Prenotazione(data, numeroPersone, true, cliente);
            numeroTavolo++;
            Tavolo nuovoTavolo = new Tavolo(numeroTavolo,cliente);
            tavoloList.add(nuovoTavolo);
            prenotazioniList.add(nuovaPrenotazione);
        } else {
            nuovaPrenotazione = new Prenotazione(data, numeroPersone, false, cliente);
            System.out.println("Tutti i tavoli sono già prenotati in questo momento, si prega di scegliere un'altra data o ora");
        }
        return nuovaPrenotazione;
    }


}

