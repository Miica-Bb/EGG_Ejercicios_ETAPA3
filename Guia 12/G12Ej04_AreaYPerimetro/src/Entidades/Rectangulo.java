package Entidades;

public class Rectangulo implements calculosFormas{
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        double area = base * altura;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = (base + altura) * 2;
        return perimetro;
    }
    
}
