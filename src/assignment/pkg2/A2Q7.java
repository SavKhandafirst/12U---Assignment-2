/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

/**
 *
 * @author khans4349
 */
public class A2Q7 {

    public static boolean isPalindrome(String s, int length) {
        // base case when the word length is 1 or less letters
        if (length == 1 || length == 0) {
            return true;

        }

        // determining the first letter in the word
        String firstLetter = s.substring(0, 1);

        // determining the last letter in the word
        String lastLetter = s.substring(s.length() - 1, s.length());

        // check to see if the first and last letter are the same
        if (firstLetter.equals(lastLetter)) {

            // if they are then repeat process again
            return isPalindrome(s.substring(1, length - 1), length - 2);
        } else {

            // letters are not the same
            return false;
        }


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Run Test
        A2Q7 test = new A2Q7();

        // when the word is racecar
        System.out.println(test.isPalindrome("racecar", 7));
    }
}
