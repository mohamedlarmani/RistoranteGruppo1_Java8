public class Tavolo {

    private Integer numeroDiTavolo;

    //TODO il tavolo deve avere un numero di posti? quindi un enumerato? e inoltre avrà uno stato: libero, occupato, riservato
    private Cliente cliente;

    private StateEnum stateEnum;



    public Tavolo(Integer numeroDiTavolo, Cliente cliente){
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

    public StateEnum getStateEnum() {
        return stateEnum;
    }

    public void setStateEnum(StateEnum stateEnum) {
        this.stateEnum = stateEnum;
    }
}
