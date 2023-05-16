//Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
//alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
//con sus 3 notas.

//En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
//toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.

//Después de ese bucle tendremos el siguiente método en el servicio de Alumno:

//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.
package ej3;
import Entidad.Alumno;
import Service.AlumnoServicio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AlumnoServicio s1 = new AlumnoServicio();
        List <Alumno> alumno = new ArrayList();
        String respuesta;
        do {
            alumno.add(s1.crearAlumno());
            System.out.println("desea ingresar a otro alumno?");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("si"));
        System.out.println("Sacar la nota final de un alumno:");
        String nombre = leer.next();
        int nota = s1.notaFinal(alumno, nombre);
        if (nota == -1){
            System.out.println("Este alumno no esta en la lista");
        }else{
            System.out.println("La nota del alumno "+nombre+ " es "+nota);
        }
    }
}
