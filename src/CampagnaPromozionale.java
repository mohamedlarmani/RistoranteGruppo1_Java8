import java.time.LocalDateTime;
import java.util.Date;
import java.util.GregorianCalendar;

public class CampagnaPromozionale{


    private TipoPromozione tipoPromozione;

    private LocalDateTime dataInizio;
    private LocalDateTime dataFine;

    private Portata portata;

    public CampagnaPromozionale(LocalDateTime dataInizio, LocalDateTime dataFine) {
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
    }

    public TipoPromozione getTipoPromozione() {
        return tipoPromozione;
    }

    public void setTipoPromozione(TipoPromozione tipoPromozione) {
        this.tipoPromozione = tipoPromozione;
    }

    public LocalDateTime getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(LocalDateTime dataInizio) {
        this.dataInizio = dataInizio;
    }

    public LocalDateTime getDataFine() {
        return dataFine;
    }

    public void setDataFine(LocalDateTime dataFine) {
        this.dataFine = dataFine;
    }

    public Portata getPortata() {
        return portata;
    }

    public void setPortata(Portata portata) {
        this.portata = portata;
    }


    }


