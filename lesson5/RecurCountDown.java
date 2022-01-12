package lesson5;

public class RecurCountDown {
	
	// Count down n = 5 res = 5 4 3 2 1

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//countDown(5);
	//	System.out.println("Length of Java : " + length("Java"));
		//printCharsReverse("Java");
		System.out.println("5 th number in the fibo series : " + fib(7));
	}
	
	// Method signature
	public static void countDown(int x) {
		// 1. Base Case
	   if(x<=0)
		   System.out.println("End");
	   else {
		// 2. Recursive caseCall by itself
		System.out.println(x);
		countDown(x-1);
	   }
	}
	
	public static int length(String str) {
		if (str == null || str.equals(""))
		return 0;
		else
		return 1 + length(str.substring(1));
		}
	
	public static void printCharsReverse(String str) {
		if (str == null || str.equals(""))
		return;
		else {
		printCharsReverse(str.substring(1));
		System.out.println(str.charAt(0));
		}
		}
	public static int fib(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		return fib(n-1) + fib(n-2);
	}

}

















/*
if(x<=0)
			System.out.println("End");
		
		else {
		System.out.println(x);
		countDown(x-1);
		
		// Way - 2
		 if(x>0) {
				System.out.println(x);
		        countDown(x-1);
		}
		else
		System.out.println("End");

	}
		 */
