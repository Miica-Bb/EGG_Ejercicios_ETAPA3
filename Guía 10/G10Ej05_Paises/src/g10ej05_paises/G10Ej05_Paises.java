package g10ej05_paises;

import Service.PaisesServicios;
import java.util.TreeSet;

public class G10Ej05_Paises {

    public static void main(String[] args) {
        PaisesServicios pS = new PaisesServicios();
        TreeSet<String> paises = pS.crearConjunto();
        
        pS.menu(paises);
    }

}
