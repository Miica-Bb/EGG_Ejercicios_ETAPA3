package g13ej01_personamayoredad;

import Entidades.Persona;
import Servicios.PersonaServicios;

public class G13Ej01_PersonaMayorEdad {

    public static void main(String[] args) {
        PersonaServicios ps = new PersonaServicios();
        
        try{
            Persona nueva = null;
            ps.esMayorDeEdad(nueva);
        } catch (RuntimeException e) {
            System.out.println("Ha sucedido un error");
            Persona nueva = ps.crearPersona();
            System.out.println(nueva.getNombre() + " es mayor de edad? " + ps.esMayorDeEdad(nueva));
        }

    }

}
