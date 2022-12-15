public enum StatoTavolo {

    TAVOLOL("Libero"),
    TAVOLOO("Occupato"),
    TAVOLOR("Riservato");

    private String descrizione;
    StatoTavolo(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
