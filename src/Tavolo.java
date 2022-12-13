public class Tavolo {

    //TODO tutti gli int diventano Integer
    private int numeroDiTavolo;

    //TODO il tavolo deve avere un numro di posti? quindi un enumerato? e inoltre avrà uno stato: libero, occupato, riservato
    private Cliente cliente;

    public Tavolo(int numeroDiTavolo, Cliente cliente){
        this.numeroDiTavolo = numeroDiTavolo;
        this.cliente = cliente;
    }

    public int getNumeroDiTavolo() {
        return numeroDiTavolo;
    }

    public void setNumeroDiTavolo(int numeroDiTavolo) {
        this.numeroDiTavolo = numeroDiTavolo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
