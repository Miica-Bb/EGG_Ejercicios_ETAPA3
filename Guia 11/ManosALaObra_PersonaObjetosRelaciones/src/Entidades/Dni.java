package Entidades;

public class Dni {
    private char serie;
    private String numero;

    public Dni() {
    }

    public Dni(char serie, String numero) {
        this.serie = serie;
        this.numero = numero;
    }

    public char getSerie() {
        return serie;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "serie:" + serie + ", numero:" + numero;
    }
    
    
}
