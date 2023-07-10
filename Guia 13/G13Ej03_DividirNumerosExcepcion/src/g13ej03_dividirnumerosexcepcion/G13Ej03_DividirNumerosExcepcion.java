package g13ej03_dividirnumerosexcepcion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class G13Ej03_DividirNumerosExcepcion {
    
    public static void main(String[] args) {
        String[] numsCadena;
        int[] numsEnteros;
        double resultado = 0;
        try {
            numsCadena = pedirNumeros();
            numsEnteros = convertirNumeros(numsCadena);
            dividirNumeros(numsEnteros);

        } catch (InputMismatchException a) {
            System.out.println("Dato ingresado por teclado erróneo");
        } catch (NumberFormatException b) {
            System.out.println("El dato ingresado no es un número entero");
        } catch (ArithmeticException c) {
            System.out.println("No se puede dividir por cero");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado");
        }
    }

    public static String[] pedirNumeros() throws InputMismatchException{
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String[] numeros = new String[2];
        
        System.out.print("Ingrese un número entero: ");
        String num1Cadena = leer.next();
        System.out.print("Ingrese otro número entero: ");
        String num2Cadena = leer.next();
        System.out.println("");
        
        numeros[0] = num1Cadena;
        numeros[1] = num2Cadena;
        
        return numeros;
    }
    
    public static int[] convertirNumeros(String[] numeros) throws NumberFormatException {
        int[] numsEnteros = new int[2];
        int num1Int = Integer.parseInt(numeros[0]);
        int num2Int = Integer.parseInt(numeros[1]);
        
        numsEnteros[0] = num1Int;
        numsEnteros[1] = num2Int;
        
        return numsEnteros;
    }
    
    public static void dividirNumeros(int[] numeros) throws ArithmeticException {
        double resultado = (double) numeros[0] / numeros[1];
        
        if (numeros[1] == 0) {
            throw new ArithmeticException("");
        }
        
        System.out.println(numeros[0] + " / " + numeros[1] + " = " + resultado);
    }
    
}
