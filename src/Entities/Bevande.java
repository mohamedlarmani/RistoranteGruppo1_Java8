package Entities;
import Enum.*;

public class Bevande extends Portata {

    private String type;

    public Bevande(String name, double price, PreferencesEnum preferencesEnum, String type) {
        super(name, price, preferencesEnum);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void printPortataDetail() {
        super.printPortataDetail();
        System.out.println(" \uD83E\uDD64 Entities.Bevande : " + " " + type);
    }

}
