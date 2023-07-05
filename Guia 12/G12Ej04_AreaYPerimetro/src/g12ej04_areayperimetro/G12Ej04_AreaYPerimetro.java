package g12ej04_areayperimetro;

import Entidades.Circulo;
import Entidades.Rectangulo;

public class G12Ej04_AreaYPerimetro {

    public static void main(String[] args) {
        Circulo circ = new Circulo(15, 6.3);
        Rectangulo rect = new Rectangulo(5, 10);
        
        System.out.println("El área del círculo es: " + circ.calcularArea());
        System.out.println("El perímetro del círculo es: " + circ.calcularPerimetro());
        System.out.println("El área del rectángulo es: " + rect.calcularArea());
        System.out.println("El perímetro del rectángulo es: " + rect.calcularPerimetro());
    }

}
