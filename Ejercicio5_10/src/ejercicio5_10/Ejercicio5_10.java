
package ejercicio5_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Alego
 */
public class Ejercicio5_10 {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();
		Collections.addAll(lista,10,20,30,40,50,60,70,80,90,100);

		ListIterator<Integer> li = lista.listIterator();
		while (li.hasNext()) {
			Integer numero = li.next();
			if (numero>50) {
				li.set(numero*2);
			}
			System.out.println("Elemento nº: " + li.nextIndex());
			System.out.println(numero);

		}
		System.out.println("Lista modificada" + lista);

		while (li.hasPrevious()) {
			Integer numero = li.previous();
			if (numero<30) {
				li.add(25);
				if (li.hasPrevious()){ 
					li.previous();
				}
			}
			System.out.println("elemento nº: " + (li.previousIndex()+2));
			System.out.println(numero);
		}
		System.out.println("Lista modificada" + lista);
	}
}