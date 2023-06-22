package g11ej02_ruletarusa;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

public class G11Ej02_RuletaRusa {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Juego nuevo = new Juego();
        RevolverDeAgua r = new RevolverDeAgua();
        
        ArrayList<Jugador> jugadores = new ArrayList();
        Jugador p1;
        Jugador p2;
        Jugador p3;
        Jugador p4;
        Jugador p5;
        Jugador p6;
        int numJug = 0;
        
        System.out.println("Ruleta rusa de agua:");
        
        do {
           System.out.println("Cuantos jugadores son? (Maximo 6)");
           numJug = leer.nextInt();
           
           if (numJug < 1 || numJug > 6) {
               System.out.println("Ingreso incorrecto. De 1 a 6 jugadores");
           }
        } while (numJug < 1 || numJug > 6);
        
        switch (numJug) {
            case 1:
                p1 = new Jugador(1, false);
                jugadores.add(p1);
                break;
            case 2:
                p1 = new Jugador(1, false);
                jugadores.add(p1);
                p2 = new Jugador(2, false);
                jugadores.add(p2);
                break;
            case 3:
                p1 = new Jugador(1, false);
                jugadores.add(p1);
                p2 = new Jugador(2, false);
                jugadores.add(p2);
                p3 = new Jugador(3, false);
                jugadores.add(p3);
                break;
            case 4:
                p1 = new Jugador(1, false);
                jugadores.add(p1);
                p2 = new Jugador(2, false);
                jugadores.add(p2);
                p3 = new Jugador(3, false);
                jugadores.add(p3);
                p4 = new Jugador(4, false);
                jugadores.add(p4);
                break;
            case 5:
                p1 = new Jugador(1, false);
                jugadores.add(p1);
                p2 = new Jugador(2, false);
                jugadores.add(p2);
                p3 = new Jugador(3, false);
                jugadores.add(p3);
                p4 = new Jugador(4, false);
                jugadores.add(p4);
                p5 = new Jugador(5, false);
                jugadores.add(p5);
                break;
            case 6:
                p1 = new Jugador(1, false);
                jugadores.add(p1);
                p2 = new Jugador(2, false);
                jugadores.add(p2);
                p3 = new Jugador(3, false);
                jugadores.add(p3);
                p4 = new Jugador(4, false);
                jugadores.add(p4);
                p5 = new Jugador(5, false);
                jugadores.add(p5);
                p6 = new Jugador(6, false);
                jugadores.add(p6);
                break;
        }
        
        System.out.println("");
        
        r.llenarRevolver();
        
        nuevo.llenarJuego(jugadores, r);
        nuevo.ronda();
    }

}
