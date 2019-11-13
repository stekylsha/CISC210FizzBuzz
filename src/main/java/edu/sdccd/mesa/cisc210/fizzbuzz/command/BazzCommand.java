package edu.sdccd.mesa.cisc210.fizzbuzz.command;

import edu.sdccd.mesa.cisc210.fizzbuzz.Command;

public class BazzCommand extends FBCommand {
    public BazzCommand(Command cmd) {
        super(cmd);
    }

    @Override
    public void execute(int num, boolean handled) {
        if ((num % 4) == 0) {
            System.out.print("bazz");
            handled = true;
        }
        super.execute(num, handled);
    }
}
