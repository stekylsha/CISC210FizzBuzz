package edu.sdccd.mesa.cisc210.fizzbuzz;

import edu.sdccd.mesa.cisc210.fizzbuzz.controller.FBBController;

public class Main {

    public static void main(String... args) {
        Controller controller = new FBBController();
        controller.control();
    }
}
