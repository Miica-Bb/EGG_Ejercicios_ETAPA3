package Entidad;

public class Libro {
    public String nombre, autor, ISBN;

    public Libro() {
    }

    public Libro(String nombre, String autor, String ISBN) {
        this.nombre = nombre;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Libro: " + "nombre = " + nombre + "; autor = " + autor + "; ISBN = " + ISBN + '.';
    }
    
    
}
