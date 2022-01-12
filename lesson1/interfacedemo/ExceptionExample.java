package lesson1.interfacedemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
	/*	int x = 10;
		try {
		System.out.println(x/0);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		System.out.println("End of the Program");*/
		int nextInt = 0;
		boolean validInt = false; // flag for valid input
		  while(!validInt) {
		    try {
		      System.out.println("Enter number of kids: ");
		      nextInt = scanner.nextInt();
		      validInt = true;
		    } catch (InputMismatchException ex) {
		      scanner.nextLine();   // clear buffer
		      System.out.println("Bad data-enter an integer");
		    }
		  }

	}
		
}