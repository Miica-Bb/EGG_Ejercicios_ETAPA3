package g11ej01_personayperro;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class G11Ej01_PersonaYPerro {

    public static void main(String[] args) {     
        List<Perro> perrosDisponibles = armarListaDePerrosEnAdopcion();
        List<Persona> adoptantes = armarListaDeAdoptantes();
        adoptar(adoptantes, perrosDisponibles);
        
        for(Persona recorrer : adoptantes) {
            System.out.println(recorrer.toString());
        }
    }
    
    public static List<Persona> armarListaDeAdoptantes() {
        Scanner leer = new Scanner(System.in);
        List<Persona> totalAdoptantes = new ArrayList<>();
        
        System.out.println("Ingresar cuántas personas buscan adoptar un Perro");
        int totalPersonas = leer.nextInt();
        
        for (int i = 0; i < totalPersonas; i++) {
            Persona nueva = new Persona();
            
            System.out.println("Persona n° " + (i + 1));
            System.out.print("Ingrese el nombre: ");
            nueva.setNombre(leer.next());
            System.out.print("Ingrese el apellido: ");
            nueva.setApellido(leer.next());
            System.out.print("Ingrese la edad: ");
            nueva.setEdad(leer.nextInt());
            System.out.print("Ingrese el dni: ");
            nueva.setDocumento(leer.next());
            System.out.println("");
            
            totalAdoptantes.add(nueva);
        }
        
        return totalAdoptantes;
    }
    
    public static List<Perro> armarListaDePerrosEnAdopcion() {
        Scanner leer = new Scanner(System.in);
        List<Perro> perrosAdopcion = new ArrayList<>();
        
        System.out.println("Ingresar cuántos perros hay en adopción");
        int cantPerros = leer.nextInt();
        
        for (int i = 0; i < cantPerros; i++) {
            Perro nuevo = new Perro();
            boolean condicion = false;
            String nombre;
            
            System.out.println("Perro n° " + (i + 1));
            do {
                System.out.print("Ingrese el nombre: ");
                nombre = leer.next();
                
                if (perrosAdopcion.size() < 1) {
                    condicion = true;
                    nuevo.setNombre(nombre);
                } else {
                    for (int j = 0; j < perrosAdopcion.size(); j++) {
                        if (perrosAdopcion.get(j).getNombre().equalsIgnoreCase(nombre)) {
                            System.out.println("Ese nombre ya fue tomado, ingresar otro");
                            condicion = false;
                        } else {
                            condicion = true;
                            nuevo.setNombre(nombre);
                        }
                    }
                }
                
            } while (condicion == false);
            
            System.out.print("Ingrese la raza: ");
            nuevo.setRaza(leer.next());
            System.out.print("Ingrese la edad: ");
            nuevo.setEdad(leer.nextInt());
            System.out.print("Ingrese el tamaño: ");
            nuevo.setTamanio(leer.next());
            System.out.println("");
            
            perrosAdopcion.add(nuevo);
        }
        
        return perrosAdopcion;
    }
    
    public static void adoptar(List<Persona> personas, List<Perro> perros) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Comienza la campaña de adopción!");
        System.out.println("Estos son los perros con los que contamos en esta ocasión: ");
        
        for(Perro elemento : perros) {
            System.out.println(elemento.getNombre() + ", ");
        }
        
        List<String> aux = new ArrayList<>();
        String adoptar = "";
        String otro = "";
        
        out:
        for (int i = 0; i < perros.size(); i++) {
            
            System.out.println("\n Perros ya adoptados: ");
            for (String nombre : aux) {
                System.out.println(aux + ", ");
            }
            
            System.out.println("");
            System.out.println("Atendiendo a " + personas.get(i).getNombre() + ", persona n° " + (i + 1));
            System.out.println("Ingresar el nombre de la mascota que desea adoptar: ");
            adoptar = leer.next();
            
            
            for (Perro elemento : perros) {
                if (elemento.getNombre().equalsIgnoreCase(adoptar)) {
                    for (String nombre : aux) {
                        System.out.println("Lo sentimos, este perro ya fue adoptado");
                        break;
                    }
                    
                    System.out.println("Felicidades! adoptaste un perrito");
                    aux.add(adoptar);
                    personas.get(i).setMascota(elemento);
                } else if ((perros.size() > 0) && (!adoptar.equalsIgnoreCase(elemento.getNombre()))) {
                    System.out.println("No contamos con un perro que tenga ese nombre");
                }    
            }
            
            if (i == (personas.size() - 1)) {
                break out;
            }
        }
        
        if (personas.size() < perros.size()) {
            System.out.println("Campaña de adopción finalizada, ya no hay más personas interesadas");
        } else {
            System.out.println("Campaña finalizada, ¡ya no hay más perros!");
        }
        
    }
    
}
