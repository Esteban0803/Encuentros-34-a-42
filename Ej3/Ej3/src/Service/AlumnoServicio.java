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
package Service;
import Entidad.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlumnoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Alumno crearAlumno(){
        System.out.println("ingrese el nombre del alumno");
        String nombre= leer.next();
        ArrayList <Integer> notas = new ArrayList();
        for (int i = 0; i < 3; i++) {
            System.out.println("ingrese la nota:"+(i+1));
           int nota= leer.nextInt();
            notas.add(nota);
        }
        Alumno alumnos = new Alumno(nombre,notas);
     return alumnos;       
    }
    public int notaFinal(List<Alumno> listaAlumnos, String nombre){
      for (Alumno alumno : listaAlumnos) {
        if (alumno.getAlumno().equalsIgnoreCase(nombre)) {
            List<Integer> notas = alumno.getNotas();
            int promedio = (notas.get(0) + notas.get(1) + notas.get(2)) / 3;
            return promedio;
        }
    }
    return -1;
    }
}
