package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    private ArrayList<Jugador> jugadores;
    private RevolverDeAgua r;
    Scanner leer;

    public Juego() {
        jugadores = new ArrayList();
        r = new RevolverDeAgua();
        leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    
    
    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r) {
//        como lo hice yo

//        for (Jugador aux : jugadores) {
//            this.jugadores.add(aux);
//        }
//        
//        this.r.setPosicionActual(r.getPosicionActual());
//        this.r.setPosicionAgua(r.getPosicionAgua());
        
        this.jugadores = jugadores;
        this.r = r;
    }
    
    public void ronda() {
        String sigJugador = "";
        for (Jugador aux : jugadores) {
            aux.disparo(r);
            System.out.println("Turno del " + aux.getNombre());
            
            if (aux.getMojado()) {
                System.out.println("Juego finalizado!");
                System.out.println(aux.getNombre() + " se mojó");
                break;
            } else {
                System.out.println("Tambor vacío");
                System.out.println("Presione enter para continuar");
                sigJugador = leer.next();
                System.out.println("Siguiente jugador....");
            }
        }
    }
}
