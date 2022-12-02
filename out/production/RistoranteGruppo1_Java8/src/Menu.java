import java.util.List;

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


}