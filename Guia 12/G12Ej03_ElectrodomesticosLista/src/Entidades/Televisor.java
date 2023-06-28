package Entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico {
    private double resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean sintonizadorTDT, double precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public String toString() {
        return "Televisor: " + "resolucion = " + resolucion + ", sintonizadorTDT = " + sintonizadorTDT + ", " + super.toString();
    }
    
    public void crearTelevisor() {
        super.crearElectrodomestico();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Indicar la resolución en pulgadas");
        resolucion = leer.nextDouble();
        System.out.println("¿Tiene sintonizador TDT? (S/N)");
        String respuesta = leer.next();
        
        sintonizadorTDT = respuesta.equalsIgnoreCase("s");
    }

    @Override
    public void precioFinal() {
        double aumentoPrecioPorResolucion = 0;
        double aumentoPrecioPorSintonizador = 0;
        super.precioFinal(); 
        
        if (resolucion > 40) {
            aumentoPrecioPorResolucion = 0.3;
        }
        
        if (sintonizadorTDT) {
            aumentoPrecioPorSintonizador = 500;
        }
        
        precio = (precio + aumentoPrecioPorSintonizador) + (precio + aumentoPrecioPorSintonizador) * aumentoPrecioPorResolucion;
    }
    
    
}
