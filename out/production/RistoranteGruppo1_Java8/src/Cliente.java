import java.util.List;

public class Cliente {

    private String nome;
    private String cognome;
    private PreferencesEnum preference;

    //TODO inserire città o età
    public Cliente(String nome,String cognome, PreferencesEnum preference) {
        this.nome = nome;
        this.cognome = cognome;
        this.preference = preference;
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
}
