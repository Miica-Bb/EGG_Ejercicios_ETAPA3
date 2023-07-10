package g13ej05_adivinarnumero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class G13Ej05_AdivinarNumero {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int numAdivinar = (int) (Math.random() * 500 + 1);
        int numIngresado = 0;
        int intentos = 0;
        String aux = "";
        
        System.out.println("Adiviná el número! (está entre el 1 y el 500)");
        do {
            try {
                System.out.print("Ingresá un número entero: ");
                intentos++;
                numIngresado = leer.nextInt();
                
                if (numIngresado < numAdivinar) {
                    System.out.println("El número es más alto");
                } else if (numIngresado > numAdivinar) {
                    System.out.println("El número es más bajo");
                } else if (numIngresado == numAdivinar) {
                    System.out.println("Felicidades! Adivinaste el número");
                }
                
            } catch (InputMismatchException a) {
                System.out.println("Por favor, no ingreses caracteres. Intentá nuevamente");
                aux = leer.nextLine();
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado, intentá nuevamente");
                aux = leer.nextLine();
            }

        } while (numIngresado != numAdivinar);
        System.out.println("");
        System.out.println("Cantidad de intentos: " + intentos);
    }

}
