package edu.sdccd.mesa.cisc210.fizzbuzz.command;

import edu.sdccd.mesa.cisc210.fizzbuzz.Command;

public class FBCommand implements Command {
    private Command cmd;

    protected FBCommand(Command cmd) {
        this.cmd = cmd;
    }

    @Override
    public void execute(int num, boolean handled) {
        if (cmd != null) {
            cmd.execute(num, handled);
        }
    }
}
