package edu.sdccd.mesa.cisc210.fizzbuzz.command;

import edu.sdccd.mesa.cisc210.fizzbuzz.Command;

public class BuzzCommand extends FBCommand {
    public BuzzCommand(Command cmd) {
        super(cmd);
    }

    @Override
    public void execute(int num, boolean handled) {
        if ((num % 5) == 0) {
            System.out.print("buzz");
            handled = true;
        }
        super.execute(num, handled);
    }
}
