package Entidades;

public abstract class Hotel extends Alojamiento{
    protected int numHabitaciones;
    protected int numCamas;
    protected int numPisos;
    protected int precioHabitaciones;

    public Hotel() {
    }

    public Hotel(int numHabitaciones, int numCamas, int numPisos, int precioHabitaciones, String nombre, String direccion, String localidad, String encargado) {
        super(nombre, direccion, localidad, encargado);
        this.numHabitaciones = numHabitaciones;
        this.numCamas = numCamas;
        this.numPisos = numPisos;
        this.precioHabitaciones = precioHabitaciones;
    }
    
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public int getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(int precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    @Override
    public String toString() {
        return "Hotel{" + "numHabitaciones=" + numHabitaciones + ", numCamas=" + numCamas + ", numPisos=" + numPisos + ", precioHabitaciones=" + precioHabitaciones + '}';
    }
    
    public abstract int precioHabitacion();
    
}
