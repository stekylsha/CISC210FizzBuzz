package edu.sdccd.mesa.cisc210.fizzbuzz;

/**
 * Cool simplistic version of fizzbuzz.
 */
public class FizzBuzz {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        for (int i = 1 ; i < 42; i++) {
            System.out.println(i + ": " + fb.doFb(i));
        }
    }

    public String doFb(int i) {
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
        return fb;
    }
}
