
package comparadorset;

import java.util.*;

/**
 *
 * @author Alego
 */

public class ModificacionSet {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        Random random = new Random();

        while (treeSet.size() < 10) {
            treeSet.add(random.nextInt(100));
        }

        System.out.println("TreeSet inicial: " + treeSet);

        System.out.println("TreeSet despues de la modificacion: " + treeSet);
    }

}
