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

    public void clienteGetMenu(List<Portata> MenuList){
        switch (preferences){
            case Onnivoro:
                System.out.println("=== MENU ===");
                MenuList.stream().forEach(singleElement->{
                    System.out.println(singleElement);
                });
                break;
            case Vegano:
                Menu.filterVeganMenu(MenuList);
                System.out.println("=== MENU VEGANO ===");
                MenuList.stream().forEach(singleElement->{
                    System.out.println(singleElement);
                });
                break;
            case Vegetariano:
                Menu.filterVegetarianMenu(MenuList);
                System.out.println("=== MENU VEGETARIANO ===");
                MenuList.stream().forEach(singleElement->{
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
