package Entidades;

import java.util.List;
import java.util.Scanner;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected String dni;
    protected String estadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String dni, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Persona: " + "nombre = " + nombre + ", apellido = " + apellido + ", dni = " + dni + ", estadoCivil = " + estadoCivil + "\n";
    }
}
