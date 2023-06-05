package Servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class RazasPerrosServicios {
    Scanner leer;
    ArrayList<String> razasPerros;
    

    public RazasPerrosServicios() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.razasPerros = new ArrayList();
    }
    
    
    public void llenarLista() {
        String agregar = "";
        
        do {
            System.out.println("Ingresar raza de perro");
            razasPerros.add(leer.next());
            
            do {
                System.out.println("Desea agregar otra raza de perro? (S/N)");
                agregar = leer.next();
                
                if ((!"S".equalsIgnoreCase(agregar)) && (!"N".equalsIgnoreCase(agregar))) {
                    System.out.println("Ingreso incorrecto, intente nuevamente (S para agregar y N para terminar)");
                }
            } while ((!"S".equalsIgnoreCase(agregar)) && (!"N".equalsIgnoreCase(agregar)));
            
            
        } while (agregar.equalsIgnoreCase("S"));
    }
    
    public void mostrarLista() {
        System.out.println("");
        System.out.println("Razas ingresadas:");
        int aux = 0;
        
        for(String raza : razasPerros) {
            if ((raza.equals(razasPerros.get(razasPerros.size() - 1))) && (aux + 1 == razasPerros.size())) {
                System.out.println(raza + ".");
            } else {
                System.out.print(raza + ", ");
                aux++;
            }
        }
    }
    
    public void ordenarLista() {
        Collections.sort(razasPerros);
    }
    
    public void EliminarRaza() {
        System.out.println("");
        System.out.println("Ingrese una raza a eliminar de la lista");
        String eliminar = leer.next();
        Iterator it = razasPerros.iterator();
        String elemento = "";
        int aux = razasPerros.size();
        
        while (it.hasNext()) {
            elemento = it.next().toString();
            
            if (eliminar.equalsIgnoreCase(elemento)) {
                it.remove();
                System.out.println("Raza eliminada");
            }
        }
        
        ordenarLista();
        if (aux == razasPerros.size()) {
            System.out.println("La raza ingresada no se encontraba en la lista");
            mostrarLista();
        } else {
            mostrarLista();
        }
    }
}
