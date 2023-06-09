
package Entidades;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String documento;
    private Perro mascota;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String documento, Perro mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Perro getMascota() {
        return mascota;
    }

    public void setMascota(Perro mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", mascota=" + mascota + '}';
    }
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + this.nombre + "; Apellido: " + this.apellido);
        System.out.println("Edad: " + this.edad + " años; DNI: " + this.documento);
        System.out.println("Mascota: " + this.mascota);
        
    } 
}
