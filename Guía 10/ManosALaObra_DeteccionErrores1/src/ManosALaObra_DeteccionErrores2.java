
import java.util.HashSet;



public class ManosALaObra_DeteccionErrores2 {

    public static void main(String[] args) {
        HashSet<String> personas = new HashSet();
        
        String nom1 = "Albus";
        String nom2 = "Severus";
        personas.add(nom1);
        personas.add(nom2);
        
        for (String nombre : personas) {
            System.out.print(nombre + ", ");
        }
    }

}
