package g10ej04_cine;

import Entidades.Pelicula;
import Service.PeliculaServicios;
import java.util.ArrayList;

public class G10Ej04_Cine {

    public static void main(String[] args) {
        PeliculaServicios pS = new PeliculaServicios();
        
        ArrayList<Pelicula> peliculas = pS.crearPelicula();
        pS.mostrarListaPeliculas(peliculas);
        pS.mostrarPeliculasMasDeUnaHoraDuracion(peliculas);
        System.out.println("_____ORDENADAS POR DURACIÓN (menor a mayor)_____");
        pS.ordenarListaPorDuracion(peliculas);
        pS.mostrarListaPeliculas(peliculas);
        System.out.println("_____ORDENADAS POR DURACIÓN (mayor a menor)_____");
        pS.ordenarListaPorDuracionInversa(peliculas);
        pS.mostrarListaPeliculas(peliculas);
        System.out.println("_____ORDENADAS POR TÍTULO_____");
        pS.ordenarListaPorTitulo(peliculas);
        pS.mostrarListaPeliculas(peliculas);
        System.out.println("_____ORDENADAS POR DIRECTOR_____");
        pS.ordenarListaPorDirector(peliculas);
        pS.mostrarListaPeliculas(peliculas);
    }

}
