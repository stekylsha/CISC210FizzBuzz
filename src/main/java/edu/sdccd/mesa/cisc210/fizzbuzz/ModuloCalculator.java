package edu.sdccd.mesa.cisc210.fizzbuzz;

public class ModuloCalculator implements Calculator {
    public boolean isEvenlyDivisible(int num, int divisor) {
        return (num % divisor) == 0;
    }
}
