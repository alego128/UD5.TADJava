
package ejercicio5_14;

/**
 *
 * @author 1DAW2425-12
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio5_14 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(6);
        numeros.add(3);
        numeros.add(4);
        numeros.add(1);
        numeros.add(9);

        System.out.println("Lista original: " + numeros);

        Collections.shuffle(numeros);
        System.out.println("Lista desordenada: " + numeros);

        Collections.sort(numeros);
        System.out.println("Lista ordenada: " + numeros);
        
        Collections.reverse(numeros);
        System.out.println("Lista ordenada al reves: " + numeros);
        
        int buscar = 7;
        if (numeros.contains(buscar)) {
            int posicion = numeros.indexOf(buscar);
            System.out.println("El numero " + buscar + " esta en la posicion " + posicion);
        } else {
            System.out.println("El numero " + buscar + " no se encuentra en la lista");
        }
        
        
    }
}
