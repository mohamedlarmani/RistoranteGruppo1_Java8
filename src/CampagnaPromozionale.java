import java.time.LocalDateTime;
import java.util.Date;
import java.util.GregorianCalendar;

public class CampagnaPromozionale{

    //TODO

    private TipoPromozione tipoPromozione;

    //TODO rifattorizzare
    private LocalDateTime dataInizio;
    private LocalDateTime dataFine;

    //TODO clening code chiamare p -> portata
    private Portata p;
    private Promozione promo;

    public CampagnaPromozionale(GregorianCalendar dataInizio, GregorianCalendar dataFine) {
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
    }

    public GregorianCalendar getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(GregorianCalendar dataInizio) {
        this.dataInizio = dataInizio;
    }

    public GregorianCalendar getDataFine() {
        return dataFine;
    }

    public void setDataFine(GregorianCalendar dataFine) {
        this.dataFine = dataFine;
    }

    public Portata getP() {
        return p;
    }

    public void setP(Portata p) {
        this.p = p;
    }

    public Promozione getPromo() {
        return promo;
    }

    public void setPromo(Promozione promo) {
        this.promo = promo;
    }

    public void addPromo(Portata p, Promozione promo){
        this.p = p;
        this.promo = promo;
    }

}
