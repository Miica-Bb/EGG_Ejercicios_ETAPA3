package g10ej03_alumnoslistanotas;

import Entidades.Alumno;
import Service.AlumnoServicios;
import java.util.ArrayList;

public class G10Ej03_AlumnosListaNotas {

    public static void main(String[] args) {
        AlumnoServicios aS = new AlumnoServicios();
        
        ArrayList<Alumno> alumnos = aS.crearAlumno();
        aS.notaFinal(alumnos);
    }

}
