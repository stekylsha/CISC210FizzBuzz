package edu.sdccd.mesa.cisc210.fizzbuzz.command;

import edu.sdccd.mesa.cisc210.fizzbuzz.ApproveStrategy;
import edu.sdccd.mesa.cisc210.fizzbuzz.Command;

public class FizzCommand extends FBCommand {
    private static final int FIZZ_DIVISOR = 3;
    private static final String FIZZ_MSG = "fizz";

    public FizzCommand(Command cmd, ApproveStrategy approver) {
        super(cmd, approver);
    }

    @Override
    public void execute(int num, boolean handled) {
        if (approve(num, FIZZ_DIVISOR)) {
            System.out.print(FIZZ_MSG);
            handled = true;
        }
        super.execute(num, handled);
    }
}
