package g11ej03_cartasybaraja;

import Entidades.Baraja;
import Servicios.BarajaServicios;

public class G11Ej03_CartasYBaraja {

    public static void main(String[] args) {
        BarajaServicios bs = new BarajaServicios();
        Baraja bar = bs.crearBaraja();
        
        bs.menu(bar);
        
        
    }

}
