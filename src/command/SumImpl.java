package command;

/**
 *
 * @author PeterBoss
 */
public class SumImpl implements Sum{
    
    private int sum;

    public SumImpl() {
        this.sum = 0;
    }
    
    @Override
    public int getValue() {
        return sum;
    }

    @Override
    public void add(int input) {
        sum += input;
    }

    @Override
    public void subtract(int input) {
        sum -= input;
    }

    @Override
    public void multiply(int input) {
        sum *= input;
    }

    @Override
    public void divide(int input) {
        sum /= input;
    }

    @Override
    public String toString() {
        return String.valueOf(sum);
    }
    
    
    
}
