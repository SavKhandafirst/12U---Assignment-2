/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

/**
 *
 * @author khans4349
 */
public class A2Q4 {

    public void hailstone(int n) {

        System.out.println(n);

        // when the vaslue of n is 1 return that value
        if (n == 1) {
        } // if n is an odd number than multiply by 3 and add 1
        else if (n % 2 == 1) {
            hailstone(3 * n + 1);

            // if n is even than divide by 2
        } else if (n % 2 == 0) {
            hailstone(n / 2);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // output all statements
        A2Q4 test = new A2Q4();

        // hailstone number 5
        System.out.println("Test for 5");
        test.hailstone(5);

        // hailstone number 12
        System.out.println("Test for 12");
        test.hailstone(12);
    }
}
