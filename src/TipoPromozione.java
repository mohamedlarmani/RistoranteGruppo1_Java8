public enum TipoPromozione {

    PROMOETAUNDER14("Menu bambino minore di 15 anni", 7,"35%"),
    PROMOETAOVER35MERCOLEDI("Menu scontato per tutti gli over 35", 6,"30%"),
    PROMODONNE("Menu scontato per tutte le donne", 5,"25%"),
    PROMOVIVAILGIOVEDI("Menu scontato per tutti", 6,"30%"),
    PROMORITORNOALAVOROCONDOLCEZZA("Menu scontato per tutti ogni lunedì",8,"40%");

    private String descrizione;
    private Integer prezzoRisparmiato;
    private String scontoEffettuato;


    TipoPromozione(String descrizione, Integer prezzoRisparmiato,String scontoEffettuato){
        this.descrizione = descrizione;
        this.prezzoRisparmiato= prezzoRisparmiato;
        this.scontoEffettuato= scontoEffettuato;
    }

    public String getDescrizione() {
        return descrizione;
    }
    public Integer getPrezzoRisparmiato() {return prezzoRisparmiato;}
    public String getScontoEffettuato(){return scontoEffettuato;}
}
