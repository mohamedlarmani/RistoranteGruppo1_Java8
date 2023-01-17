import java.time.LocalDateTime;

public class Prenotazione {

    //TODO inseriamo metodi d'ultilità, stampa, se è una prenotazione in giorno festivo ecc ecc

    private LocalDateTime dataOraPrenotazione;
    private Integer numeroClienti;
    private boolean esitoPrenotazione;
    private Cliente cliente;

    public Prenotazione(LocalDateTime dataOraPrenotazione, Integer numeroClienti, boolean esitoPrenotazione, Cliente cliente) {
        this.dataOraPrenotazione = dataOraPrenotazione;
        this.numeroClienti = numeroClienti;
        this.esitoPrenotazione = esitoPrenotazione;
        this.cliente = cliente;
    }

    public LocalDateTime getDataOraPrenotazione() {
        return dataOraPrenotazione;
    }

    public void setDataOraPrenotazione(LocalDateTime dataOraPrenotazione) {
        this.dataOraPrenotazione = dataOraPrenotazione;
    }

    public Integer getNumeroClienti() {
        return numeroClienti;
    }

    public void setNumeroClienti(Integer numeroClienti) {
        this.numeroClienti = numeroClienti;
    }

    public boolean isEsitoPrenotazione() {
        return esitoPrenotazione;
    }

    public void setEsitoPrenotazione(boolean esitoPrenotazione) {
        this.esitoPrenotazione = esitoPrenotazione;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

