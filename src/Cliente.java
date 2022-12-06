import java.util.List;
import java.util.stream.Collectors;

public class Cliente {

    private String nome;
    private String cognome;
    private PreferencesEnum preference;

    public Cliente(String nome,String cognome, PreferencesEnum preference) {
        this.nome = nome;
        this.cognome = cognome;
        this.preference = preference;
    }

    //
    public void clienteGetMenu(List<Portata> listPortate){

        for (Portata portata: listPortate) {
           if (portata.getPreferencesEnum() == this.preference){
               portata.printPortataDetail();
           }
        }


        switch (preference){
            case Onnivoro:
                System.out.println("=== MENU ===");
                listPortate.stream().forEach(portata->{
                    portata.printPortataDetail();
                });
                break;
            case Vegano:
                System.out.println("=== MENU VEGANO ===");
                Menu.filterVeganMenu(listPortate).stream().forEach(singleElement->{
                    System.out.println(singleElement);
                });
                break;
            case Vegetariano:
                System.out.println("=== MENU VEGETARIANO ===");


                //TODO esempio stream
                listPortate.stream().filter(portata -> portata.isVegetariano()).collect(Collectors.toList());


                Menu.filterVegetarianMenu(MenuList).stream().forEach(singleElement->{
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

    public  Preferences getPreference() {
        return preference;
    }

    public void setPreference(Preferences preference) {
        this.preference = preference;
    }
}
