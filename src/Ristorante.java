import java.util.List;

public class Ristorante {

    private String restaurantName;

    private CampagnaPromozionale p;

    private List <Cliente> clienteList ;


    public Ristorante(String restaurantName) {
        this.restaurantName = restaurantName;
    }


    public void addPromo(CampagnaPromozionale p){
        this.p = p;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public CampagnaPromozionale getP() {
        return p;
    }

    public void setP(CampagnaPromozionale p) {
        this.p = p;
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    public void stampaListaClienti(List <Cliente> clienteList) {
        for (Cliente c : clienteList) {
            System.out.println("Nome: " + c.getNome() + ", Cognome: " + c.getCognome());
            if (c.haPrenotato()) {
                System.out.println("✔ Prenotazione effettuata:  " + c.getPrenotazione().getDataOraPrenotazione() + "   per  " +c.getPrenotazione().getNumeroClienti() + " persone");
            } else {
                System.out.println("❌ Prenotazione non effettuata");
            }
        }
    }
}

