package Service;

import java.util.Scanner;
import java.util.ArrayList;
import Entidades.Pelicula;

public class PeliculaServicios {
    Scanner leer;

    public PeliculaServicios() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public ArrayList<Pelicula> crearPelicula() {
        ArrayList<Pelicula> peliculas = new ArrayList();
        String respuesta = "";
        
        do {
           System.out.println("¿Desea agregar una película a la lista? (S/N)");
           respuesta = leer.next();
           while ((!"S".equalsIgnoreCase(respuesta) && (!"N".equalsIgnoreCase(respuesta)))) {
               System.out.println("Ingreso incorrecto, intente nuevamente (S para si, N para no)");
               respuesta = leer.next();
           }
           
           if (respuesta.equalsIgnoreCase("S")) {
               Pelicula nueva = new Pelicula();
               
               System.out.println("Ingrese el título de la película");
               nueva.setTitulo(leer.next());
               System.out.println("Ingrese el nombre del director de la película");
               nueva.setDirector(leer.next());
               System.out.println("Ingrese la duración en horas de la película");
               nueva.setDuracion(leer.nextDouble());
               
               peliculas.add(nueva);
           }
        } while (respuesta.equalsIgnoreCase("S"));
        
        return peliculas;
    }
    
    public void mostrarListaPeliculas(ArrayList<Pelicula> peliculas) {
        System.out.println("");
        System.out.println("Películas en la lista:");
        
        for(Pelicula elemento : peliculas) {
            System.out.println(elemento);
        }
    }
    
    public void mostrarPeliculasMasDeUnaHoraDuracion(ArrayList<Pelicula> peliculas) {
        System.out.println("");
        System.out.println("Películas en lista que duran más de 1 hora:");
        
        for (int i = 0; i < peliculas.size(); i++) {
            if (peliculas.get(i).getDuracion() > 1) {
                System.out.println(peliculas.get(i));
            }
        }
    }
    
    public void ordenarListaPorDuracionInversa(ArrayList<Pelicula> peliculas) {
        peliculas.sort(Pelicula.compararDuracionInversa);
    }
    
    public void ordenarListaPorDuracion(ArrayList<Pelicula> peliculas) {
        peliculas.sort(Pelicula.compararDuracion);
    }
    
    public void ordenarListaPorTitulo(ArrayList<Pelicula> peliculas) {
        peliculas.sort(Pelicula.compararTitulo);
    }
    
    public void ordenarListaPorDirector(ArrayList<Pelicula> peliculas) {
        peliculas.sort(Pelicula.compararDirector);
    }
}
