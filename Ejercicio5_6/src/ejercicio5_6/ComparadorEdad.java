
package ejercicio5_6;

import java.util.Comparator;

/**
 *
 * @author Alego
 */

public class ComparadorEdad implements Comparator<Persona> {
    
   @Override
    public int compare(Persona p1, Persona p2) {
        return Integer.compare(p1.getEdad(), p2.getEdad());
    }

}

