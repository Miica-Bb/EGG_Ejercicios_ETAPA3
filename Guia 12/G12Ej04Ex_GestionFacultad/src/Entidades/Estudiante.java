package Entidades;

public class Estudiante extends Persona{
    private String curso;

    public Estudiante() {
    }
    
    public Estudiante(String curso, String nombre, String apellido, String dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + " Estudiante: " + "curso = " + curso + "\n";
    }

//    @Override
//    public void cambiarEstadoCivil(String nuevoEstadoCivil) {
//        super.cambiarEstadoCivil(nuevoEstadoCivil);
//    }
//    
//    public void matricularseEnCurso (String nuevoCurso) {
//        curso = nuevoCurso;
//    }
}
