package edu.sdccd.mesa.cisc210.fizzbuzz.controller;

import edu.sdccd.mesa.cisc210.fizzbuzz.ChainOfResponsibility;
import edu.sdccd.mesa.cisc210.fizzbuzz.Command;
import edu.sdccd.mesa.cisc210.fizzbuzz.command.BazzCommand;
import edu.sdccd.mesa.cisc210.fizzbuzz.command.BuzzCommand;
import edu.sdccd.mesa.cisc210.fizzbuzz.command.DefaultCommand;
import edu.sdccd.mesa.cisc210.fizzbuzz.command.FizzCommand;

public class FBController extends AbstractController {

    @Override
    public ChainOfResponsibility getCoR() {
        Command defaultCmd = new DefaultCommand(null);
        Command buzzCmd = new BuzzCommand(defaultCmd);
        Command bazzCmd = new BazzCommand(buzzCmd);
        Command fizzCmd = new FizzCommand(bazzCmd);
        ChainOfResponsibility cor = new ChainOfResponsibility(fizzCmd);
        return cor;
    }
}
