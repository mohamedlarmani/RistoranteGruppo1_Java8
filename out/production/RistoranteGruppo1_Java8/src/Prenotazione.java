import java.time.LocalDateTime;

public class Prenotazione {

    private Tavolo tavolo;
    private Cliente cliente;


    private LocalDateTime dataOraPrenotazione;


    public Prenotazione(Tavolo tavolo, Cliente cliente, LocalDateTime dataOraPrenotazione){
        this.tavolo = tavolo;
        this.cliente = cliente;
        this.dataOraPrenotazione = dataOraPrenotazione;

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

    public LocalDateTime getDataOraPrenotazione() {
        return dataOraPrenotazione;
    }

    public void setDataOraPrenotazione(LocalDateTime dataOraPrenotazione) {
        this.dataOraPrenotazione = dataOraPrenotazione;
    }
}

