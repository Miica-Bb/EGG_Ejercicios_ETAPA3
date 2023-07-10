package Servicios;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicios {
    Scanner leer;

    public PersonaServicios() {
        leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public Persona crearPersona() {
        String sexo = "";
        
        System.out.println("Ingrese el nombre de la persona");
        String nombre = leer.next();
        
        System.out.println("ingrese la edad de la persona");
        int edad = leer.nextInt();
        
        do {
            System.out.println("Ingrese el sexo de la persona (H hombre; M mujer; O otro");
            sexo = leer.next();
            if ((!"H".equalsIgnoreCase(sexo)) && (!"M".equalsIgnoreCase(sexo)) && (!"O".equalsIgnoreCase(sexo))) {
                System.out.println("Ingreso incorrecto. Intente nuevamente (H / M / O");
            }
        } while ((!"H".equalsIgnoreCase(sexo)) && (!"M".equalsIgnoreCase(sexo)) && (!"O".equalsIgnoreCase(sexo)));
        
        System.out.println("Ingrese el peso de la persona (en Kg)");
        double peso = leer.nextDouble();
        
        System.out.println("Ingrese la altura de la persona (en metros)");
        Double altura = leer.nextDouble();
        
        return (new Persona(nombre, edad, sexo, peso, altura));
    }
    
    public boolean esMayorDeEdad(Persona individuo) {
        int mayoriaEdad = 18;
        return individuo.getEdad() >= mayoriaEdad;
    }
    
    public int calcularMC(Persona individuo) {
        double pesoIdeal = (individuo.getPeso()/Math.pow(individuo.getAltura(), 2));
        
        if (pesoIdeal < 20) {
            // System.out.println("Se encuentra por debajo del peso ideal");
            return -1;
        } else if (pesoIdeal >= 20 && pesoIdeal <= 25) {
            // System.out.println("Se encuentra en el peso ideal");
            return 0;
        } else if (pesoIdeal > 25) {
            // System.out.println("Tiene sobrepeso");
            return 1;
        } else {
            // System.out.println("ERROR. puso los datos en las unidades especificadas? (Kg y metros");
            return -10;
        }
    }
    
    public void porcentajePeso(int pesos[]) {
        int bajo = 0, bien = 0, alto = 0;
        
        for (int i = 0; i < 4; i++) {
            switch (pesos[i]) {
                case -1:
                    bajo = bajo + 1;
                    continue;
                case 0:
                    bien = bien + 1;
                    continue;
                case 1:
                    alto = alto + 1;
                    continue;
                default:
                    break;
            }
        }
        // lo hago por 25 ya que en regla de tres sería el valor por 100 dividido 4 (y 100/4 es 25)
        bajo = bajo * 25;
        bien = bien * 25;
        alto = alto * 25;
        
        System.out.println("El " + bajo + "% de los individuos está por debajo del peso ideal");
        System.out.println("El " + bien + "% de los individuos está dentro del peso ideal");
        System.out.println("El " + alto + "% de los individuos está por encima del peso ideal");
    }
    
    public void porcentajeEdad(boolean edades[]) {
        int mayor = 0, menor = 0;
        
        for (int i = 0; i < 4; i++) {
            if (edades[i] == true) {
                mayor = mayor + 1;
            } else if (edades[i] == false){
                menor = menor + 1;
            } else {
                System.out.println("ERROR");
            }
        }
        // lo hago por 25 ya que en regla de tres sería el valor por 100 dividido 4 (y 100/4 es 25)
        mayor = mayor * 25;
        menor = menor * 25;
        
        System.out.println("El " + mayor + "% de los individuos es mayor de edad");
        System.out.println("El " + menor + "% de los individuos es menor de edad");
    }
    
}
