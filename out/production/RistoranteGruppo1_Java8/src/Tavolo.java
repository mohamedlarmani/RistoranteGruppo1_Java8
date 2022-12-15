public class Tavolo {

    private Integer numeroDiTavolo;
    private Integer numeroPosti;

    // List<Integer> numeroDiTavolo (questo o enumerato?)


    //TODO il tavolo deve avere un numero di posti? quindi un enumerato? e inoltre avrà uno stato: libero, occupato, riservato
    private Cliente cliente;

    // aggiunto al costruttore numero di posti del tavolo, va bene? Mohamed non mi uccidere (Paolo)


    public Tavolo(Integer numeroDiTavolo, Cliente cliente,Integer numeroPosti){
        this.numeroDiTavolo = numeroDiTavolo;
        this.cliente = cliente;
        this.numeroPosti = numeroPosti;
    }

    public Integer getNumeroDiTavolo() {
        return numeroDiTavolo;
    }

    public void setNumeroDiTavolo(Integer numeroDiTavolo) {
        this.numeroDiTavolo = numeroDiTavolo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getNumeroPosti() {
        return numeroPosti;
    }

    public void setNumeroPosti(Integer numeroPosti) {
        this.numeroPosti = numeroPosti;
    }
}
