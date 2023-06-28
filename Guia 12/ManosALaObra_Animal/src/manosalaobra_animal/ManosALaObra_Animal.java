package manosalaobra_animal;

import Entidades.Animal;
import Entidades.Gato;
import Entidades.Perro;
import java.util.ArrayList;
import java.util.List;


public class ManosALaObra_Animal {

    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        
        List<Animal> animales = new ArrayList<>();
        animales.add(a);
        animales.add(b);
        animales.add(c);
        
        for(Animal elemento : animales) {
            elemento.hacerRuido();
        }
    }

}
