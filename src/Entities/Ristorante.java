package Entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;



public class Ristorante {

    private static int idAutoIncrTable = 0;

    private String restaurantName;

    private CampagnaPromozionale campagnaPromozionale;

    private List<Cliente> clienteList;

    private List<Tavolo> tavoloList;

    private List<Prenotazione> prenotazioniList;

    private Integer totaleTavoli;

    //TODO non passiamo campagna promozionale nel costruttore
    public Ristorante(String restaurantName, Integer totaleTavoli) {
        this.restaurantName = restaurantName;
        this.totaleTavoli = totaleTavoli;
        clienteList = new ArrayList<>();
        tavoloList = new ArrayList<>();
        prenotazioniList = new ArrayList<>();
    }

    //TODO sistemare e chiamare nel modo corretto
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

    public static int getIdAutoIncrTable() {
        return idAutoIncrTable;
    }

    public static void setIdAutoIncrTable(int idAutoIncrTable) {
        Ristorante.idAutoIncrTable = idAutoIncrTable;
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
            System.out.println("Numero Entities.Tavolo : " + t.getNumeroDiTavolo() + " Nome: " + t.getCliente().getNome() + ", Cognome: " + t.getCliente().getCognome());
        }
        System.out.println("Tavoli occupati: " + idAutoIncrTable);
    }

    public void stampaListaClienti() {
        for (Cliente c : clienteList) {
            System.out.println("Nome: " + c.getNome() + ", Cognome: " + c.getCognome());
        }
    }

    public void stampaListaPrenotazioni() {
        for (Prenotazione p : prenotazioniList) {
            p.stampaPrenotazione();
        }
    }

    public void prenotazioneRistorante(Cliente cliente, LocalDateTime data, int numeroPersone){
        if (tavoloList.size() < totaleTavoli){
            Prenotazione nuovaPrenotazione = new Prenotazione(data, numeroPersone, true, cliente);
            idAutoIncrTable++;
            Tavolo nuovoTavolo = new Tavolo(idAutoIncrTable,cliente);
            tavoloList.add(nuovoTavolo);
            prenotazioniList.add(nuovaPrenotazione);
        } else {
            System.out.println("Tutti i tavoli sono già prenotati in questo momento, si prega di scegliere un'altra data o ora");
        }
    }



}

