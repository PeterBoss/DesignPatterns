package decorator;

import java.util.Comparator;

/**
 *
 * @author PeterBoss
 */
public class CountComparator<T> implements Comparator<T> {

    private final Comparator<T> comp;
    private int count;

    public CountComparator(Comparator<T> comp) {
        this.comp = comp;
        this.count = 0;
    }

    @Override
    public int compare(T o1, T o2) {
        count++;
        return comp.compare(o1, o2);
    }

    public int getCount() {
        return count;
    }

    public void resetCount() {
        count = 0;
    }

}
