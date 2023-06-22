package manosalaobra_personaobjetosrelaciones;

import Entidades.Persona;
import Entidades.Dni;
import java.util.Scanner;

public class ManosALaObra_PersonaObjetosRelaciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona nueva = new Persona();
        Dni dni = new Dni();
        
        System.out.println("Ingrese el nombre de la persona");
        nueva.setNombre(leer.next());
        System.out.println("Ingrese el apellido de la persona");
        nueva.setApellido(leer.next());
        System.out.println("Ingrese la serie del DNI de la persona");
        dni.setSerie(leer.next().charAt(0));
        System.out.println("Ingrese el número del DNI de la persona");
        dni.setNumero(leer.next());
        nueva.setDni(dni);
        
        System.out.println("");
        System.out.println("DATOS INGRESADOS:");
        System.out.println(nueva.toString());
        
    }

}
