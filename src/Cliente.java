import java.util.List;

public class Cliente {
    private String nome;
    private String cognome;
    private PreferencesEnum preference;
    private Integer eta;
    private String citta;

    //Inserimento età e città per future promozioni
    public Cliente(String nome,String cognome, PreferencesEnum preference, Integer eta, String citta) {
        this.nome = nome;
        this.cognome = cognome;
        this.preference = preference;
        this.eta = eta;
        this.citta = citta;
    }

    public void clienteGetMenu(List<Portata> listPortate){
        for (Portata portata: listPortate) {
           if (portata.getPreferencesEnum() == this.preference){
               portata.printPortataDetail();
           }
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

}
