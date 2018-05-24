package observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author PeterBoss
 */
public class Demo {

    public static void main(String[] args) {

        RingOfPower thePrecious = new RingOfPower();
        DarkLord eyeOfSauron = new DarkLord();
        
        thePrecious.addObserver(eyeOfSauron);
        
        thePrecious.changeStatus(false);
        thePrecious.changeStatus(true);
        thePrecious.changeStatus(false);
        
    }
}
