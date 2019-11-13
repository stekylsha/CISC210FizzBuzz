package edu.sdccd.mesa.cisc210.fizzbuzz.command;

import edu.sdccd.mesa.cisc210.fizzbuzz.Command;

public class BazzCommand extends FBCommand {
    private static final int BAZZ_DIVISOR = 4;
    private static final String BAZZ_MSG = "bazz";

    public BazzCommand(Command cmd) {
        super(cmd);
    }

    @Override
    public void execute(int num, boolean handled) {
        if ((num % BAZZ_DIVISOR) == 0) {
            System.out.print(BAZZ_MSG);
            handled = true;
        }
        super.execute(num, handled);
    }
}
