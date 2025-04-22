
package ejercicio5_2;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author 1DAW2425-12
 */

public class Ejercicio5_2 {
    public static void main(String[] args) {

        Set<String> alumnos = new LinkedHashSet<>();

        alumnos.add("Carlos");
        alumnos.add("Ale");
        alumnos.add("Pablo");
        alumnos.add("Adri");

        System.out.println("Contenido del LinkedHashSet: " + alumnos);
        
        boolean agregado = alumnos.add("Carlos");
        System.out.println("Se agrego Carlos nuevamente?: " + agregado);

        alumnos.add(null);
        System.out.println("Contenido despues de agregar un null: " + alumnos);

        System.out.println("Elementos en orden de insercion: ");
        for (String alumno : alumnos) {
            System.out.println(alumno);
        }

        System.out.println("Comparación con HashSet: ");
        Set<String> hashSetAlumnos = new java.util.HashSet<>();
        hashSetAlumnos.add("Carlos");
        hashSetAlumnos.add("Ale");
        hashSetAlumnos.add("Pablo");
        hashSetAlumnos.add("Adri");
        hashSetAlumnos.add(null);
        
        System.out.println("Contenido del HashSet: " + hashSetAlumnos);
    }
}