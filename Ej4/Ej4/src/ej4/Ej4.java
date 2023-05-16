//Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
//tendremos una clase Pelicula con el título, director y duración de la película (en horas).
//Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
//que se pide a continuación:

//En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
//todos sus datos y guardándolos en el objeto Pelicula.
//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
//crear otra Pelicula o no.
//Después de ese bucle realizaremos las siguientes acciones:

//• Mostrar en pantalla todas las películas.
//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.
//• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
//pantalla.
//• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
package ej4;

import Comparator.Comparadores;
import Entidad.Pelicula;
import Service.PeliServicio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PeliServicio s1 = new PeliServicio();
        ArrayList <Pelicula> pelicula = new ArrayList();
        String respuesta;
        do {
            pelicula.add(s1.crearPelicula());
            System.out.println("Quiere ingresar otra pelicula?");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("si"));
         System.out.println("--------------------------------");
        System.out.println("Ordenado por Duracion (Menor a Mayor)");
        Collections.sort(pelicula, Comparadores.ordenarDuracionDesc);
        s1.mostrarPelicula(pelicula);
        System.out.println("-----");
        System.out.println("Ordenado por Duracion (Mayor a menor)");
        Collections.reverse(pelicula);
        s1.mostrarPelicula(pelicula);
        System.out.println("--------------------------------");
        System.out.println("Ordenado por Titulo");
        s1.mostrarPelicula(pelicula);
        System.out.println("--------------------------------");
        System.out.println("Ordenado por Director");
        s1.mostrarPelicula(pelicula);
    }
}
