package Entities;
import Enum.*;

public class Tavolo {

    private Integer numeroDiTavolo;
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
