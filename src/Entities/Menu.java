package Entities;

import Enum.*;
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


    /**
     * Metodo che filtra le portate per i vari gusti personali
     */
    public void printMenu(){
        if(this.type == PreferencesEnum.ONNIVORO) {
            for (Portata portata : listaPortate) {
                portata.printPortataDetail();
            }
        }else{
            for (Portata portata: listaPortate) {
                if (this.type == portata.getPreferencesEnum()){
                    portata.printPortataDetail();
                }
            }
        }
    }

}