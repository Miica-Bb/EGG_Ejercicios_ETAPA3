package Servicios;

import Entidades.Estudiante;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstudianteServicios extends PersonaServicios{
    Scanner leer;

    public EstudianteServicios() {
        leer = new Scanner(System.in).useDelimiter("\n");
    }
        
    public List<Estudiante> crearListaEstudiantes() {
        List<Estudiante> estudiantes = new ArrayList<>();
        String continuar = "";
        
        do {
            Estudiante nuevo = new Estudiante();
            System.out.println("Datos sobre el estudiante:");
            System.out.print("Ingrese el nombre: ");
            nuevo.setNombre(leer.next());
            System.out.print("Ingrese el apellido: ");
            nuevo.setApellido(leer.next());
            System.out.print("Ingrese el DNI: ");
            nuevo.setDni(leer.next());
            System.out.print("Ingrese el estado civil del estudiante: ");
            nuevo.setDni(leer.next());
            System.out.print("Ingrese el curso que estudiará: ");
            nuevo.setCurso(leer.next());
            
            estudiantes.add(nuevo);
            System.out.println("Desea agregar otro estudiante? (S para continuar, caso contrario ingresar cualquier caracter)");
            continuar = leer.next();
        } while (continuar.equalsIgnoreCase("S"));
        
        return estudiantes;
    }

    @Override
    public void cambiarEstadoCivil(List<Persona> individuo) {
        super.cambiarEstadoCivil(individuo);
    }
    
    public void rematricularEstudiante(List<Estudiante> estudiantes) {
        System.out.print("Ingrese el dni del estudiante que desea rematricular: ");
        String dni = leer.next();
        
        for (Estudiante ind : estudiantes) {
            if (ind.getDni().equalsIgnoreCase(dni)) {
                System.out.print("Ingrese el nuevo curso: ");
                ind.setCurso(leer.next());
            }
        }
    }
}
