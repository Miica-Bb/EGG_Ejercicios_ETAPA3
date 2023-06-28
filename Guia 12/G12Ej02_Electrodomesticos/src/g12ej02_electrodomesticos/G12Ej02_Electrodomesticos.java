package g12ej02_electrodomesticos;

import Entidades.Lavadora;
import Entidades.Televisor;

public class G12Ej02_Electrodomesticos {

    public static void main(String[] args) {
        Lavadora lavadora1 = new Lavadora();
        System.out.println("LAVADORA:");
        lavadora1.crearLavadora();
        lavadora1.precioFinal();
        System.out.println("El precio de la lavadora es: $" + lavadora1.getPrecio());
        System.out.println("");
        
        Televisor tv1 = new Televisor();
        System.out.println("TELEVISOR:");
        tv1.crearTelevisor();
        tv1.precioFinal();
        System.out.println("El precio del televior es: $" + tv1.getPrecio());
        System.out.println("");
        
        System.out.println(lavadora1.toString());
        System.out.println(tv1.toString());
        
    }

}
