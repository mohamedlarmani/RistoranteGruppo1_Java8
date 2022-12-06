public class Tavolo {
    private int numeroDiTavolo;
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
