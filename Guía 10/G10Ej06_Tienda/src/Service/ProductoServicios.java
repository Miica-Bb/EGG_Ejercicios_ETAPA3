package Service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ProductoServicios {
    Scanner leer;

    public ProductoServicios() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public HashMap<String, Double> crearMapaProductos() {
        HashMap<String, Double> productos = new HashMap();
        
        return productos;
    }
    
    public void agregarProducto(HashMap<String, Double> productos) {
        System.out.println("__________________________________");
        String respuesta = "";
        String nombre = "";
        Double precio = 0.0;
        
        do {
            System.out.println("¿Agregar nuevo producto? (S/N)");
            respuesta = leer.next();
            while ((!"S".equalsIgnoreCase(respuesta)) && (!"N".equalsIgnoreCase(respuesta))) {
                System.out.println("ingreso incorrecto, intente nuevamente (S para si, N para no)");
                respuesta = leer.next();
            }
            
            if (respuesta.equalsIgnoreCase("S")) {
                System.out.println("Ingrese el nombre del producto");
                nombre = leer.next();
                System.out.println("Ingrese el precio del producto");
                precio = leer.nextDouble();
                
                productos.put(nombre, precio);
            }
            
            System.out.println("__________________________________");
        } while (respuesta.equalsIgnoreCase("S"));
    }
    
    public void modificarPrecio(HashMap<String, Double> productos) {
        System.out.println("__________________________________");
        System.out.println("Ingrese el nombre del producto cuyo precio quiere modificar");
        String modificar = leer.next();
        int aux = productos.size();
        
        for(Map.Entry<String, Double> entry : productos.entrySet()) {
            if (modificar.equalsIgnoreCase(entry.getKey())) {
                System.out.println("Ingrese el nuevo precio:");
                entry.setValue(leer.nextDouble());
                System.out.println("precio modificado exitosamente");
                System.out.println("__________________________________");
                break;
            } else {
                aux--;
            }
        }
        
        if (aux != productos.size()) {
            System.out.println("El producto no se encontraba en el conjunto");
            System.out.println("__________________________________");
        }
    }
    
    public void eliminarProducto(HashMap<String, Double> productos) {
        System.out.println("__________________________________");
        System.out.println("Ingrese el nombre del producto a eliminar:");
        String eliminar = leer.next();
        int aux = productos.size();
        Iterator<Map.Entry<String, Double>> entries = productos.entrySet().iterator();
        
        while (entries.hasNext()) {
            if (eliminar.equalsIgnoreCase(entries.next().getKey())) {
                entries.remove();
                System.out.println("Producto eliminado exitosamente");
                System.out.println("__________________________________");
                break;
            }
        }
        
        if (aux == productos.size()) {
            System.out.println("El producto no se encontraba en el conjunto");
            System.out.println("__________________________________");
        }
    }
    
    public void mostrarProductos(HashMap<String, Double> productos) {
        System.out.println("__________________________________");
        System.out.println("Productos ingresados en el sistema:");
        
        for(Map.Entry<String, Double> entry : productos.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }
        System.out.println("__________________________________");
    }
    
    public void menu(HashMap<String, Double> productos) {
        int opcion = 0;
        
        do {
            System.out.println("<PRODUCTOS EN LA TIENDA>");
            System.out.println("1. agregar producto");
            System.out.println("2. modificar precio de un producto");
            System.out.println("3. eliminar un producto");
            System.out.println("4. mostrar todos los productos");
            System.out.println("5. salir");
            opcion = leer.nextInt();
            
            switch(opcion) {
                case 1:
                    agregarProducto(productos);
                    continue;
                case 2:
                    modificarPrecio(productos);
                    continue;
                case 3:
                    eliminarProducto(productos);
                    continue;
                case 4:
                    mostrarProductos(productos);
                    continue;
                default:
                    System.out.println("programa finalizado");
            }
        } while ((opcion > 0) && (opcion < 5));
    } 
}
