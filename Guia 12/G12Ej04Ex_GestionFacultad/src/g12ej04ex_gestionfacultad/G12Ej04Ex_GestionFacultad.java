package g12ej04ex_gestionfacultad;

import Entidades.Empleado;
import Entidades.Estudiante;
import Entidades.Persona;
import Entidades.PersonalServicio;
import Entidades.Profesor;
import Servicios.EstudianteServicios;
import Servicios.PersonalServicioServicios;
import Servicios.ProfesorServicios;
import java.util.ArrayList;
import java.util.List;

public class G12Ej04Ex_GestionFacultad {

    public static void main(String[] args) {
//        List<Persona> conjuntoFacultad = new ArrayList<>();
//        List<Estudiante> estudiantes = new ArrayList<>();
//        List<Profesor> profesores = new ArrayList<>();
//        List<PersonalServicio> perServ = new ArrayList<>();
//        
//        Estudiante alumno1 = new Estudiante("programacion", "Mica", "Br", "11222333", "Soltera");
//        Estudiante alumno2 = new Estudiante("ingles", "Gretchen", "Ga", "22333444", "Soltera");
//        Profesor profe1 = new Profesor("Informatica", 1995, 32, "Juan", "Perez", "33444555", "Casado");
//        Profesor profe2 = new Profesor("Lenguajes", 2009, 12, "Maria", "Suarez", "44555666", "Viuda");
//        PersonalServicio ps1 = new PersonalServicio("Secretaria", 2000, 4, "Barbara", "Z", "55666777", "Soltera");
//        PersonalServicio ps2 = new PersonalServicio("Biblioteca", 2014, 1, "Rocio", "Nuñez", "66777888", "Divorciada");
//        
//        conjuntoFacultad.add(alumno1);
//        conjuntoFacultad.add(alumno2);
//        conjuntoFacultad.add(profe1);
//        conjuntoFacultad.add(profe2);
//        conjuntoFacultad.add(ps1);
//        conjuntoFacultad.add(ps2);
//        
//        estudiantes.add(alumno1);
//        estudiantes.add(alumno2);
//        
//        profesores.add(profe1);
//        profesores.add(profe2);
//        
//        perServ.add(ps1);
//        perServ.add(ps2);
//        
//        for (Persona ind : conjuntoFacultad) {
//            System.out.println(ind.toString());
//        }
//        
//        System.out.println("______________________________\n\n");
//        alumno1.matricularseEnCurso("matemática");
//        alumno1.cambiarEstadoCivil("Casada");
//        profe2.cambiarDepartamento("Literatura");
//        profe2.reasignarDespacho(47);
//        ps1.cambiarEstadoCivil("Divorciada");
//        ps1.trasladarDeSeccion("Dirección");
//        
//        for (Persona ind : conjuntoFacultad) {
//            System.out.println(ind.toString());
//        }
        
        EstudianteServicios estServ = new EstudianteServicios();
        ProfesorServicios profServ = new ProfesorServicios();
        PersonalServicioServicios perServ2 = new PersonalServicioServicios(); 

        List<Persona> facultadCompleta = new ArrayList<>();
        List<Empleado> empleados = new ArrayList<>();
        List<Estudiante> estudiantes = estServ.crearListaEstudiantes();
        List<Profesor> profesores = profServ.crearListaProfesores();
        List<PersonalServicio> trabajadores = perServ2.crearListaPersonalServicio();
        
        facultadCompleta.add((Persona) estudiantes);
        facultadCompleta.add((Persona) profesores);
        facultadCompleta.add((Persona) trabajadores);
        empleados.add((Empleado) profesores);
        empleados.add((Empleado) trabajadores);
        
        for (Persona ind : facultadCompleta) {
            System.out.println(ind.toString());
        }
        
        estServ.cambiarEstadoCivil(facultadCompleta);
        estServ.rematricularEstudiante(estudiantes);
        profServ.cambiarEstadoCivil(facultadCompleta);
        profServ.reasignarDespacho(empleados);
        profServ.cambiarDepartamento(profesores);
        perServ2.cambiarEstadoCivil(facultadCompleta);
        perServ2.reasignarDespacho(empleados);
        perServ2.trasladarSeccion(trabajadores);
        
        for (Persona ind : facultadCompleta) {
            System.out.println(ind.toString());
        }
    }

}
