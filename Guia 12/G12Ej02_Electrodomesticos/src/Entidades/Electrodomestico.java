package Entidades;

import java.util.Scanner;

public abstract class Electrodomestico {
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "precio = $" + precio + ", color = " + color + ", consumo Energetico = " + consumoEnergetico + ", peso = " + peso + "Kg";
    }
    
    private void comprobarConsumoEnergetico(char letra) {
        final char[] POSIBLE_CONSUMO_ENERGETICO = {'A', 'B', 'C', 'D', 'E', 'F'};
        boolean caracterCorrecto = false;
        
        for(char aux : POSIBLE_CONSUMO_ENERGETICO) {
            if(aux == letra) {
                caracterCorrecto = true;
                break;
            }
        }
        
        if (caracterCorrecto) {
            consumoEnergetico = letra;
        } else {
            consumoEnergetico = 'F';
        }
    }
    
    private void comprobarColor(String color) {
        final String[] COLORES_POSIBLES = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean colorCorrecto = false;
        
        for(String aux : COLORES_POSIBLES) {
            if(aux.equalsIgnoreCase(color)) {
                colorCorrecto = true;
                break;
            }
        }
        
        if(colorCorrecto) {
            this.color = color;
        } else {
            this.color = "blanco";
        }
    }
    
    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        final double PRECIO_BASE = 1000;
        precio = PRECIO_BASE;
        
        System.out.println("Ingrese el color del electrodoméstico");
        String colorIngresado = leer.next();
        System.out.println("Ingrese el consumo energético del electrodoméstico (A, B, C, D, E, F)");
        String consumoIngresado = leer.next().toUpperCase();
        char consumo = consumoIngresado.charAt(0);
        System.out.println("Ingrese el peso del electrodoméstico");
        int pesoIngresado = leer.nextInt();
        peso = pesoIngresado;
        
        comprobarColor(colorIngresado);
        comprobarConsumoEnergetico(consumo);
    }
    
    public void precioFinal() {
        double aumentoPorConsumoEnergetico = 0;
        double aumentoPorPeso = 0;
        double precioFinal = 0;
        
        switch (consumoEnergetico) {
            case 'A':
                aumentoPorConsumoEnergetico = 1000;
                break;
            case 'B':
                aumentoPorConsumoEnergetico = 800;
                break;
            case 'C':
                aumentoPorConsumoEnergetico = 600;
                break;
            case 'D':
                aumentoPorConsumoEnergetico = 500;
                break;
            case 'E':
                aumentoPorConsumoEnergetico = 300;
                break;
            case 'F':
                aumentoPorConsumoEnergetico = 100;
                break;
        }
        
        if ((peso >= 1) && (peso <= 19)) {
            aumentoPorPeso = 100;
        } else if ((peso >= 20) && (peso <= 49)) {
            aumentoPorPeso = 500;
        } else if ((peso >= 50) && (peso <= 79)) {
            aumentoPorPeso = 800; 
        } else if (peso >= 80) {
            aumentoPorPeso = 1000;
        }
        
        precioFinal = precio + aumentoPorConsumoEnergetico + aumentoPorPeso;
        precio = precioFinal;
    }
}
