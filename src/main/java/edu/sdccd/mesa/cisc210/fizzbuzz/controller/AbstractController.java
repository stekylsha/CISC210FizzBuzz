package edu.sdccd.mesa.cisc210.fizzbuzz.controller;

import edu.sdccd.mesa.cisc210.fizzbuzz.ChainOfResponsibility;
import edu.sdccd.mesa.cisc210.fizzbuzz.Controller;

/**
 * Uses the Factory Method pattern to create the Chain of Responsibility
 */
public abstract class AbstractController implements Controller {
    private ChainOfResponsibility cor;

    public AbstractController() {
        init();
    }

    @Override
    public void init() {
        this.cor = createChainOfResponsibility();
    }

    @Override
    public abstract ChainOfResponsibility createChainOfResponsibility();

    @Override
    public void control() {
        for (int i = 1 ; i < 61 ; i++) {
            cor.doFb(i);
        }
        System.out.println();
    }
}
