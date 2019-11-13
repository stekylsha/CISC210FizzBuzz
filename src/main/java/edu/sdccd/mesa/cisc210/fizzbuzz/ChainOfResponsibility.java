package edu.sdccd.mesa.cisc210.fizzbuzz;

public class ChainOfResponsibility {
    private Command cmd;

    public ChainOfResponsibility(Command firstCmd) {
        this.cmd = firstCmd;
    }

    public void doFb(int num) {
        cmd.execute(num, false);
        System.out.print(" ");
    }
}
