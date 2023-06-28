package g12ej01_animales;
import Entidades.Animal;
import Entidades.Perro;
import Entidades.Gato;
import Entidades.Caballo;

public class G12Ej01_Animales {

    public static void main(String[] args) {
        Animal perro1 = new Perro("Stitch", "Carne", 15, "Doberman");
        perro1.decirAlimentacion();
        
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.decirAlimentacion();
        
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
        gato1.decirAlimentacion();
        
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.decirAlimentacion();
    }

}
