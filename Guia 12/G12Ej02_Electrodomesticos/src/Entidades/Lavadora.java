package Entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora: " + "carga = " + carga + "Kg, " + super.toString();
    }
    
    
    public void crearLavadora() {
        super.crearElectrodomestico();
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar carga del electrodoméstico");
        carga = leer.nextInt();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        
        if (carga > 30) {
            precio = precio + 500;
        }
    }
}
