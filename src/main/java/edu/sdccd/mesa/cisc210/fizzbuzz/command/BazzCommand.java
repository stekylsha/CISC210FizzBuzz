package edu.sdccd.mesa.cisc210.fizzbuzz.command;

import edu.sdccd.mesa.cisc210.fizzbuzz.ApproveStrategy;
import edu.sdccd.mesa.cisc210.fizzbuzz.Command;

public class BazzCommand extends FBCommand {
    private static final int BAZZ_DIVISOR = 4;
    private static final String BAZZ_MSG = "bazz";

    public BazzCommand(Command cmd, ApproveStrategy approver) {
        super(cmd, approver);
    }

    @Override
    public void execute(int num, boolean handled) {
        if (approve(num, BAZZ_DIVISOR)) {
            System.out.print(BAZZ_MSG);
            handled = true;
        }
        super.execute(num, handled);
    }
}
