package manosalaobra_libros;

import Entidad.Libro;
import java.util.ArrayList;

public class ManosALaObra_libros {

    public static void main(String[] args) {
        Libro l1 = new Libro("Mariposas", "Paquita Ortegas", "4654687654");
        Libro l2 = new Libro("Orugas", "Lolita Ortegas", "46546746546");
        Libro l3 = new Libro("Di oder uomen", "Ulrich Bach", "3445634+6945");
        
        ArrayList<Libro> librosLista = new ArrayList();
        librosLista.add(l1);
        librosLista.add(l2);
        librosLista.add(l3);
        
        for(Libro libro : librosLista) {
            System.out.println(libro);
        }
    }

}
