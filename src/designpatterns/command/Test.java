package designpatterns.command;

import java.util.Scanner;

/**
 *
 * @author PeterBoss
 */
public class Test {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        InputReader reader = new InputReader(cal);
        Scanner scan = new Scanner(System.in);

        while (true) {
            String str = scan.nextLine();
            reader.read(str);
            System.out.println("Sum: " + cal.getSum().toString());
        }
    }
    
}
