package edu.sdccd.mesa.cisc210.fizzbuzz.command;

import edu.sdccd.mesa.cisc210.fizzbuzz.Command;

public class FizzCommand extends FBCommand {
    public FizzCommand(Command cmd) {
        super(cmd);
    }

    @Override
    public void execute(int num, boolean handled) {
        if ((num % 3) == 0) {
            System.out.print("fizz");
            handled = true;
        }
        super.execute(num, handled);
    }
}
