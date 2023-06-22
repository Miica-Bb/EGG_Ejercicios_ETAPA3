package g11ej01_personayperro;

import Entidades.Perro;
import Entidades.Persona;
import java.util.Scanner;

public class G11Ej01_PersonaYPerro {

    public static void main(String[] args) {     
        Persona ind1 = new Persona();
        Persona ind2 = new Persona();
        Perro masc1 = new Perro();
        Perro masc2 = new Perro();
        
        pedirDatos(ind1, masc1);
        pedirDatos(ind2, masc2);
        ind1.mostrarInfo();
        ind2.mostrarInfo();
    }
    
    public static void pedirDatos(Persona ind, Perro masc) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.print("Ingrese el nombre de la persona: ");
        ind.setNombre(leer.next());
        System.out.print("Ingrese el apellido de la persona: ");
        ind.setApellido(leer.next());
        System.out.print("Ingrese la edad de la persona: ");
        ind.setEdad(leer.nextInt());
        System.out.print("Ingrese el dni de la persona: ");
        ind.setDocumento(leer.next());
        
        System.out.println("");
        System.out.println("A continuación, se pedirán los datos del perro que esta persona tendrá");
        
        System.out.print("Ingrese el nombre del perro: ");
        masc.setNombre(leer.next());
        System.out.print("Ingrese la raza del perro: ");
        masc.setRaza(leer.next());
        System.out.print("Ingrese la edad del perro: ");
        masc.setEdad(leer.nextInt());
        System.out.print("Ingrese el tamaño del perro: ");
        masc.setTamanio(leer.next());
        
        ind.setMascota(masc);
        System.out.println("");
    }
    
}
