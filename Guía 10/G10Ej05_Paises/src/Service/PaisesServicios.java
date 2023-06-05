package Service;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class PaisesServicios {
    Scanner leer;
    
    
    public PaisesServicios() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public TreeSet<String> crearConjunto() {
        TreeSet<String> paises = new TreeSet();

        return paises;
    }
    
    public void agregarPaises(TreeSet<String> paises) {
        String respuesta = "";
        System.out.println("____________________________________");
        
        do {
            System.out.println("¿Desea ingresar un país al conjunto? (S/N)");
            respuesta = leer.next();
            while ((!"S".equalsIgnoreCase(respuesta)) && (!"N".equalsIgnoreCase(respuesta))) {
                System.out.println("Ingreso incorrecto, intente nuevamente (S para si, N para no)");
                respuesta = leer.next();
            }
            
            if (respuesta.equalsIgnoreCase("S")) {
                System.out.println("Indique el nombre del país:");
                paises.add(leer.next());
            }
            
            System.out.println("____________________________________");
        } while (respuesta.equalsIgnoreCase("S"));
    }
    
    public void mostrarConjuntoPaises(TreeSet<String> paises) {
        System.out.println("____________________________________");
        System.out.println("Paises en el conjunto:");
        int aux = 0;
        
        for(String pais : paises) {
            if (aux == paises.size() - 1) {
                System.out.println(pais + ".");
            } else {
                System.out.print(pais + ", ");
                aux++;
            }
        }
        System.out.println("____________________________________");
    }
    
    public void eliminarPais(TreeSet<String> paises) {
        Iterator it = paises.iterator();
        System.out.println("____________________________________");
        System.out.println("Ingrese el nombre del país que desea eliminar del conjunto:");
        String paisABorrar = leer.next();
        int aux = paises.size();
        
        while (it.hasNext()) {
            if (paisABorrar.equalsIgnoreCase((String) it.next())) {
                it.remove();
            }
        }
        
        if (aux == paises.size()) {
            System.out.println("El país mencionado no se encontraba en la lista");
            System.out.println("____________________________________");
        } else {
            System.out.println("País eliminado. Conjunto de paises:");
            mostrarConjuntoPaises(paises);
            
        }
    }
    
    public void menu(TreeSet<String> paises) {
        int respuesta = 0;
        
        do {
            System.out.println("Se creó un conjunto de paises");
            System.out.println("1. Agregar paises al conjunto");
            System.out.println("2. Mostrar conjunto de paises");
            System.out.println("3. Eliminar país del conjunto");
            System.out.println("4. Salir");
            respuesta = leer.nextInt();
            
            switch (respuesta) {
                case 1:
                    agregarPaises(paises);
                    continue;
                case 2:
                    mostrarConjuntoPaises(paises);
                    continue;
                case 3:
                    eliminarPais(paises);
                    continue;
                default:
                    System.out.println("programa finalizado");
            }
            
        } while ((respuesta > 0) && (respuesta < 4));
    }
}
