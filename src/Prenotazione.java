import java.time.LocalDateTime;

public class Prenotazione {

    private String dataOraPrenotazione;
    private Integer numeroClienti;

    public Prenotazione(String dataOraPrenotazione, Integer numeroClienti) {
        this.dataOraPrenotazione = dataOraPrenotazione;
        this.numeroClienti = numeroClienti;
    }

    public String getDataOraPrenotazione() {
        return dataOraPrenotazione;
    }

    public void setDataOraPrenotazione(String dataOraPrenotazione) {
        this.dataOraPrenotazione = dataOraPrenotazione;
    }

    public Integer getNumeroClienti() {
        return numeroClienti;
    }

    public void setNumeroClienti(Integer numeroClienti) {
        this.numeroClienti = numeroClienti;
    }
}

