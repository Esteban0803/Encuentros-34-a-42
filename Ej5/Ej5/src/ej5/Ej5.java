//Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
//usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
//conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
//si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
//los servicios en la clase correspondiente)

//Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
//cómo se ordena un conjunto.

//Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
//buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
//usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará al usuario.
package ej5;
import Entidad.Pais;
import Service.PaisServicio;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PaisServicio p1 = new PaisServicio();
        String respuesta;
        ArrayList<Pais> pais = new ArrayList();
        do {
            pais.add(p1.crearPais());
            System.out.println("Quiere ingresar otro pais?");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("si"));
        for (Pais pai : pais) {
            System.out.println(pai.getPais());
        }
        System.out.println("-----------------------------");
        System.out.println("Introduce al pais que quieras bombardear");
        String bombardear = leer.next();
        Iterator<Pais> it = pais.iterator();
        boolean encontrado = false;
        while (it.hasNext()) {
            Pais paiss = it.next();
            if (paiss.getPais().equals(bombardear)) {
                it.remove();
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("El pais: " + bombardear + ", fue bombardeado");
        } else {
            System.out.println("El pais: " + bombardear + ", no esta en la lista");
        }
        System.out.println("--------------------------------");
        System.out.println("Paises restantes:");
        for (Pais pai : pais) {
            System.out.println(pai.getPais());
        }
    }
}
