package Entidades;

public class Jugador {
    private Integer id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(Integer id, boolean mojado) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.mojado = mojado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean getMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador: \n" + " id = " + id + "\n nombre = " + nombre + "\n mojado = " + mojado;
    }
    
    public boolean disparo(RevolverDeAgua r) {
        if (r.mojar() == true) {
            mojado = true;
            r.siguienteChorro();
            return true;
        } else {
            mojado = false;
            r.siguienteChorro();
            return false;
        }
        
        
        
    }
}
