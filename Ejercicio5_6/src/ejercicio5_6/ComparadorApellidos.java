
package ejercicio5_6;

import java.util.Comparator;

/**
 *
 * @author Alego
 */

public class ComparadorApellidos implements Comparator<Persona> {
    
    @Override
    public int compare(Persona p1, Persona p2) {
        String apellido1 = obtenerApellido(p1.getNombre());
        String apellido2 = obtenerApellido(p2.getNombre());
        return apellido1.compareTo(apellido2);
    }

    private String obtenerApellido(String nombreCompleto) {

    }
}
