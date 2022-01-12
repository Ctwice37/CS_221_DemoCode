/*<listing chapter="1" section="6" sequence="1"*/
package w1l1;

import java.util.Scanner;
import java.util.InputMismatchException;

/** Class to contain static input methods */
public class MyInput {

    /**
     * Reads an integer using a scanner.
     * @return the first integer read.
     */
    public static int getIntValue(Scanner scan) {
        int nextInt = 0;          // next int value
        boolean validInt = false; // flag for valid input
        while (!validInt) {
            try {
                System.out.println("Enter number of kids:");
                nextInt = scan.nextInt();
                validInt = true;
            } catch (InputMismatchException ex) {
                scan.nextLine();  // clear buffer
                System.out.println("Bad data -- enter an integer:");
            }
        }
        return nextInt;
    }
    
    public static void main(String args[]){
    	Scanner in = new Scanner(System.in);
    	getIntValue(in);
    }
}
/*</listing>*/
