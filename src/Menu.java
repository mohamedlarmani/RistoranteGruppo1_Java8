import java.util.List;

public class Menu{

    private String name;

    private PreferencesEnum type;

    private List<Portata> listaPortate;

    public Menu(String name, PreferencesEnum type, List<Portata> listaPortate) {
        this.name = name;
        this.type = type;
        this.listaPortate = listaPortate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PreferencesEnum getType() {
        return type;
    }

    public void setType(PreferencesEnum type) {
        this.type = type;
    }

    public List<Portata> getListaPortate() {
        return listaPortate;
    }

    public void setListaPortate(List<Portata> listaPortate) {
        this.listaPortate = listaPortate;
    }


//    public void printMenu2(){
//        for (Portata portata: listaPortate) {
//            if(type == PreferencesEnum.ONNIVORO){
//                portata.printPortataDetail();
//            }else{
//                if (portata.getPreferencesEnum() == this.type){
//                    portata.printPortataDetail();
//                }
//            }
//        }
//    }

//    //TODO eliminare lo static
//    public static void printMenu(){
//        //TODO non c'è bisogno di passare la lista come parametro ma bisogna inserire una lista come field
//        //e ciclare su questa lista
//        System.out.println(" === MENU ===");
//        //TODO bisogna formattare bene il menù e poi richiamare il metodo di stampa dettagli portata
//        menu.stream().forEach(singleElement->{
//            System.out.println(singleElement);
//        });
//
//    }



}