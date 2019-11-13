package edu.sdccd.mesa.cisc210.fizzbuzz.controller;

import edu.sdccd.mesa.cisc210.fizzbuzz.ApproveStrategy;
import edu.sdccd.mesa.cisc210.fizzbuzz.ChainOfResponsibility;
import edu.sdccd.mesa.cisc210.fizzbuzz.Command;
import edu.sdccd.mesa.cisc210.fizzbuzz.command.BazzCommand;
import edu.sdccd.mesa.cisc210.fizzbuzz.command.BuzzCommand;
import edu.sdccd.mesa.cisc210.fizzbuzz.command.DefaultCommand;
import edu.sdccd.mesa.cisc210.fizzbuzz.command.FizzCommand;
import edu.sdccd.mesa.cisc210.fizzbuzz.strategy.ModuloApproveStrategy;

public class FBBController extends AbstractController {

    @Override
    public ChainOfResponsibility createChainOfResponsibility() {
        ApproveStrategy approver = new ModuloApproveStrategy();
        Command defaultCmd = new DefaultCommand();
        Command buzzCmd = new BuzzCommand(defaultCmd, approver);
        Command bazzCmd = new BazzCommand(buzzCmd, approver);
        Command fizzCmd = new FizzCommand(bazzCmd, approver);
        ChainOfResponsibility cor = new ChainOfResponsibility(fizzCmd);
        return cor;
    }
}
