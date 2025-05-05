
package ejercicio5_12;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Alego
 */
public class Ejercicio5_12 {

	public static void main(String[] args) {
            
		Map<String, String> dicProg = new HashMap<>();

		String clave1 = "ent";
		String valor1 = "Número entero";
		String clave2 = "dec";
		String valor2 = "Número decimal";
		String clave3 = "cad";
		String valor3 = "Cadena";
		String clave4 = "log";
		String valor4 = "Lógico";
		String clave5 = "bucle";
		String valor5 = "Estructura repetición";
		
		dicProg.put(clave1, valor1);
		dicProg.put(clave2, valor2);
		dicProg.put(clave3, valor3);
		dicProg.put(clave4, valor4);
		dicProg.put(clave5, valor5);
		System.out.println(dicProg);
		
		String claveRepe = "bucle";
		String claveNueva = "loop";
		String valorRepe = "Estructura repetición";
		dicProg.put(claveRepe, valorRepe);
		dicProg.put(claveNueva, valorRepe);
		
		System.out.println(dicProg);

		dicProg.remove(clave5);
		System.out.println(dicProg);

		dicProg.get("log");

		dicProg.replace("log", "Booleano");
		System.out.println("Valor de log cambiado: ");
		dicProg.get("log");
    }
}