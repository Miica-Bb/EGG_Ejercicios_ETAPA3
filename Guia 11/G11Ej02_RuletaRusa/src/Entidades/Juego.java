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
        for (Jugador aux : jugadores) {
            this.jugadores.add(aux);
        }
        
        this.r.setPosicionActual(r.getPosicionActual());
        this.r.setPosicionAgua(r.getPosicionAgua());
    }
    
    public void ronda() {
        String sigJugador = "";
        Jugador eliminarJugador = new Jugador();
        int jugUno = 0;
        
        do {
            for (int i = jugUno; i <= jugadores.size(); i++) {
                jugadores.get(i).disparo(r);
                System.out.println("Turno del " + jugadores.get(i).getNombre());

                if (jugadores.get(i).getMojado()) {
                    System.out.println("Ronda finalizada!");
                    System.out.println(jugadores.get(i).getNombre() + " se mojó \n ______SIGUIENTE RONDA______ \n");
                    eliminarJugador = jugadores.get(i);
                    
                    if (i == jugadores.size() - 1) {
                        i = -1;
                    } else {
                        jugUno = i;
                    }
                    break;
                } else {
                    System.out.println("Tambor vacío");
                    System.out.println("Presione enter para continuar");
                    sigJugador = leer.next();
                    System.out.println("Siguiente jugador....");
                    if (i == jugadores.size() - 1) {
                        i = -1;
                    }
                }
            }
            
            jugadores.remove(eliminarJugador);
            r.llenarRevolver();
        } while (jugadores.size() > 1);
        
        System.out.println("GANADOR: " + jugadores.get(0).getNombre());
        
    }
}
