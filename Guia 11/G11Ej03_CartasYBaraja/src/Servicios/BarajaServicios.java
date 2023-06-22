package Servicios;

import Entidades.Baraja;
import Entidades.Carta;
import Enumeraciones.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BarajaServicios {
    Scanner leer;
    List<Carta> cartasDadas;

    public BarajaServicios() {
        leer = new Scanner(System.in).useDelimiter("\n");
        cartasDadas = new ArrayList<>();
    }
    
    public Baraja crearBaraja() {
        List<Carta> listaCartas = new ArrayList<> ();
        
        for (Palo elemento : Palo.values()) {
            for (int i = 1; i < 13; i++) {
                if (i == 8 || i == 9) {
                    continue;
                } else {
                    Carta nueva = new Carta(elemento, i);
                    listaCartas.add(nueva);
                }
            }
        }
        
        Baraja baraja = new Baraja(listaCartas);
        
        return baraja;
    }
    
    public void barajar(Baraja bar) {
        Collections.shuffle(bar.getListaCartas());
    }
    
    public void siguienteCarta(Baraja bar) {
        if (bar.getListaCartas().size() > 0) {
            System.out.println(bar.getListaCartas().get(0));
        } else {
            System.out.println("Ya no hay cartas en la baraja");
        }
        System.out.println("");
    }
    
    public void cartasDisponibles(Baraja bar) {
        System.out.println("Cantidad de cartas disponibles: " + bar.getListaCartas().size());
        System.out.println("");
    }
    
    public void darCartas(Baraja bar) {
        Iterator it = bar.getListaCartas().iterator();
        
        System.out.println("Indique cuántas cartas quiere");
        int numCartas = leer.nextInt();
        
        if (numCartas <= bar.getListaCartas().size()) {
            while (it.hasNext() && numCartas > 0) {
                cartasDadas.add((Carta) it.next());
                it.remove();
                numCartas--;
            }
        } else {
            System.out.println("La cantidad de cartas restantes en la baraja es insuficiente");
        }
        System.out.println("");
    }
    
    public void cartasMonton() {
        if (cartasDadas.size() < 1) {
            System.out.println("Aun no ha salido ninguna carta");
        } else {
            for(Carta elemento : cartasDadas) {
                System.out.println(elemento + " ");
            }
        }
        System.out.println("");
    }
    
    public void mostrarBaraja(Baraja bar) {
        if (bar.getListaCartas().size() < 1) {
            System.out.println("Aun no ha salido ninguna carta");
        } else {
            for(Carta elemento : bar.getListaCartas()) {
                System.out.println(elemento + " ");
            }
        }
        System.out.println("");
    }
    
    public void menu(Baraja bar) {
        int opcion = 0;
        
        do {
            System.out.println("**************************************");
            System.out.println("1. Mezclar la baraja");
            System.out.println("2. mostrar baraja");
            System.out.println("3. siguiente carta");
            System.out.println("4. dar cartas");
            System.out.println("5. cantidad de cartas disponibles");
            System.out.println("6. mostrar cartas que ya salieron");
            System.out.println("7. salir");
            System.out.println("**************************************");
            
            do {
                opcion = leer.nextInt();
            
                if (opcion < 0 || opcion > 7) {
                    System.out.println("Ingreso incorrecto, intente nuevamente");
                }
                System.out.println("");
            } while (opcion < 0 || opcion > 7);
            
            switch (opcion) {
                case 1:
                    barajar(bar);
                    continue;
                case 2:
                    mostrarBaraja(bar);
                    continue;
                case 3:
                    siguienteCarta(bar);
                    continue;
                case 4:
                    darCartas(bar);
                    continue;
                case 5:
                    cartasDisponibles(bar);
                    continue;
                case 6:
                    cartasMonton();
            }
            
        } while (opcion > 0 && opcion < 7);
        
    }
    
    
}
