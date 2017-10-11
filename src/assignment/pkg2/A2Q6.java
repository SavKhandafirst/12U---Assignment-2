/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

/**
 *
 * @author khans4349
 */
public class A2Q6 {

    // create a string of arrays that will store letters from A to F
    private static String letters[] = new String[]{"A", "B", "C", "D", "E", "F"};

    public static String convert(int n, int b) {
        // store the quotient
        int quotient = n / b;

        // store the remainder
        int remainder = n % b;

        // if the remainder is 10 or greater than change it to the according letter
        if (remainder >= 10) {
            return convert(quotient, b) + letters[remainder - 10];

            // ifthe number is is greater than 15 return as a number
        } else if (remainder > 15) {
            return Integer.toString(n);
        }

        // if quotient is equal to base case
        if (quotient == 0) {

            // return remainder as a string
            return Integer.toString(remainder);
        } else {

            // otherwise repeat the process
            return convert(quotient, b) + Integer.toString(remainder);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // set the test
        A2Q6 test = new A2Q6();

        // when: int n is 1000, and int b is 8
        System.out.println("test one");
        System.out.println(test.convert(1000, 8));

        // when: int n is 1000, and int b is 16
        System.out.println("test two");
        System.out.println(test.convert(1000, 16));

        // when: int n is 1000, and int b is 2
        System.out.println("test three");
        System.out.println(test.convert(1000, 2));


    }
}
