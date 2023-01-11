public enum TipoPromozione {

    PROMOETAUNDER12("Menu bambino minore di 12 anni","25%"),
    PROMOETAOVER35MERCOLEDI("Menù per tutti gli over 35 ogni mercoledì","20%"),
    PROMODONNE("Menù scontato per tutte le donne","20%"),
    PROMOVIVAILGIOVEDI("Menù scontato ogni giovedì per tutti", "25%"),
    PROMORITORNOALLAVOROCONDOLCEZZA("Menù scontato ogni lunedì", "30%");


    private String descrizione;
    private String scontoEffettuato;

    TipoPromozione(String descrizione, String scontoEffettuato){
        this.descrizione = descrizione;
        this.scontoEffettuato= scontoEffettuato;
    }

    public String getDescrizione() {
        return descrizione;
    }
    public String getScontoEffettuato(){return scontoEffettuato;}
}
