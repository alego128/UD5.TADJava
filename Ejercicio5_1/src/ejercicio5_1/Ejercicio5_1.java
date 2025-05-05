
package ejercicio5_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Alego
 */
public class Ejercicio5_1 {
    public static void main(String[] args) {
		Set <String> nombreLibros = new HashSet<>(); 

		Scanner sc =new Scanner (System.in);
		String nombreLibro = null;
		System.out.println("Agregue algun libro a continuación o escriba salir para terminar");
		nombreLibro = sc.nextLine();
		while (!nombreLibro.equalsIgnoreCase("salir")) { 
			nombreLibros.add(nombreLibro); 
			if (nombreLibros.add(nombreLibro)) {
				System.out.println("Libro añadido");
			}else {
				System.out.println("El libro ya está añadido");
			}
			
			System.out.println("Introduzca otro libro: ");
			nombreLibro = sc.nextLine();
		}

		System.out.println("Lista de libros for-each: ");
		for (String s : nombreLibros) {
			System.out.println(s);
		}

		System.out.println("Lista de libros iterator: ");
		Iterator <String> it = nombreLibros.iterator();
		String s;
		while(it.hasNext()) {
			s=it.next();
			System.out.println(s);
		}
		
		sc.close();
	}
}