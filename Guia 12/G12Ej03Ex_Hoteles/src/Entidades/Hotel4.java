package Entidades;

import Enumeraciones.Gimnasio;

public class Hotel4 extends Hotel{
    protected String nombreRestaurante;
    protected int capacidadRestaurante;
    protected Gimnasio tipoGym;

    public Hotel4() {
    }

    public Hotel4(String nombreRestaurante, int capacidadRestaurante, Gimnasio tipoGym, int numHabitaciones, int numCamas, int numPisos, int precioHabitaciones, String nombre, String direccion, String localidad, String encargado) {
        super(numHabitaciones, numCamas, numPisos, precioHabitaciones, nombre, direccion, localidad, encargado);
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
        this.tipoGym = tipoGym;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public Gimnasio getTipoGym() {
        return tipoGym;
    }

    public void setTipoGym(Gimnasio tipoGym) {
        this.tipoGym = tipoGym;
    }

    @Override
    public String toString() {
        return "Hotel4{" + "nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante=" + capacidadRestaurante + ", tipoGym=" + tipoGym + '}';
    }

    @Override
    public int precioHabitacion() {
        int plusRestaurante = 0;
        int plusGym = 0;
        int precioFinal = 0;
        
        if (capacidadRestaurante < 30) {
            plusRestaurante = 10;
        } else if (capacidadRestaurante >= 30 && capacidadRestaurante <= 50) {
            plusRestaurante = 30;
        } else if (capacidadRestaurante > 50) {
            plusRestaurante = 50;
        }
        
        if (tipoGym == Gimnasio.A) {
            plusGym = 50;
        } else if (tipoGym == Gimnasio.B) {
            plusGym = 30;
        }
        
        precioFinal = 50 + (1*numHabitaciones) + plusRestaurante + plusGym;
        
        return precioFinal;
    }
    
    
}
