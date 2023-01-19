import java.util.ArrayList;
import java.util.List;

public class Cliente {

    // TODO anche qui inseriamo dei metodi d'utilità, quello che volete
    private String nome;
    private String cognome;
    private PreferencesEnum preference;
    private Integer età;
    private String città;
    private TipoPromozione promozione;
    private GenereEnum genere;
    private String numeroCellulare;
    private String email;
    private List <Ristorante> ristorantiPreferiti;
    private List <Prenotazione> storicoPrenotazioni;



    public Cliente(String nome,String cognome, PreferencesEnum preference, Integer età, String città, GenereEnum genere, String numeroCellulare, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.preference = preference;
        this.età = età;
        this.città = città;
        this.genere = genere;
        this.numeroCellulare = numeroCellulare;
        this.email = email;
        ristorantiPreferiti = new ArrayList<>();
        storicoPrenotazioni = new ArrayList<>();
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

    public Integer getEtà() {
        return età;
    }
    public void setEtà(Integer età) {
        this.età = età;
    }

    public String getCittà() {
        return città;
    }
    public void setCittà(String città) {
        this.città = città;
    }

    public TipoPromozione getPromozione() {
        return promozione;
    }
    public void setPromozione(TipoPromozione promozione) {
        this.promozione = promozione;
    }

    public GenereEnum getGenere() {
        return genere;
    }
    public void setGenere(GenereEnum genere) {
        this.genere = genere;
    }

    public String getNumeroCellulare() {
        return numeroCellulare;
    }
    public void setNumeroCellulare(String numeroCellulare) {
        this.numeroCellulare = numeroCellulare;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public List<Ristorante> getRistorantiPreferiti() {
        return ristorantiPreferiti;
    }
    public void setRistorantiPreferiti(List<Ristorante> ristorantiPreferiti) {
        this.ristorantiPreferiti = ristorantiPreferiti;
    }

    public List<Prenotazione> getStoricoPrenotazioni() {
        return storicoPrenotazioni;
    }
    public void setStoricoPrenotazioni(List<Prenotazione> storicoPrenotazioni) {
        this.storicoPrenotazioni = storicoPrenotazioni;
    }

    public void stampaInfoCliente(){
        System.out.println("\uD83D\uDC64 Dati anagrafici: " + nome + " " + cognome + " età: "+ età + " città: " + città);
        System.out.println("\uD83D\uDCF1 " + numeroCellulare + "  \uD83D\uDCE7 " + email);
    }
}
