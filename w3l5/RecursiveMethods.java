package w3l5;

/**
 * A class for recursive methods
 * @author Koffman and Wolfgang
 */
public class RecursiveMethods {

    /*<example chapter="5" number="1">*/
    /**
     * Recursive method length (in RecursiveMethods.java).
     * @param str The string
     * @return The length of the string
     */
    public static int length(String str) {
        if (str == null || str.equals("")) {
            return 0;
        } else {
            return 1 + length(str.substring(1));
        }
    }
    /*</example>*/

    /*<example chapter="5" number="2">*/
    /**
     * Recursive method printChars (in RecursiveMethods.java).
     * @post The argument string is displayed one character
     *       per line.
     * @param str The string
     */
    public static void printChars(String str) {
        if (str == null || str.equals("")) {
            return;
        } else {
            System.out.print(str.charAt(0));
            printChars(str.substring(1));
        }
    }

    /**
     * Recursive method printCharsReverse (in RecursiveMethods.java).
     * @post The argument string is displayed in reverse,
     *       one character per line.
     * @param str The string
     */
    public static void printCharsReverse(String str) {
        if (str == null || str.equals("")) {
            return;
        } else {
            printCharsReverse(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }
    /*</example>*/

    /*<example chapter="5" number="4">*/
    /**
     * Recursive factorial method (in RecursiveMethods.java).
     * @pre n >= 0
     * @param n The integer whose factorial is being computed
     * @return n!
     */
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    /*</example>*/

    /*<example chapter="5" number="5">*/
    /**
     * Recursive power method (in RecursiveMethods.java).
     * @pre n >= 0
     * @param x The number being raised to a power
     * @param n The exponent
     * @return x raised to the power n
     */
    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }
    /*</example>*/

    /*<example chapter="5" number="6">*/
    /**
     * Recursive gcd method (in RecursiveMethods.java).
     * @pre m > 0 and n > 0
     * @param m The larger number
     * @param n The smaller number
     * @return Greatest common divisor of m and n
     */
    public static double gcd(int m, int n) {
        if (m % n == 0) {
            return n;
        } else if (m < n) {
            return gcd(n, m); // Transpose arguments.
        } else {
            return gcd(n, m % n);
        }
    }
    /*</example>*/

    /*<listing chapter="5" section="3">*/
    /**
     * Recursive linear search method (in RecursiveMethods.java).
     * @param items The array being searched
     * @param target The item being searched for
     * @param posFirst The position of the current first element
     * @return The subscript of target if found; otherwise -1
     */
    private static int linearSearch(Object[] items,
            Object target, int posFirst) {
        if (posFirst == items.length) {
            return -1;
        } else if (target.equals(items[posFirst])) {
            return posFirst;
        } else {
            return linearSearch(items, target, posFirst + 1);
        }
    }

    /**
     * Wrapper for recursive linear search method (in
     * RecursiveMethods.java).
     * @param items The array being searched
     * @param target The object being searched for
     * @return The subscript of target if found; otherwise -1
     */
    public static int linearSearch(Object[] items, Object target) {
        return linearSearch(items, target, 0);
    }
    /*</listing>*/

    /*<listing chapter="5" number="1">*/
    /**
     * Recursive binary search method (in RecursiveMethods.java).
     * @param items The array being searched
     * @param target The object being searched for
     * @param first The subscript of the first element
     * @param last The subscript of the last element
     * @return The subscript of target if found; otherwise -1.
     */
    private static int binarySearch(Object[] items, Comparable target,
            int first, int last) {
        if (first > last) {
            return -1; // Base case for unsuccessful search.
        } else {
            int middle = (first + last) / 2; // Next probe index.
            int compResult = target.compareTo(items[middle]);
            if (compResult == 0) {
                return middle; // Base case for successful search.
            } else if (compResult < 0) {
                return binarySearch(items, target, first, middle - 1);
            } else {
                return binarySearch(items, target, middle + 1, last);
            }
        }
    }

    /**
     * Wrapper for recursive binary search method (in RecursiveMethods.java).
     * @param items The array being searched
     * @param target The object being searched for
     * @return The subscript of target if found; otherwise -1.
     */
    public static int binarySearch(Object[] items, Comparable target) {
        return binarySearch(items, target, 0, items.length - 1);
    }
    /*</listing>*/
    public static void main(String args[]){
    	System.out.println("Length of Java : " + length("Java"));
    	System.out.println("Print as : ");
    	printChars("Data Structures");
    	System.out.println("\nReversed as : ");
    	printCharsReverse("Text Book");
    	System.out.println("\nFactorial of (5) : " + factorial(5));
    	System.out.println("10 to the power of 4 : " + power(10.0,4));
    	System.out.println("GCD for 36 and 24 is :" + gcd(36,24));
    	Integer[] list = {10,20,50,35,11,60};
    	Object[] names = {"Cathy","David","John","Keith","Richard"};
    	Comparable x = "Keith";
    	System.out.println();
    	System.out.println("Linear Searching of 20 : " + linearSearch(list,20));
    	System.out.println("Linear Searching of 100 : " + linearSearch(list,100));
    	System.out.println("Binary Searching of Keith : " + binarySearch(names,x));
    	System.out.println("Binary Searching of Renuka : " + binarySearch(names,"Renuka"));
    }
   }
