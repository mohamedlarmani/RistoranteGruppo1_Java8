import java.util.List;


public class Cliente {

    private String nome;
    private String cognome;
    private PreferencesEnum preference;

    public Cliente(String nome,String cognome, PreferencesEnum preference) {
        this.nome = nome;
        this.cognome = cognome;
        this.preference = preference;
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

    public  PreferencesEnum getPreference() {
        return preference;
    }

    public void setPreference(PreferencesEnum preference) {
        this.preference = preference;
    }
}
