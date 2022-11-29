
public class Menu{

    private String restaurantName;
    //TODO possiamo fare un enumerato? ci semplifica la vita?
    private String type;


    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    //TODO il costruttore va qui? a fine della classe?
    public Menu(String restaurantName, String type){
        this.restaurantName = restaurantName;
        this.type = type;
    }




}