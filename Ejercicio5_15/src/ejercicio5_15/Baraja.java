
package ejercicio5_15;

/**
 *
 * @author 1DAW2425-12
 */

import java.util.*;

public class Baraja {

    public static void main(String[] args) {
        List<Carta> baraja = new ArrayList<>();

        for (Carta.Palo palo : Carta.Palo.values()) {
            for (int valor = 1; valor <= 13; valor++) {
                baraja.add(new Carta(palo, valor));
            }
        }

        Collections.shuffle(baraja);

        List<Carta> mano = new ArrayList<>(baraja.subList(0, 5));
        for (Carta carta : mano) {
            System.out.println(carta);
        }

        mano.sort(Comparator
            .comparingInt(Carta::getValor)
            .thenComparing(c -> c.getPalo().ordinal()));

        System.out.println("Mano ordenada: ");
        for (Carta carta : mano) {
            System.out.println(carta);
        }
    }
}