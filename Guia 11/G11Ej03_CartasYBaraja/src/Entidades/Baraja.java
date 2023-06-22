package Entidades;

import java.util.List;

public class Baraja {
    private List<Carta> listaCartas;

    public Baraja() {
    }

    public Baraja(List<Carta> listaCartas) {
        this.listaCartas = listaCartas;
    }

    public List<Carta> getListaCartas() {
        return listaCartas;
    }

    public void setListaCartas(List<Carta> listaCartas) {
        this.listaCartas = listaCartas;
    }

    @Override
    public String toString() {
        return "Baraja: \n" + listaCartas;
    }
    
    
}
