import java.util.List;
import java.util.stream.Collectors;

public class Menu{

    private enum Type{
        Carne,
        Pesce,
        Vegano;
    }

    private Type type;

    public Menu(Type type){
        this.type = type;
    }


    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public static void printMenu(List<? super Portata > Menu){
        System.out.println(" === MENU ===");
        Menu.stream().forEach(singleElement->{
            System.out.println(singleElement);
        });

    }

    public static List<Portata> filterVeganMenu(List<Portata> Menu){
        List<Portata> menuVegano = Menu.stream().filter(singleElement-> singleElement.isVegano() == true).collect(Collectors.toList());
        return menuVegano;
    }

    public static List<Portata> filterVegetarianMenu(List<Portata> Menu) {
        List<Portata> menuVegetariano = Menu.stream().filter(singleElement -> singleElement.isVegetariano() == true).collect(Collectors.toList());
        return menuVegetariano;
    }

}