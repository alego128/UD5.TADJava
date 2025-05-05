
package ejercicio5_7;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import ejercicio5_1.Persona;

/**
 *
 * @author Alego
 */
public class Ejercicio5_7 {


	public static void main(String[] args) {
//		Crear conjunto personas Set y obtener el primer elemento:

		Persona p1 = new Persona ("Pedro", 33);
		Persona p2 = new Persona ("Luis", 31);
		Persona p3 = new Persona ("Antonio", 32);
		Persona p4 = new Persona ("Javi", 32);
		
		
		Set<Persona> personas1 = new TreeSet<>();
		personas1.add(p1);
		personas1.add(p2);
		personas1.add(p3);
		personas1.add(p4);
		
		
		Iterator<Persona> it = personas1.iterator();
			if(it.hasNext()) {
				System.out.println("Primero en el Set: " + it.next());
			}
		
		SortedSet<Persona> personas2 = new TreeSet<>(personas1);
	
		System.out.println("Primero en el SortedSet: " + personas2.first());

		System.out.println("Último en el SortedSet: " + personas2.last());

		System.out.println("Anteriores a Pedro en el SortedSet: " + personas2.headSet(p4));
	}

}