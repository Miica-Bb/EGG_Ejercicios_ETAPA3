package Servicios;

import Entidades.Persona;
import java.util.List;
import java.util.Scanner;

public abstract class PersonaServicios {
    public void cambiarEstadoCivil(List<Persona> individuo) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el dni del individuo cuyo estado civil quiere modificar: ");
        String dni = leer.next();

        for (Persona ind : individuo) {
            if (ind.getDni().equalsIgnoreCase(dni)) {
                System.out.print("Ingrese el nuevo estado civil: ");
                ind.setEstadoCivil(leer.next());
            }
        }
    }
}
