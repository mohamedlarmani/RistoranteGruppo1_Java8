import java.util.List;

public class Ristorante {

    private String restaurantName;

    private List <Menu> menuList;


    public Ristorante(String restaurantName, List<Menu> menuList) {
        this.restaurantName = restaurantName;
        this.menuList = menuList;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }
}

