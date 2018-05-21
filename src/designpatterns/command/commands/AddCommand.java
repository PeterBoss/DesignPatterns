package designpatterns.command.commands;

import designpatterns.command.Sum;

/**
 *
 * @author PeterBoss
 */
public class AddCommand implements Command{

    private Sum sum;
    private int input;

    public AddCommand(Sum sum, int input) {
        this.sum = sum;
        this.input = input;
    }
    
    @Override
    public void execute() {
        sum.add(input);
    }
    
}
