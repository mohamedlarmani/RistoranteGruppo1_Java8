public enum TipoPromozione {

    PROMOETA("Menu bambino minore di 10 anni");

    //TODO inserire i topi promozione con descrizione, valore, ecc ecc

    private String descrizione;

    TipoPromozione(String descrizione){
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
