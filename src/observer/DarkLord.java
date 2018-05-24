package observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author PeterBoss
 */
public class DarkLord implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if ((boolean) arg) {
            System.out.println("I SEE YOU");
        } else {
            System.out.println("<Ominous rumbling>");
        }
    }

}
