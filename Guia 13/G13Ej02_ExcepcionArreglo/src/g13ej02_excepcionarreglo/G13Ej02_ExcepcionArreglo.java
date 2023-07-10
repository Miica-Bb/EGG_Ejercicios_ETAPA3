package g13ej02_excepcionarreglo;

public class G13Ej02_ExcepcionArreglo {

    public static void main(String[] args) {
        int[] numeros = new int[5];
            int aux = 1;
            int indice = 0;
            
        try {            
            for (int i = 0; i < 10; i++) {
                numeros[i] = aux;
                aux++;
                indice++;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("El índice que se intenta obtener (" + indice + ") se encuentra por fuera de la longitud del vector (" + numeros.length + ")");
        }
        
    }

}
