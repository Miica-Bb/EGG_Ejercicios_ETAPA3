package Entidades;

import Enumeraciones.Palo;

public class Carta {
    private Palo palo;
    private int num;

    public Carta() {
    }

    public Carta(Palo palo, int num) {
        this.palo = palo;
        this.num = num;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return num + " de " + palo;
    }
    
}
