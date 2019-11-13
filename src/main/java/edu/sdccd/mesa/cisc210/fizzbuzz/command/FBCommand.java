package edu.sdccd.mesa.cisc210.fizzbuzz.command;

import edu.sdccd.mesa.cisc210.fizzbuzz.Calculator;
import edu.sdccd.mesa.cisc210.fizzbuzz.Command;

public class FBCommand implements Command {
    private Command cmd;
    private Calculator calc;

    protected FBCommand(Command cmd) {
        this.cmd = cmd;
    }

    @Override
    public void execute(int num, boolean handled) {
        if (cmd != null) {
            cmd.execute(num, handled);
        }
    }

    protected boolean calculate(int i, int divisor) {
        return calc.isEvenlyDivisible(i, divisor);
    }
}
