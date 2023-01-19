public enum GenereEnum {
    DONNA ("Genere femminile"),
    UOMO("Genere maschile"),
    ALTRO ("Genere altro");

    private String descrizione;

    GenereEnum(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }

}
