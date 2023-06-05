package manosalaobra_deteccionerrores1;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.HashMap;

public class ManosALaObra_DeteccionErrores1 {

    public static void main(String[] args) {
        ArrayList<Integer> listado = new ArrayList();
        TreeSet<String> nombres = new TreeSet();
        HashMap<Integer, String> personas = new HashMap();
        
        Integer a = 1, b = 2, c = 3, d = 4, e = 5;
        Integer dni1 = 12345678, dni2 = 98765432, dni3 = 67914553, dni4 = 18934555, dni5 = 777345789;
        String nom1 = "Mica", nom2 = "Lola", nom3 = "Sofi", nom4 = "Loly", nom5 = "Sultan";
        String nomDni1 = "A", nomDni2 = "B", nomDni3 = "C", nomDni4 = "D", nomDni5 = "E";
        
        listado.add(a);
        listado.add(b);
        listado.add(c);
        listado.add(d);
        listado.add(e);
        
        nombres.add(nom1);
        nombres.add(nom2);
        nombres.add(nom3);
        nombres.add(nom4);
        nombres.add(nom5);
        
        personas.put(dni1, nomDni1);
        personas.put(dni2, nomDni2);
        personas.put(dni3, nomDni3);
        personas.put(dni4, nomDni4);
        personas.put(dni5, nomDni5);
        
        listado.remove(3);
        nombres.remove(nom3);
        personas.remove(dni3);
    }

}
