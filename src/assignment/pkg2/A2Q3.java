/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

/**
 *
 * @author khans4349
 */
public class A2Q3 {

    public int triangle(int n) {
        // when the value of n is 0 return that value
        if (n <= 0) {
            return n;
            // if n is 1, n is obviously 1 because of BASE CASE    
        } else if (n == 1) {
            return 1;

        } else {
            // return the value of all integers over 1 
            return n = (n + triangle(n - 1));
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // output all statements
        A2Q3 test = new A2Q3();

        // row 0 
        int rowZero = test.triangle(0);
        System.out.println("Row 0: " + rowZero);

        // row 1
        int rowOne = test.triangle(1);
        System.out.println("Row 1: " + rowOne);

        // row 3
        int rowThree = test.triangle(3);
        System.out.println("Row 3: " + rowThree);

        // row 5
        int rowFive = test.triangle(5);
        System.out.println("Row 5: " + rowFive);
    }
}
