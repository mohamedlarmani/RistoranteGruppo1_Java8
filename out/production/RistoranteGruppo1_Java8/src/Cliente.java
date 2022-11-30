package RistoranteGruppo1_Java8.src;

public class Cliente {

    private String nome;
    private String cognome;
    private Preferences preferences;
    private enum Preferences{
        Tutto,
        Vegetariano,
        Vegano;
    }

    public Cliente(String nome,String cognome, Preferences preferences) {
        this.nome = nome;
        this.cognome = cognome;
        this.preferences = preferences;
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




}
