package edu.sdccd.mesa.cisc210.fizzbuzz.controller;

import edu.sdccd.mesa.cisc210.fizzbuzz.ChainOfResponsibility;
import edu.sdccd.mesa.cisc210.fizzbuzz.Command;
import edu.sdccd.mesa.cisc210.fizzbuzz.command.BuzzCommand;
import edu.sdccd.mesa.cisc210.fizzbuzz.command.DefaultCommand;
import edu.sdccd.mesa.cisc210.fizzbuzz.command.FizzCommand;

public class FBController extends AbstractController {

    @Override
    public ChainOfResponsibility createChainOfResponsibility() {
        Command defaultCmd = new DefaultCommand();
        Command buzzCmd = new BuzzCommand(defaultCmd);
        Command fizzCmd = new FizzCommand(buzzCmd);
        ChainOfResponsibility cor = new ChainOfResponsibility(fizzCmd);
        return cor;
    }
}
