
package ejercicio5_15;

/**
 *
 * @author 1DAW2425-12
 */

public class Carta {
    enum Palo { CORAZONES, DIAMANTES, TREBOLES, PICAS }
    private Palo palo;
    private int valor; 

    public Carta(Palo palo, int valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public Palo getPalo() {
        return palo;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        String[] nombres = { "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
        return nombres[valor - 1] + " de " + palo.toString().toLowerCase();
    }
}
