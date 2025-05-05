package Ejercicio5_11;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5_11 {

	public static void main(String[] args) {

		List<String> colaTareas = new LinkedList();
		String tarea1 = "Lavar los platos";
		String tarea2 = "Hacer la compra";
		String tarea3 = "Estudiar Java";
		String tarea4 = "Ir al gimnasio";
		String tarea5 = "Leer un libro";

		colaTareas.addLast(tarea1);
		colaTareas.addLast(tarea2);
		colaTareas.addLast(tarea3);
		colaTareas.addLast(tarea4);
		colaTareas.addLast(tarea5);

		mostrarTareas(colaTareas);

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una nueva tarea: ");
		String tareaUsuario = sc.nextLine();
		colaTareas.addLast(tareaUsuario);

		mostrarTareas(colaTareas);

		colaTareas.removeFirst();
		System.out.println("La tarea [" + tarea1 + "] ha sido completada");

		System.out.println("Proxima tarea: " + colaTareas.getFirst());

		System.out.println("Introduce una nueva tarea urgente: ");
		String tareaUrgente = sc.nextLine();
		colaTareas.addFirst(tareaUrgente);

		mostrarTareas(colaTareas);
		
		sc.close();
	}

	public static void mostrarTareas(List<String> lista) {
		for (String s : lista) {
			System.out.println(s);
		}
	}
}