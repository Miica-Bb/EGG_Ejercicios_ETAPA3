package Servicios;

import Entidades.Empleado;
import Entidades.Profesor;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProfesorServicios extends EmpleadoServicios{
    Scanner leer;

    public ProfesorServicios() {
        leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public List<Profesor> crearListaProfesores() {
        List<Profesor> profesores = new ArrayList<>();
        String continuar = "";
        
        do {
            Profesor nuevo = new Profesor();
            System.out.println("Datos sobre el profesor:");
            System.out.print("Ingrese el nombre: ");
            nuevo.setNombre(leer.next());
            System.out.print("Ingrese el apellido: ");
            nuevo.setApellido(leer.next());
            System.out.print("Ingrese el DNI: ");
            nuevo.setDni(leer.next());
            System.out.print("Ingrese el estado civil: ");
            nuevo.setDni(leer.next());
            System.out.print("Ingrese el año de ingreso a la facultad: ");
            nuevo.setAnioIngreso(leer.nextInt());
            System.out.print("Ingrese el despacho asignado: ");
            nuevo.setNumDespachoAsignado(leer.nextInt());
            System.out.print("Ingrese el departamento al que pertenece: ");
            nuevo.setDepartamento(leer.next());
            
            profesores.add(nuevo);
            System.out.println("Desea agregar otro profesor? (S para continuar, caso contrario ingresar cualquier caracter)");
            continuar = leer.next();
        } while (continuar.equalsIgnoreCase("S"));
        
        return profesores;
    }

    @Override
    public void reasignarDespacho(List<Empleado> trabajador) {
        super.reasignarDespacho(trabajador);
    }

    @Override
    public void cambiarEstadoCivil(List<Persona> individuo) {
        super.cambiarEstadoCivil(individuo);
    }
    
    public void cambiarDepartamento(List<Profesor> profesores) {
        System.out.print("Ingrese el dni del profesor cuyo departamento quiere modificar: ");
        String dni = leer.next();
        
        for (Profesor ind : profesores) {
            if (ind.getDni().equalsIgnoreCase(dni)) {
                System.out.print("Ingrese el nuevo departamento: ");
                ind.setDepartamento(leer.next());
            }
        }
    }
}
