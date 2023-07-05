package Entidades;

public class Camping extends Extrahotel{
    protected int maxNumCarpas;
    protected int numBanios;
    protected boolean tieneRestaurante;

    public Camping() {
    }

    public Camping(int maxNumCarpas, int numBanios, boolean tieneRestaurante, boolean esPrivado, int superficieM2, String nombre, String direccion, String localidad, String encargado) {
        super(esPrivado, superficieM2, nombre, direccion, localidad, encargado);
        this.maxNumCarpas = maxNumCarpas;
        this.numBanios = numBanios;
        this.tieneRestaurante = tieneRestaurante;
    }

    public int getMaxNumCarpas() {
        return maxNumCarpas;
    }

    public void setMaxNumCarpas(int maxNumCarpas) {
        this.maxNumCarpas = maxNumCarpas;
    }

    public int getNumBanios() {
        return numBanios;
    }

    public void setNumBanios(int numBanios) {
        this.numBanios = numBanios;
    }

    public boolean isTieneRestaurante() {
        return tieneRestaurante;
    }

    public void setTieneRestaurante(boolean tieneRestaurante) {
        this.tieneRestaurante = tieneRestaurante;
    }

    @Override
    public String toString() {
        return "Camping{" + "maxNumCarpas=" + maxNumCarpas + ", numBanios=" + numBanios + ", tieneRestaurante=" + tieneRestaurante + '}';
    }
}
