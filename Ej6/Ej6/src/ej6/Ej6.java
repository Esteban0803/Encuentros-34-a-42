//Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
//productos que venderemos y el precio que tendrán. Además, se necesita que la
//aplicación cuente con las funciones básicas.

//Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
//Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
//Realizar un menú para lograr todas las acciones previamente mencionadas.
package ej6;
import Service.TiendaServicio;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        TiendaServicio s1 = new TiendaServicio();
        boolean valor = false;
        int opcion =0; 
        do {
            System.out.println("Ingrese:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar todos");
            System.out.println("3. Eliminar Producto");
            System.out.println("4. Modificar Precio");
            System.out.println("5.Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    do {
                        s1.crearProducto();
                        System.out.println("Quiere agregar otro producto?");
                        String var2 = leer.next();
                        if (var2.equalsIgnoreCase("si")) {
                            valor = true;
                        } else {
                            valor = false;
                        }
                    } while (valor);

                    break;
                case 2:
                    System.out.println("--------------------------");
                    s1.mostrarProducto();
                    System.out.println("--------------------------");
                    break;
                case 3:
                    System.out.println("--------------------------");
                    s1.eliminarProducto();
                    System.out.println("--------------------------");
                    break;
                case 4:
                    System.out.println("--------------------------");
                    s1.modificar();
                    System.out.println("--------------------------");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }while (opcion !=5);
        
    } 
}
