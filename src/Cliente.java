import java.util.List;

public class Cliente {
    private String nome;
    private String cognome;
    private PreferencesEnum preference;
    private Integer eta;
    private String citta;
    private TipoPromozione promozione;




    /**
     * @param nome dei clienti
     * @param cognome dei clienti
     * @param preference dei clienti sui cibi
     * @param eta dei clienti per le future promozioni
     * @param citta dei clienti per le future promozioni
     */

    public Cliente(String nome,String cognome, PreferencesEnum preference, Integer eta, String citta) {
        this.nome = nome;
        this.cognome = cognome;
        this.preference = preference;
        this.eta = eta;
        this.citta = citta;
        if (eta < 10){
            this.promozione = TipoPromozione.PROMOETA;
        }
    }


    public String getNome() {
        return nome;
    }

   public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public PreferencesEnum getPreference() {
        return preference;
    }

    public void setPreference(PreferencesEnum preference) {
        this.preference = preference;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public TipoPromozione getPromozione() {
        return promozione;
    }

    public void setPromozione(TipoPromozione promozione) {
        this.promozione = promozione;
    }

}
