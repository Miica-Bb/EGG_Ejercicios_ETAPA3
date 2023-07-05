package Entidades;

public abstract class Extrahotel extends Alojamiento{
    protected boolean esPrivado;
    protected int superficieM2;

    public Extrahotel() {
    }

    public Extrahotel(boolean esPrivado, int superficieM2, String nombre, String direccion, String localidad, String encargado) {
        super(nombre, direccion, localidad, encargado);
        this.esPrivado = esPrivado;
        this.superficieM2 = superficieM2;
    }

    public boolean isEsPrivado() {
        return esPrivado;
    }

    public void setEsPrivado(boolean esPrivado) {
        this.esPrivado = esPrivado;
    }

    public int getSuperficieM2() {
        return superficieM2;
    }

    public void setSuperficieM2(int superficieM2) {
        this.superficieM2 = superficieM2;
    }

    @Override
    public String toString() {
        return "Extrahotel{" + "esPrivado=" + esPrivado + ", superficieM2=" + superficieM2 + '}';
    }
    
    
}
