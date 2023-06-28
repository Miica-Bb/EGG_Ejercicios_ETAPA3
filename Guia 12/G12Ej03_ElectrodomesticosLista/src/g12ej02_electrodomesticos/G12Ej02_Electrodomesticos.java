package g12ej02_electrodomesticos;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.List;
import java.util.ArrayList;

public class G12Ej02_Electrodomesticos {

    public static void main(String[] args) {
        List<Electrodomestico> listaElectrodomesticos = new ArrayList<>();
        double precioTotal = 0;
        
        Lavadora lavadora1 = new Lavadora(40, 1000, "negro", 'A', 40);
        Lavadora lavadora2 = new Lavadora(60, 1000, "blanco", 'C', 30);
        Televisor tv1 = new Televisor(32, true, 1000, "negro", 'F', 25);
        Televisor tv2 = new Televisor(45, false, 1000, "negro", 'D', 30);
        
        listaElectrodomesticos.add(lavadora1);
        listaElectrodomesticos.add(lavadora2);
        listaElectrodomesticos.add(tv1);
        listaElectrodomesticos.add(tv2);
        
        for (Electrodomestico aux : listaElectrodomesticos) {
            aux.precioFinal();
            precioTotal += aux.getPrecio();
            System.out.println("El precio de " + aux.getClass().getSimpleName() + " es: $" + aux.getPrecio());
        }
        
        System.out.println("El precio total de los 4 electrodomésticos es de: $" + precioTotal);
        
    }

}
