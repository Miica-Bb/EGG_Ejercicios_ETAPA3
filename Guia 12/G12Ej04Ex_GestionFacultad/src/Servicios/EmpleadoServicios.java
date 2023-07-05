package Servicios;

import Entidades.Empleado;
import Entidades.Persona;
import java.util.List;
import java.util.Scanner;

public abstract class EmpleadoServicios extends PersonaServicios{

    @Override
    public void cambiarEstadoCivil(List<Persona> individuo) {
        super.cambiarEstadoCivil(individuo);
    }
    
    public void reasignarDespacho(List<Empleado> trabajador) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el dni del empleado cuyo despacho quiere modificar: ");
        String dni = leer.next();
        
        for (Empleado ind : trabajador) {
            if (ind.getDni().equalsIgnoreCase(dni)) {
                System.out.print("Ingrese el número del nuevo despacho: ");
                ind.setNumDespachoAsignado(leer.nextInt());
            }
        }
    }
}
