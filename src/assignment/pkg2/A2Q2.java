/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

/**
 *
 * @author khans4349
 */
public class A2Q2 {

    public int digitalRoot(int n) {

        // if number is less than 10 return the answer
        if (10 > n) {
            return n;
        } else {
            // store the last digit by determining the remainder
            int q = n % 10;

            // divide n by 10 to remove the last digit
            int e = n / 10;

            // store the total the number individual values add up to     
            int total = q + digitalRoot(e);

            // return total if is less than 10
            if (10 > total) {
                return total;
            } else {
                // determine root of total
                int z = total % 10;
                int p = total / 10;

                // add the the individual integers
                int rootTotal = p + digitalRoot(z);

                // return the final answer 
                return rootTotal;
            }
        }
    }

    public static void main(String[] args) {
        // output all statements
        A2Q2 test = new A2Q2();

        // digital root of 2019
        int outputOne = test.digitalRoot(2019);
        System.out.println("Digital Root of 2019: " + outputOne);

        // digital root of 126
        int outputTwo = test.digitalRoot(126);
        System.out.println("digital sum of 126: " + outputTwo);

        // digital root of 49
        int outputThree = test.digitalRoot(49);
        System.out.println("digital sum of 49: " + outputThree);

        // digital root of 276
        int outputFour = test.digitalRoot(276);
        System.out.println("digital sum of 276: " + outputFour);
    }
}
