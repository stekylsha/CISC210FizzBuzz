package edu.sdccd.mesa.cisc210.fizzbuzz;

/**
 * Cool simplistic version of fizzbuzz.
 */
public class FizzBuzz {

    public void doFb(int i) {
        String fb = "";
        if ((i % 3) == 0) {
            fb += "fizz";
        }
        if ((i % 5) == 0) {
            fb += "buzz";
        }
        if (fb.isEmpty()) {
            fb = ".";
        }
        System.out.print(fb + " ");
    }
}
