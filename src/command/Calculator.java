package command;


import command.commands.Command;


/**
 *
 * @author PeterBoss
 */
public class Calculator {

    private Sum sum;
//    private Stack<Command> inputHistory;

    public Calculator() {
        this.sum = new SumImpl();
//        this.inputHistory = new Stack();
    }

    public void execute(Command c) {
        c.execute();
//        inputHistory.add(c);
    }
    
//    public void undo() {
//        Command c = inputHistory.pop();
//        
//        
//        
//    }
    
    public Sum getSum() {
        return sum;
    }

}
