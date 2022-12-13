public class Prenotazione {

    private Tavolo tavolo;
    private Cliente cliente;

    //TODO le date e le ora vanno rappresentate dateAndTime
    private String dataPrenotazione;
    private String oraPrenotazione;


    public Prenotazione(Tavolo tavolo, Cliente cliente, String dataPrenotazione, String oraPrenotazione){
        this.tavolo = tavolo;
        this.cliente = cliente;
        this.dataPrenotazione = dataPrenotazione;
        this.oraPrenotazione = oraPrenotazione;
    }


    public Tavolo getTavolo() {
        return tavolo;
    }

    public void setTavolo(Tavolo tavolo) {
        this.tavolo = tavolo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDataPrenotazione() {
        return dataPrenotazione;
    }

    public void setDataPrenotazione(String dataPrenotazione) {
        this.dataPrenotazione = dataPrenotazione;
    }

    public String getOraPrenotazione() {
        return oraPrenotazione;
    }

    public void setOraPrenotazione(String oraPrenotazione) {
        this.oraPrenotazione = oraPrenotazione;
    }
}
