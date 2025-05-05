
package comparadorset;

/**
 *
 * @author Alego
 */
import java.util.*;

public class ComparadorSet {
    public static void main(String[] args) {
        // Crear instancias de cada tipo de Set
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Agregar elementos a cada Set
        String[] elementos = {"Java", "Python", "C++", "JavaScript", "Ruby", "Java"};
        for (String elemento : elementos) {
            hashSet.add(elemento);
            treeSet.add(elemento);
            linkedHashSet.add(elemento);
        }

        // Imprimir cada Set
        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Mostrar elementos con iterador
        System.out.println("\nMostrar elementos con iterador:");
        mostrarElementosConIterador(hashSet);
        mostrarElementosConIterador(treeSet);
        mostrarElementosConIterador(linkedHashSet);

        // Medir tiempo de inserción para cada Set
        medirTiempoInsercion(new HashSet<>());
        medirTiempoInsercion(new TreeSet<>());
        medirTiempoInsercion(new LinkedHashSet<>());
    }

    // Método que usa un iterador para mostrar los elementos de un Set
    private static void mostrarElementosConIterador(Set<String> set) {
        Iterator<String> iterator = set.iterator();
        int contador = 1;
        while (iterator.hasNext()) {
            String elemento = iterator.next();
            System.out.println("Elemento" + contador + ": " + elemento);
            contador++;
        }
    }

    // Método para medir el tiempo de inserción
    private static void medirTiempoInsercion(Set<Integer> set) {
        long inicio = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            set.add(i);
        }
        long fin = System.nanoTime();
        System.out.println("Tiempo de inserción para " + set.getClass().getSimpleName() + ": " + (fin - inicio) + " ns");
    }
}
