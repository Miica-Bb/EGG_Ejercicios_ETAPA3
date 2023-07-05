package Servicios;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.BarcoAMotor;
import Entidades.Velero;
import Entidades.Yate;
import java.time.LocalDate;
import java.util.Scanner;

public class AlquilerServicios {
    Scanner leer;

    public AlquilerServicios() {
        leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public Velero crearVelero() {
        Velero barco1 = new Velero();
        
        System.out.print("Ingrese en metros la eslora requerida: ");
        barco1.setEslora(leer.nextInt());
        System.out.print("Ingrese el número de mástiles deseados: ");
        barco1.setNumeroMastiles(leer.nextInt());
        System.out.println("");
        
        return barco1;
    }
    
    public BarcoAMotor crearBarcoAMotor() {
        BarcoAMotor barco2 = new BarcoAMotor();
        
        System.out.print("Ingrese en metros la eslora requerida: ");
        barco2.setEslora(leer.nextInt());
        System.out.print("Ingrese la potencia buscada (en CV): ");
        barco2.setPotenciaCV(leer.nextInt());
        System.out.println("");
        
        return barco2;
    }
    
    public Yate crearYate() {
        Yate barco3 = new Yate();
        
        System.out.print("Ingrese en metros la eslora requerida: ");
        barco3.setEslora(leer.nextInt());
        System.out.print("Ingrese la potencia buscada (en CV): ");
        barco3.setPotenciaCV(leer.nextInt());
        System.out.print("Ingrese en número de camarotes que busca que tenga: ");
        barco3.setNumeroCamarotes(leer.nextInt());
        System.out.println("");
        
        return barco3;
    }
    
    public void calcularAlquiler(Barco barco) {
        Alquiler presupuesto = new Alquiler();
        
        presupuesto.setTipoBarco(barco);
        System.out.print("Ingrese el nombre de quien lo va a alquilar: ");
        presupuesto.setNombreCliente(leer.next());
        System.out.print("Ingrese el DNI: ");
        presupuesto.setDniCliente(leer.next());
        presupuesto.setPosicionAmarre((int) (Math.random() * 10 + 1));
        
        System.out.print("Ingrese la fecha de alquiler (AAAA-MM-DD): ");
        LocalDate fechaAlquiler = LocalDate.parse(leer.next());
        presupuesto.setFechaAlquiler(fechaAlquiler);
        System.out.print("Ingrese la fecha de devolución (AAAA-MM-DD): ");
        LocalDate fechaDevolucion = LocalDate.parse(leer.next());
        presupuesto.setFechaDevolucion(fechaDevolucion);
        
        presupuesto.calcularValorAlquiler();
    }
    
    public void menu() {
        int opcion;
        
        System.out.println("ALQUILER DE BARCOS");
        do {
            System.out.println("Ingrese el tipo de barco que desea: ");
            System.out.println("1. Velero");
            System.out.println("2. Barco a motor");
            System.out.println("3. Yate de lujo");
            opcion = leer.nextInt();

            if (opcion < 1 || opcion > 3) {
                System.out.println("Ingreso incorrecto, ingrese nuevamente");
            }
        } while (opcion < 1 || opcion > 3);
        
        switch (opcion) {
            case 1:
                Velero velero = crearVelero();
                calcularAlquiler(velero);
                break;
            case 2:
                BarcoAMotor aMotor = crearBarcoAMotor();
                calcularAlquiler(aMotor);
                break;
            case 3:
                Yate yate = crearYate();
                calcularAlquiler(yate);
                break;
        }
    }
}
