package Entidades;

public class Residencia extends Extrahotel{
    protected int numHabitaciones;
    protected boolean haceDescuentoGremio;
    protected boolean tieneCampoDeportivo;

    public Residencia() {
    }

    public Residencia(int numHabitaciones, boolean haceDescuentoGremio, boolean tieneCampoDeportivo, boolean esPrivado, int superficieM2, String nombre, String direccion, String localidad, String encargado) {
        super(esPrivado, superficieM2, nombre, direccion, localidad, encargado);
        this.numHabitaciones = numHabitaciones;
        this.haceDescuentoGremio = haceDescuentoGremio;
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public boolean isHaceDescuentoGremio() {
        return haceDescuentoGremio;
    }

    public void setHaceDescuentoGremio(boolean haceDescuentoGremio) {
        this.haceDescuentoGremio = haceDescuentoGremio;
    }

    public boolean isTieneCampoDeportivo() {
        return tieneCampoDeportivo;
    }

    public void setTieneCampoDeportivo(boolean tieneCampoDeportivo) {
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" + "numHabitaciones=" + numHabitaciones + ", haceDescuentoGremio=" + haceDescuentoGremio + ", tieneCampoDeportivo=" + tieneCampoDeportivo + '}';
    }
}
