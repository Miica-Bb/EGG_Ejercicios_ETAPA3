package Entidades;

public class PersonalServicio extends Empleado{
    private String seccion;

    public PersonalServicio() {
    }

    public PersonalServicio(String seccion, int anioIngreso, int numDespachoAsignado, String nombre, String apellido, String dni, String estadoCivil) {
        super(anioIngreso, numDespachoAsignado, nombre, apellido, dni, estadoCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString() + " Personal de Servicio: " + "seccion = " + seccion + "\n";
    }

//    @Override
//    public void reasignarDespacho(int despacho) {
//        super.reasignarDespacho(despacho);
//    }
//
//    @Override
//    public void cambiarEstadoCivil(String nuevoEstadoCivil) {
//        super.cambiarEstadoCivil(nuevoEstadoCivil);
//    }
//    
//    public void trasladarDeSeccion(String nuevaSeccion) {
//        seccion = nuevaSeccion;
//    }
}
