package edu.sdccd.mesa.cisc210.fizzbuzz;

public interface Controller {
    void init();

    ChainOfResponsibility createChainOfResponsibility();

    void control();
}
