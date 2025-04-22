package ejercicio5_3;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio5_3 {
    public static void main(String[] args) {
        
        Set<Integer> conjunto = new TreeSet<>();
        conjunto.add(2);
        conjunto.add(1);
        conjunto.add(4);
       
        System.out.println("Elementos en orden: ");
        for (Integer numero : conjunto) {
            System.out.println(numero);
        }
        
        Iterator<Integer> iterador = conjunto.iterator();
        System.out.println("Elementos en orden (Iterator): ");
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }

        Set<String> alumnos = new TreeSet<>();
        alumnos.add("Carlos");
        alumnos.add("Ale");
        alumnos.add("Adri");
        alumnos.add("Pablo");
       
        System.out.println("Nombres de alumnos en orden (for-each): ");
        for (String alumno : alumnos) {
            System.out.println(alumno);
        }
        
        System.out.println("Nombres de alumnos en orden (Iterator): ");
        Iterator<String> it = alumnos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next()); 
        }
    } 
}
