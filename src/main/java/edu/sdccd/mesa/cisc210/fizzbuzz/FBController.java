package edu.sdccd.mesa.cisc210.fizzbuzz;

public class FBController {

    private FizzBuzz fb;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FBController fbc = new FBController();
        System.out.println();
        for (int i = 1 ; i < 42; i++) {
            fbc.fb.doFb(i);
        }
        System.out.println();
    }

    private FBController() {
        fb = new FizzBuzz();
    }
}
