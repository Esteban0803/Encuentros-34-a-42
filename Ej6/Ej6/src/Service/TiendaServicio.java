//Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
//productos que venderemos y el precio que tendrán. Además, se necesita que la
//aplicación cuente con las funciones básicas.

//Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
//Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
//Realizar un menú para lograr todas las acciones previamente mencionadas.
package Service;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private HashMap<String, Double> producto = new HashMap<String, Double>();
    public void crearProducto(){
        System.out.println("Ingresar producto");
        String nombre = leer.next();
        System.out.println("Ingrese el valor");
        Double valor = leer.nextDouble();
        producto.put(nombre, valor);
    }
    public void mostrarProducto(){
        for (Map.Entry<String, Double> entry : producto.entrySet()) {
            String key = entry.getKey();
            Double val = entry.getValue();
            System.out.println(key +": $"+val);
        }
    }
    public void eliminarProducto(){
        System.out.println("Elimine un producto");
        String objeto = leer.next();
        producto.remove(objeto);
    }
    public void modificar(){
        System.out.println("Cual es el producto a modificar?");
        String productoo = leer.next();
        System.out.println("Ingrese el nuevo precio");
        Double precioo = leer.nextDouble();
        producto.put(productoo, precioo);
    }
}
