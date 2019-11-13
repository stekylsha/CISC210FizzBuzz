package edu.sdccd.mesa.cisc210.fizzbuzz.command;

import edu.sdccd.mesa.cisc210.fizzbuzz.Command;

public class DefaultCommand extends FBCommand {
    public DefaultCommand() {
        super(null, null);
    }

    @Override
    public void execute(int num, boolean handled) {
        if (!handled) {
            System.out.print(".");
        }
    }
}
