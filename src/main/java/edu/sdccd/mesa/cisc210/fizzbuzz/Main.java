package edu.sdccd.mesa.cisc210.fizzbuzz;

public class Main {

    private FizzBuzz fb;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main fbc = new Main();
        fbc.control();
    }

    private Main() {
        fb = new FizzBuzz();
    }

    private void control() {
        System.out.println();
        for (int i = 1 ; i < 42; i++) {
            fb.doFb(i);
        }
        System.out.println();
    }
}
