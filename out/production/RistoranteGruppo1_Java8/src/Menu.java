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

    public static void filterVeganMenu(List<Portata> Menu){
        Menu.stream().filter(singleElement-> singleElement.isVegano() == true).collect(Collectors.toList());
    }

    public static void filterVegetarianMenu(List<Portata> Menu) {
        Menu.stream().filter(singleElement -> singleElement.isVegetariano() == true).collect(Collectors.toList());
    }

}