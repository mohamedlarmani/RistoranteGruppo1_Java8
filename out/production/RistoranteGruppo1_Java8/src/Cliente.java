import java.util.List;
import java.util.stream.Collectors;

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

    public void clienteGetMenu(List<Portata> Menu){
        switch (preferences){
            case Onnivoro:
                System.out.println("=== MENU ===");
                Menu.stream().forEach(singleElement->{
                    System.out.println(singleElement);
                });
                break;
            case Vegano:
                List<Portata> menuVegano = Menu.stream().filter(singleElement-> singleElement.isVegano() == true).collect(Collectors.toList());
                System.out.println("=== MENU VEGANO ===");
                menuVegano.stream().forEach(singleElement->{
                    System.out.println(singleElement);
                });
                break;
            case Vegetariano:
                List<Portata> menuVegetariano = Menu.stream().filter(singleElement-> singleElement.isVegetariano() == true).collect(Collectors.toList());
                System.out.println("=== MENU VEGETARIANO ===");
                menuVegetariano.stream().forEach(singleElement->{
                    System.out.println(singleElement);
                });
                break;
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
