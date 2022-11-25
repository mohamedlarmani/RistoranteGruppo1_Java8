
public class Menu{

    private String restaurantName;
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

    public Menu(String restaurantName, String type){
        this.restaurantName = restaurantName;
        this.type = type;
    }




}