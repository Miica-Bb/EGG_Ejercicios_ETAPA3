package manosalaobra_jugadorobjetosrelaciones;

import java.util.ArrayList;
import Entidades.Equipo;
import Entidades.Jugador;

public class ManosALaObra_JugadorObjetosRelaciones {

    public static void main(String[] args) {
        Jugador jug1 = new Jugador("Javier", "Garcia", "Arquero", 13);
        Jugador jug2 = new Jugador("Luis", "Advincula", "Defensor", 17);
        Jugador jug3 = new Jugador("Valentin", "Barco", "Defensor", 19);
        Jugador jug4 = new Jugador("Marcos", "Rojo", "Defensor", 6);
        Jugador jug5 = new Jugador("Miguel", "Merendiel", "Delantero", 16);
        Jugador jug6 = new Jugador("Luca", "Langoni", "Delantero", 41);
        Jugador jug7 = new Jugador("Nicolas", "Orsini", "Delantero", 27);
        Jugador jug8 = new Jugador("Martin", "Payero", "Mediocampista", 11);
        Jugador jug9 = new Jugador("Cristian", "Medina", "Mediocampista", 36);
        Jugador jug10 = new Jugador("Exequiel", "Zeballos", "Delantero", 7);
        Jugador jug11 = new Jugador("Marcelo", "Weigandt", "Defensor", 57);
        
        ArrayList<Jugador> jugadores = new ArrayList();
        jugadores.add(jug1);
        jugadores.add(jug2);
        jugadores.add(jug3);
        jugadores.add(jug4);
        jugadores.add(jug5);
        jugadores.add(jug6);
        jugadores.add(jug7);
        jugadores.add(jug8);
        jugadores.add(jug9);
        jugadores.add(jug10);
        jugadores.add(jug11);
        
        Equipo boca = new Equipo();
        boca.setJugadores(jugadores);
        
        System.out.println("PLANTEL DE BOCA");
        System.out.println(boca.toString());
    }

}
