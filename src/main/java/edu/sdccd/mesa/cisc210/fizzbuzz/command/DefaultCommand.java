package edu.sdccd.mesa.cisc210.fizzbuzz.command;

import edu.sdccd.mesa.cisc210.fizzbuzz.Command;

public class DefaultCommand extends FBCommand {
    public DefaultCommand(Command cmd) {
        super(cmd);
    }

    @Override
    public void execute(int num, boolean handled) {
        if (!handled) {
            System.out.print(".");
        }
    }
}
