package edu.sdccd.mesa.cisc210.fizzbuzz;

import edu.sdccd.mesa.cisc210.fizzbuzz.command.BuzzCommand;
import edu.sdccd.mesa.cisc210.fizzbuzz.command.DefaultCommand;
import edu.sdccd.mesa.cisc210.fizzbuzz.command.FizzCommand;

public class FBController extends AbstractController {

    @Override
    public ChainOfResponsibility getCoR() {
        Command defaultCmd = new DefaultCommand(null);
        Command buzzCmd = new BuzzCommand(defaultCmd);
        Command fizzCmd = new FizzCommand(buzzCmd);
        ChainOfResponsibility cor = new ChainOfResponsibility(fizzCmd);
        return cor;
    }
}
