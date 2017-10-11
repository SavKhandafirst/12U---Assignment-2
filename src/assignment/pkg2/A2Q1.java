/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

/**
 *
 * @author khans4349
 */
public class A2Q1 {

    public int digitalSum(int n) {
        // if number is less than 10 return the answer
        if (10 > n) {
            return n;
            // Otherwise...
        } else {
            // store the last digit by determining the remainder
            int q = n % 10;

            // divide n by 10 to remove the last digit
            int e = n / 10;

            // store the total the number individual values add up to     
            int total = q + digitalSum(e);

            // return the total
            return total;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // output all statements
        A2Q1 test = new A2Q1();

        int outputOne = test.digitalSum(126);
        System.out.println("digital sum of 126: " + outputOne);

        int outputTwo = test.digitalSum(49);
        System.out.println("digital sum of 49 " + outputTwo);

        int outputThree = test.digitalSum(12);
        System.out.println("digital sum of 12 " + outputThree);
    }
}
