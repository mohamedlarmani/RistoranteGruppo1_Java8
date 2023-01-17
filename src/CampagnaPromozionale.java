import java.time.LocalDateTime;

public class CampagnaPromozionale{

    //TODO ha solo getter e setter, un metodo per stampare il tipo di promozione con la data in modo carino?

    private TipoPromozione tipoPromozione;
    private LocalDateTime dataInizio;
    private LocalDateTime dataFine;
    private Portata portata;

    public CampagnaPromozionale(LocalDateTime dataInizio, LocalDateTime dataFine, TipoPromozione tipoPromozione) {
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.tipoPromozione = tipoPromozione;
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
