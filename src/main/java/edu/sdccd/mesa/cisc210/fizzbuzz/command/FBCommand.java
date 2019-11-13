package edu.sdccd.mesa.cisc210.fizzbuzz.command;

import edu.sdccd.mesa.cisc210.fizzbuzz.ApproveStrategy;
import edu.sdccd.mesa.cisc210.fizzbuzz.Command;

public abstract class FBCommand implements Command {
    private Command next;
    private ApproveStrategy approver;

    protected FBCommand(Command next, ApproveStrategy approver) {
        this.next = next;
        this.approver = approver;
    }

    @Override
    public void execute(int num, boolean handled) {
        if (next != null) {
            next.execute(num, handled);
        }
    }

    protected boolean approve(int i, int divisor) {
        return approver.approve(i, divisor);
    }
}
