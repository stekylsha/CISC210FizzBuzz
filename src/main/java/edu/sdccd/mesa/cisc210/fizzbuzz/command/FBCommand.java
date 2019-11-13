package edu.sdccd.mesa.cisc210.fizzbuzz.command;

import edu.sdccd.mesa.cisc210.fizzbuzz.Command;

public abstract class FBCommand implements Command {
    private Command next;

    protected FBCommand(Command next) {
        this.next = next;
    }

    @Override
    public void execute(int num, boolean handled) {
        if (next != null) {
            next.execute(num, handled);
        }
    }
}
