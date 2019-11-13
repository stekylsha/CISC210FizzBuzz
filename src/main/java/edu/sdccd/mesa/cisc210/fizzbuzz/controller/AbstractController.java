package edu.sdccd.mesa.cisc210.fizzbuzz.controller;

import edu.sdccd.mesa.cisc210.fizzbuzz.ChainOfResponsibility;
import edu.sdccd.mesa.cisc210.fizzbuzz.Controller;

/**
 * Uses the Factory Method pattern to create the Chain of Responsibility
 */
public abstract class AbstractController implements Controller {
    private ChainOfResponsibility cor;

    @Override
    public void control() {
        cor = getCoR();
        for (int i = 1 ; i < 61 ; i++) {
            cor.doFb(i);
        }
        System.out.println();
    }

    @Override
    public abstract ChainOfResponsibility getCoR();
}
