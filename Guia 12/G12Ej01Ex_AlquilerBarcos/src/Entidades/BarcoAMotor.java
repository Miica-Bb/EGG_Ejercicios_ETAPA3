package Entidades;

public class BarcoAMotor extends Barco{
    private int potenciaCV;

    public BarcoAMotor() {
        super.setAnioFabricacion(2006);
        super.setMatricula("1.BA.5.32.06");
    }
    

    public BarcoAMotor(int potenciaCV, String matricula, int eslora, int anioFabricacion) {
        super("1.BA.5.32.06", eslora, 2006);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return "BarcoAMotor{" + "potenciaCV=" + potenciaCV + '}';
    }

    @Override
    public int moduloBarco() {
        int modulo = super.moduloBarco();
        modulo += potenciaCV;
        
        return modulo;
    }
}
