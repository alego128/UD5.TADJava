
package Ejercicio5_13;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author 1DAW2425-09
 */
public class Ejercicio5_13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un texto:");
        String texto = scanner.nextLine();

        texto = texto.replaceAll("[.,;:!?¡¿\"()\\[\\]{}]", "").toLowerCase();

        String[] palabras = texto.split("\\s+");

        Map<String, Integer> frecuenciaPalabras = new TreeMap<>();

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
            }
        }

        System.out.println("\nFrecuencia de palabras:");
        for (Map.Entry<String, Integer> entrada : frecuenciaPalabras.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}