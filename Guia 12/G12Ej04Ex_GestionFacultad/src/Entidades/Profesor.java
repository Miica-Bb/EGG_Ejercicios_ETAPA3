package Entidades;

public class Profesor extends Empleado{
    private String departamento;

    public Profesor() {
    }

    public Profesor(String departamento, int anioIngreso, int numDespachoAsignado, String nombre, String apellido, String dni, String estadoCivil) {
        super(anioIngreso, numDespachoAsignado, nombre, apellido, dni, estadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + " Profesor: " + "departamento = " + departamento + "\n";
    }

//    @Override
//    public void cambiarEstadoCivil(String nuevoEstadoCivil) {
//        super.cambiarEstadoCivil(nuevoEstadoCivil);
//    }
//
//    @Override
//    public void reasignarDespacho(int despacho) {
//        super.reasignarDespacho(despacho);
//    }
//    
//    public void cambiarDepartamento(String nuevoDepartamento) {
//        departamento = nuevoDepartamento;
//    }
}
