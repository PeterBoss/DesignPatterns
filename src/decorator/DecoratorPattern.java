package decorator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author PeterBoss
 */
public class DecoratorPattern {

    public static void main(String[] args) {
        Random rand = new Random();
        CountComparator<Integer> comp = new CountComparator(Comparator.naturalOrder());
        ArrayList<Integer> list = new ArrayList();

        for (int i = 0; i < 100; i++) {
            list.add(rand.nextInt(100) + 1);
        }
            
        list.sort(comp);
        
        System.out.println(comp.getCount() + " comparisons");

    }

}
