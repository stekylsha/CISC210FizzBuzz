package edu.sdccd.mesa.cisc210.fizzbuzz;

import edu.sdccd.mesa.cisc210.fizzbuzz.controller.FBController;

public class Main {

    public static void main(String... args) {
        Controller controller = new FBController();
        controller.control();
    }
}
