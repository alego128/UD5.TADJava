
package ejercicio5_6;

/**
 *
 * @author Alego
 */

public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }

    /*@Override
    public int compareTo(Persona otra) {
        return this.nombre.compareTo(otra.nombre);
    }*/
    
    /*@Override
    public int compareTo(Persona otra) {
        return Integer.compare(this.edad, otra.edad);
    }*/

    @Override
    public int compareTo(Persona otra) {
        int comparaNombre = this.nombre.compareTo(otra.nombre);
        if (comparaNombre != 0) {
            return comparaNombre;
        }
        return Integer.compare(this.edad, otra.edad);
    }
}
