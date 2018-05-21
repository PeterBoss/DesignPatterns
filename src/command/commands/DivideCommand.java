package command.commands;

import command.Sum;

/**
 *
 * @author PeterBoss
 */
public class DivideCommand implements Command{

    private Sum sum;
    private int input;

    public DivideCommand(Sum sum, int input) {
        this.sum = sum;
        this.input = input;
    }
    
    @Override
    public void execute() {
        sum.divide(input);
    }
    
}
