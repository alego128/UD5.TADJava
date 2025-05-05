
package ejercicio5_5;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Alego
 */
public class Main {
    public static void main(String[] args) {
        SortedSet<Persona> personas = new TreeSet<>();
        personas.add(new Persona("Pablo", 30));
        personas.add(new Persona("Ale", 25));
        personas.add(new Persona("Ale", 21));

        for (Persona p : personas) {
            System.out.println(p);
        }
    }
}
