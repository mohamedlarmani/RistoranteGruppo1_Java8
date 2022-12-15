public enum StateEnum {

    LIBERO ("Tavolo libero"),
    OCCUPATO("Tavolo occupato"),
    RISERVATO ("Tavolo riservato");

    private String descrizione;
    StateEnum(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
