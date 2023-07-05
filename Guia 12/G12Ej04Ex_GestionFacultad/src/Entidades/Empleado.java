package Entidades;

public abstract class Empleado extends Persona{
    protected int anioIngreso;
    protected int numDespachoAsignado;

    public Empleado() {
    }

    public Empleado(int anioIngreso, int numDespachoAsignado, String nombre, String apellido, String dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.anioIngreso = anioIngreso;
        this.numDespachoAsignado = numDespachoAsignado;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public int getNumDespachoAsignado() {
        return numDespachoAsignado;
    }

    public void setNumDespachoAsignado(int numDespachoAsignado) {
        this.numDespachoAsignado = numDespachoAsignado;
    }

    @Override
    public String toString() {
        return super.toString() + " Empleado: " + "año de ingreso = " + anioIngreso + ", Despacho Asignado = " + numDespachoAsignado + "\n";
    }

//    @Override
//    public void cambiarEstadoCivil(String nuevoEstadoCivil) {
//        super.cambiarEstadoCivil(nuevoEstadoCivil);
//    }
//    
//    public void reasignarDespacho(int despacho) {
//        numDespachoAsignado = despacho;
//    }
}
