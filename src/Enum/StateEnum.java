package Enum;

public enum StateEnum {

    LIBERO ("Entities.Tavolo libero"),
    OCCUPATO("Entities.Tavolo occupato"),
    RISERVATO ("Entities.Tavolo riservato");

    private String descrizione;
    StateEnum(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
