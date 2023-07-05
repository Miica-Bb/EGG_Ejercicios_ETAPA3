package Entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {
    private String nombreCliente;
    private String dniCliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private Barco tipoBarco;

    public Alquiler() {
    }

    public Alquiler(String nombreCliente, String dniCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, Barco tipoBarco) {
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.tipoBarco = tipoBarco;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getTipoBarco() {
        return tipoBarco;
    }

    public void setTipoBarco(Barco tipoBarco) {
        this.tipoBarco = tipoBarco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombreCliente=" + nombreCliente + ", dniCliente=" + dniCliente + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posicionAmarre=" + posicionAmarre + ", tipoBarco=" + tipoBarco + '}';
    }
    
    public void calcularValorAlquiler() {
        int diasOcupacion = (int) ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);
        int valorFinal = diasOcupacion * tipoBarco.moduloBarco();
        
        System.out.println("El precio final del alquiler del barco es de $" + valorFinal);
    }
}
