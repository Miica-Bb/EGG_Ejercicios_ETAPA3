package g10ej06_tienda;

import Service.ProductoServicios;
import java.util.HashMap;

public class G10Ej06_Tienda {

    public static void main(String[] args) {
        ProductoServicios pS = new ProductoServicios();
        HashMap<String, Double> productos = pS.crearMapaProductos();
        
        pS.menu(productos);
    }

}
