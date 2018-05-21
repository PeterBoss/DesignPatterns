package designpatterns.command.commands;

import designpatterns.command.Sum;

/**
 *
 * @author PeterBoss
 */
public class MultiplyCommand implements Command{

    private Sum sum;
    private int input;

    public MultiplyCommand(Sum sum, int input) {
        this.sum = sum;
        this.input = input;
    }
    
    @Override
    public void execute() {
        sum.multiply(input);
    }
    
}
