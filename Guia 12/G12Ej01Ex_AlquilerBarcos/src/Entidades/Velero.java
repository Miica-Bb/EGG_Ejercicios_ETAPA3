package Entidades;

public class Velero extends Barco{
    private int numeroMastiles;

    public Velero() {
        super.setAnioFabricacion(1998);
        super.setMatricula("3.BA.5.8.99");
    }
    
    public Velero(int numeroMastiles, String matricula, int eslora, int anioFabricacion) {
        super("3.BA.5.8.99", eslora, 1998);
        this.numeroMastiles = numeroMastiles;
    }    

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "numeroMastiles=" + numeroMastiles + '}';
    }

    @Override
    public int moduloBarco() {
        int modulo = super.moduloBarco();
        modulo += numeroMastiles;
        
        return modulo;
    }
}
