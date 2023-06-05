package manosalaobra_deteccionerrores1;

import java.util.ArrayList;
import java.util.Iterator;

public class ManosALaObra_DeteccionErrores3 {

    public static void main(String[] args) {
        ArrayList<String> bebidas = new ArrayList();
        
        bebidas.add("café");
        bebidas.add("té");
        
        Iterator<String> it = bebidas.iterator();
        
        while (it.hasNext()) {
            if (it.next().equals("café")){
                it.remove();
            }
        }
    }
}
