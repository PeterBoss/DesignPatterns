package designpatterns.command;

import designpatterns.command.commands.SubtractCommand;
import designpatterns.command.commands.MultiplyCommand;
import designpatterns.command.commands.DivideCommand;
import designpatterns.command.commands.AddCommand;

/**
 *
 * @author PeterBoss
 */
public class InputReader {

    private Calculator cal;

    public InputReader(Calculator cal) {
        this.cal = cal;
    }

    public void read(String str) {
        
        Sum sum = cal.getSum();
        
        String[] words = str.split(" ");
        int val = Integer.valueOf(words[1]);
        switch (words[0]) {
            case "add":
                cal.execute(new AddCommand(sum, val));
                break;
            case "sub":
                cal.execute(new SubtractCommand(sum, val));
                break;
            case "times":
                cal.execute(new MultiplyCommand(sum, val));
                break;
            case "div":
                cal.execute(new DivideCommand(sum, val));
                break;
//            case "undo":
//                cal.undo();
//                break;
//            case "redo":
//                cal.redo();
//                break;
            default:
                throw new RuntimeException("You broke it :<");
        }
    }

}
