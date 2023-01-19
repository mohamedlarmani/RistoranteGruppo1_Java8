import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Prenotazione {

    private LocalDateTime dataOraPrenotazione;
    private Integer numeroClienti;
    private boolean esitoPrenotazione;
    private Cliente cliente;
    private boolean èFestivo;


    public Prenotazione(LocalDateTime dataOraPrenotazione, Integer numeroClienti, boolean esitoPrenotazione, Cliente cliente) {
        this.dataOraPrenotazione = dataOraPrenotazione;
        this.numeroClienti = numeroClienti;
        this.esitoPrenotazione = esitoPrenotazione;
        this.cliente = cliente;
        this.èFestivo = èFestivo();
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

    public void stampaPrenotazione(){
        System.out.println("Nome: " + cliente.getNome() + ", Cognome: " + cliente.getCognome() + ", Ha prenotato il: " + dataOraPrenotazione + " per: " + numeroClienti + " persone " + "festivo: " + èFestivo);
    }

    public boolean èFestivo(){
        if(dataOraPrenotazione.getDayOfWeek() == DayOfWeek.SUNDAY || dataOraPrenotazione.getDayOfWeek() == DayOfWeek.SATURDAY){
            return true;
        }
        return false;
    }
}

