public enum PreferencesEnum {
        ONNIVORO ("menù per onnivori"),
        VEGETARIANO,
        VEGANO;

        private String descrizione;
        PreferencesEnum(String descrizione) {
                this.descrizione = descrizione;
        }

        public String getDescrizione() {
                return descrizione;
        }
}
