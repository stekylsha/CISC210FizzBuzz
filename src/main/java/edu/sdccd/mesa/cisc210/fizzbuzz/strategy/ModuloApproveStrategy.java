package edu.sdccd.mesa.cisc210.fizzbuzz.strategy;

import edu.sdccd.mesa.cisc210.fizzbuzz.ApproveStrategy;

public class ModuloApproveStrategy implements ApproveStrategy {
    public boolean approve(int num, int divisor) {
        return (num % divisor) == 0;
    }
}
