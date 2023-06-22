package Entidades;

public class RevolverDeAgua {
    private int posicionActual;
    private int posicionAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }
    
     public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    @Override
    public String toString() {
        return "RevolverDeAgua: " + "posicion Actual = " + posicionActual + ", posicion con Agua = " + posicionAgua;
    }
    
    public void llenarRevolver() {
        posicionActual = (int) (Math.floor(Math.random() * 6));
        posicionAgua = (int) (Math.floor(Math.random() * 6));
    }
    
    public boolean mojar() {
        return posicionActual == posicionAgua;
    }
    
    public void siguienteChorro() {
        if (posicionActual < 5) {
            posicionActual++;
        } else if (posicionActual == 5) {
            posicionActual = 0;
        }
    }
}
