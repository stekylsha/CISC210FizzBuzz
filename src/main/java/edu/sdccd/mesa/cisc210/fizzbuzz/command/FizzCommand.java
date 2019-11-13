package edu.sdccd.mesa.cisc210.fizzbuzz.command;

import edu.sdccd.mesa.cisc210.fizzbuzz.Command;

public class FizzCommand extends FBCommand {
    private static final int FIZZ_DIVISOR = 3;
    private static final String FIZZ_MSG = "fizz";

    public FizzCommand(Command cmd) {
        super(cmd);
    }

    @Override
    public void execute(int num, boolean handled) {
        if ((num % FIZZ_DIVISOR) == 0) {
            System.out.print(FIZZ_MSG);
            handled = true;
        }
        super.execute(num, handled);
    }
}
