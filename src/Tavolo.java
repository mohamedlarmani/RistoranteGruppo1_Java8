public class Tavolo {

    private Integer numeroDiTavolo;

    //TODO il tavolo deve avere un numero di posti? quindi un enumerato? e inoltre avrà uno stato: libero, occupato, riservato
    private Cliente cliente;

    public Tavolo(Integer numeroDiTavolo, Cliente cliente,Integer numeroPosti){
        this.numeroDiTavolo = numeroDiTavolo;
        this.cliente = cliente;

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

}
