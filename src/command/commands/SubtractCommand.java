package command.commands;

import command.Sum;

/**
 *
 * @author PeterBoss
 */
public class SubtractCommand implements Command{

    private Sum sum;
    private int input;

    public SubtractCommand(Sum sum, int input) {
        this.sum = sum;
        this.input = input;
    }
    
    @Override
    public void execute() {
        sum.subtract(input);
    }
    
}
