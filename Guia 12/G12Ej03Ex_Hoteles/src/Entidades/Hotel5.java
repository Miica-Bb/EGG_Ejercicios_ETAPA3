package Entidades;

import Enumeraciones.Gimnasio;

public class Hotel5 extends Hotel4{
    protected int numSalonesConferencia;
    protected int numSuites;
    protected int numLimosinas;

    public Hotel5() {
    }

    public Hotel5(int numSalonesConferencia, int numSuites, int numLimosinas, String nombreRestaurante, int capacidadRestaurante, Gimnasio tipoGym, int numHabitaciones, int numCamas, int numPisos, int precioHabitaciones, String nombre, String direccion, String localidad, String encargado) {
        super(nombreRestaurante, capacidadRestaurante, tipoGym, numHabitaciones, numCamas, numPisos, precioHabitaciones, nombre, direccion, localidad, encargado);
        this.numSalonesConferencia = numSalonesConferencia;
        this.numSuites = numSuites;
        this.numLimosinas = numLimosinas;
    }

    public int getNumSalonesConferencia() {
        return numSalonesConferencia;
    }

    public void setNumSalonesConferencia(int numSalonesConferencia) {
        this.numSalonesConferencia = numSalonesConferencia;
    }

    public int getNumSuites() {
        return numSuites;
    }

    public void setNumSuites(int numSuites) {
        this.numSuites = numSuites;
    }

    public int getNumLimosinas() {
        return numLimosinas;
    }

    public void setNumLimosinas(int numLimosinas) {
        this.numLimosinas = numLimosinas;
    }

    @Override
    public String toString() {
        return "Hotel5{" + "numSalonesConferencia=" + numSalonesConferencia + ", numSuites=" + numSuites + ", numLimosinas=" + numLimosinas + '}';
    }

    @Override
    public int precioHabitacion() {
        int precioFinal = super.precioHabitacion();
        int plusLimosinas = 15*numLimosinas;
        
        precioFinal += plusLimosinas;
        
        return precioFinal;
    }
    
    
}
