package Entidades;

public class Yate extends Barco{
    private int potenciaCV;
    private int numeroCamarotes;

    public Yate() {
        super.setMatricula("5.BA.7.3.12");
        super.setAnioFabricacion(2011);
    }

    public Yate(int potenciaCV, int numeroCamarotes, String matricula, int eslora, int anioFabricacion) {
        super("5.BA.7.3.12", eslora, 2011             );
        this.potenciaCV = potenciaCV;
        this.numeroCamarotes = numeroCamarotes;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public String toString() {
        return "Yate{" + "potenciaCV=" + potenciaCV + ", numeroCamarotes=" + numeroCamarotes + '}';
    }

    @Override
    public int moduloBarco() {
        int modulo = super.moduloBarco();
        modulo += potenciaCV + numeroCamarotes;
        
        return modulo;
    }
}
