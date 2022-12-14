import java.util.List;
import java.util.stream.Collectors;

public class Menu{

    //TODO eliminare lo static
    public static void printMenu(){
        //TODO non c'è bisogno di passare la lista come parametro ma bisogna inserire una lista come field
        //e ciclare su questa lista
        System.out.println(" === MENU ===");
        //TODO bisogna formattare bene il menù e poi richiamare il metodo di stampa dettagli portata
        menu.stream().forEach(singleElement->{
            System.out.println(singleElement);
        });

    }



}