package designpatterns.command;

/**
 *
 * @author PeterBoss
 */
public interface Sum {

    public int getValue();

    public void add(int input);

    public void subtract(int input);

    public void multiply(int input);

    public void divide(int input);
    
}
