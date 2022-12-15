public enum StatoTavolo {

    LIBERO ("Tavolo libero"),
    OCCUPATO("Tavolo occupato"),
    RISERVATO ("Tavolo riservato");

    private String descrizione;
    StatoTavolo(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
