package Servicios;

import Entidades.Empleado;
import Entidades.Persona;
import Entidades.PersonalServicio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonalServicioServicios extends EmpleadoServicios{
    Scanner leer;

    public PersonalServicioServicios() {
        leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public List<PersonalServicio> crearListaPersonalServicio() {
        List<PersonalServicio> persServ = new ArrayList<>();
        String continuar = "";
        
        do {
            PersonalServicio nuevo = new PersonalServicio();
            System.out.println("Datos sobre el trabajador:");
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
            System.out.print("Ingrese la sección a la que pertenece: ");
            nuevo.setSeccion(leer.next());
            
            persServ.add(nuevo);
            System.out.println("Desea agregar otro trabajador? (S para continuar, caso contrario ingresar cualquier caracter)");
            continuar = leer.next();
        } while (continuar.equalsIgnoreCase("S"));
        
        return persServ;
    }

    @Override
    public void reasignarDespacho(List<Empleado> trabajador) {
        super.reasignarDespacho(trabajador); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cambiarEstadoCivil(List<Persona> individuo) {
        super.cambiarEstadoCivil(individuo); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void trasladarSeccion(List<PersonalServicio> trabajadores) {
        System.out.print("Ingrese el dni del trabajador cuya sección quiere modificar: ");
        String dni = leer.next();
        
        for (PersonalServicio ind : trabajadores) {
            if (ind.getDni().equalsIgnoreCase(dni)) {
                System.out.print("Ingrese la nueva sección: ");
                ind.setSeccion(leer.next());
            }
        }
    }
}
