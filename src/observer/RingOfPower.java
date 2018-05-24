package observer;

import java.util.Observable;

/**
 *
 * @author PeterBoss
 */
public class RingOfPower extends Observable{
    
    private boolean isWorn = false;
    
    public void changeStatus(boolean b) {
        isWorn = b;
        setChanged();
        notifyObservers(isWorn);
    }
    
}
