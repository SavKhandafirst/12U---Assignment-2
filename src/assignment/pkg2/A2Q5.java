/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

/**
 *
 * @author khans4349
 */
public class A2Q5 {

    public void binaryConvert(int n) {
        // base case
        if (n == 1) {
            System.out.print(n);
        } else {
            // if n divided by two has no remainder than divide n by two and print zero
            if (n % 2 == 0) {
                binaryConvert(n / 2);
                System.out.print(0);
            } else {
                // if n divided by two has a remainder of one than divide n by two and print one
                if (n % 2 == 1) {
                    binaryConvert(n / 2);
                    System.out.print(1);

                }
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Output all statements
        A2Q5 test = new A2Q5();

        // binary convert number 156
        System.out.println("Binary convert of 156");
        test.binaryConvert(156);

        // binary convert number 13
        System.out.println();
        System.out.println("Binary convert of 13");
        test.binaryConvert(13);

        // binary convert number 1000
        System.out.println();
        System.out.println("Binary convert of 1000");
        test.binaryConvert(1000);
        System.out.println();


    }
}
