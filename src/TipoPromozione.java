public enum TipoPromozione {

    PROMOETAUNDER14("Menu bambino minore di 15 anni", "35%"),
    PROMOETAOVER35MERCOLEDI("Menu scontato per tutti gli over 35", "30%"),
    PROMODONNE("Menu scontato per tutte le donne", "25%"),
    PROMOVIVAILGIOVEDI("Menu scontato per tutti", "30%"),
    PROMORITORNOALAVOROCONDOLCEZZA("Menu scontato per tutti ogni lunedì","40%");

    private String descrizione;
    private String scontoEffettuato;


    TipoPromozione(String descrizione,String scontoEffettuato ){
        this.descrizione = descrizione;
        this.scontoEffettuato= scontoEffettuato;
    }

    public String getDescrizione() {
        return descrizione;
    }
    public String getScontoEffettuato(){return scontoEffettuato;}
}
