public enum PreferencesEnum {
        ONNIVORO ("Menù fisso "),
        VEGETARIANO ("Menù vegetariano "),
        VEGANO ("Menù vegano ");

        private String descrizione;
        PreferencesEnum(String descrizione) {
                this.descrizione = descrizione;
        }

        public String getDescrizione() {
                return descrizione;
        }

        public void setDescrizione(String descrizione) {
                this.descrizione = descrizione;
        }
}
