package edu.sdccd.mesa.cisc210.fizzbuzz.command;

import edu.sdccd.mesa.cisc210.fizzbuzz.Command;

public class BuzzCommand extends FBCommand {
    private static final int BUZZ_DIVISOR = 5;
    private static final String BUZZ_MSG = "buzz";

    public BuzzCommand(Command cmd) {
        super(cmd);
    }

    @Override
    public void execute(int num, boolean handled) {
        if ((num % BUZZ_DIVISOR) == 0) {
            System.out.print(BUZZ_MSG);
            handled = true;
        }
        super.execute(num, handled);
    }
}
