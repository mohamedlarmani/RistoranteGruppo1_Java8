
public class Menu{

    private String restaurantName;

    private enum Type{
        Carne,
        Pesce,
        Vegano;
    }

    private Type type;

    public Menu(String restaurantName, Type type){
        this.restaurantName = restaurantName;
        this.type = type;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }


}