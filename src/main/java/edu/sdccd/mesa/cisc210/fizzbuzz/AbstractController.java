package edu.sdccd.mesa.cisc210.fizzbuzz;

/**
 * Uses the Factory Method pattern to create the Chain of Responsibility
 */
public abstract class AbstractController implements Controller {
    private ChainOfResponsibility cor;

    @Override
    public void control() {
        cor = getCoR();
        for (int i = 1 ; i < 42 ; i++) {
            cor.doFb(i);
        }
    }

    @Override
    public abstract ChainOfResponsibility getCoR();
}
