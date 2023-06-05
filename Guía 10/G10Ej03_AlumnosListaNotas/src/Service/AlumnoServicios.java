package Service;

import java.util.Scanner;
import java.util.ArrayList;
import Entidades.Alumno;

public class AlumnoServicios {
    Scanner leer;
    

    public AlumnoServicios() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public ArrayList<Alumno> crearAlumno() {
        ArrayList<Alumno> alumnos = new ArrayList();
        String respuesta = "";
        Integer nota;
        
        do {
            System.out.println("Desea agregar un nuevo alumno a la lista? (S/N)");
            respuesta = leer.next();
            while ((!"S".equalsIgnoreCase(respuesta)) && (!"N".equalsIgnoreCase(respuesta))) {
                System.out.println("Letra ingresada incorrecta, intente nuevamente (S para si o N para no)");
                respuesta = leer.next();
            }
            
            if (respuesta.equalsIgnoreCase("S")) {
                Alumno nuevo = new Alumno();
                System.out.println("Ingrese el nombre del alumno:");
                nuevo.setNombre(leer.next());
                for (int i = 0; i < 3; i++) {
                    System.out.println("Ingresar " + (i +  1) + "° nota: ");
                    nota = leer.nextInt();
                    nuevo.getNotas().add(nota);
                }
                
                alumnos.add(nuevo);
            }
        } while (respuesta.equalsIgnoreCase("S"));
        
        return alumnos;
    }
    
    public void notaFinal(ArrayList<Alumno> alumnos) {
        System.out.println("");
        System.out.println("Ingrese el nombre del alumno cuya nota final desea obtener:");
        String nombreAlumno = leer.next();
        double notaFinal = 0;
        
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNombre().equalsIgnoreCase(nombreAlumno)) {
                notaFinal = (alumnos.get(i).getNotas().get(0) + alumnos.get(i).getNotas().get(1)
                            + alumnos.get(i).getNotas().get(2)) / 3;
                
                System.out.println("El alumno " + nombreAlumno + " tiene una nota final de: " + notaFinal);
                break;
            } else if (i == alumnos.size() - 1){
                System.out.println("El alumno no estaba en la lista");
            }
        }
    }
}
