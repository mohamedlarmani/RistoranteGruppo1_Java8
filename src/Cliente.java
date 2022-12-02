
public class Cliente {

    private String nome;
    private String cognome;
    private Preferences preferences;
    public enum Preferences{
        Onnivoro,
        Vegetariano,
        Vegano;
    }

    public Cliente(String nome,String cognome, Preferences preferences) {
        this.nome = nome;
        this.cognome = cognome;
        this.preferences = preferences;
    }

    public void clienteGetMenu(){
        switch (preferences){
            case Onnivoro -> System.out.println("Menu Completo");
            case Vegano -> System.out.println("Menu Vegano");
            case Vegetariano -> System.out.println("Menu Vegetariano");
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

    public  Preferences getPreferences() {
        return preferences;
    }

    public void setPreferences(Preferences preferences) {
        this.preferences = preferences;
    }
}
