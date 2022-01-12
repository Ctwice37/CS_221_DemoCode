/*<listing chapter="2" section="3" sequence="1">*/
package w1l2.arraylist;

import java.util.Arrays;
import java.util.AbstractList;

/**
 * This class implements some of the methods of the Java
 *  ArrayList class.
 *  @author Koffman & Wolfgang
 */
public class KWArrayList<E>
        /*<exercise chapter="2" section="9" type="programming" number="1">*/
        
        /*</exercise>*/
{
    // Data Fields

    /** The default initial capacity */
    private static final int INITIAL_CAPACITY = 10;
    /** The underlying data array */
    private E[] theData;
    /** The current size */
    private int size = 0;
    /** The current capacity */
    private int capacity = 0;

    /**
     * Construct an empty KWArrayList with the default
     * initial capacity
     */
    public KWArrayList() {
        capacity = INITIAL_CAPACITY;
        theData = (E[]) new Object[capacity];
    }

    /*<exercise chapter="2" section="3" type="programming" number="2"*>*/
    /**
     * Construct an empty KWArrayList with a specified initial capacity
     * @param capacity The initial capacity
     */
    public KWArrayList(int capacity) {
        this.capacity = capacity;
        theData = (E[]) new Object[capacity];
    }
    /*</exercise>*/

    // Add an element at last
    public boolean add(E anEntry) {
        if (size == capacity) {
            reallocate();
        }
        theData[size] = anEntry;
        size++;
        return true;
    }

   
	// Add an element in a specified location

	public void add(int pos, E anEntry) {
		if (pos > size)
			return;
		if (size == capacity) {
			reallocate();
		}
		
		// shift data
		  for (int i = size; i > pos; i--) {
		    theData[i] = theData[i-1];
		  }

		  // insert item
		  theData[pos] = anEntry;
		  size++;
	}
    
    /**
     * Get a value in the array based on its index.
     * @param index - The index of the item desired
     * @return The contents of the array at that index
     * @throws ArrayIndexOutOfBoundsException - if the index
     *         is negative or if it is greater than or equal to the
     *         current size
     */
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return theData[index];
    }

    /**
     * Set the value in the array based on its index.
     * @param index - The index of the item desired
     * @param newValue - The new value to store at this position
     * @return The old value at this position
     * @throws ArrayIndexOutOfBoundsException - if the index
     *         is negative or if it is greater than or equal to the
     *         current size
     */
    public E set(int index, E newValue) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        E oldValue = theData[index];
        theData[index] = newValue;
        return oldValue;
    }

    /**
     * Remove an entry based on its index
     * @param index - The index of the entry to be removed
     * @return The value removed
     * @throws ArrayIndexOutOfBoundsException - if the index
     *         is negative or if it is greater than or equal to the
     *         current size
     */
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        E returnValue = theData[index];
        for (int i = index + 1; i < size; i++) {
            theData[i - 1] = theData[i];
        }
        size--;
        return returnValue;
    }

    /**
     * Allocate a new array to hold the directory
     */
    private void reallocate() {
        capacity = 2 * capacity;
        theData = Arrays.copyOf(theData, capacity);
    }

    
    /**
     * Get the current size of the array
     * @return The current size of the array
     */
    public int size() {
        return size;
    }

    /*<exercise chapter="2" section="3" type="programming" number="1">*/
    /**
     * Returns the index of the first occurence of the specified element
     * in this list, or -1 if this list does not contain the element
     * @param item The object to search for
     * @returns The index of the first occurence of the specified item
     *          or -1 if this list does not contain the element
     */
    public int indexOf(Object item) {
        for (int i = 0; i < size; i++) {
            if (theData[i] == null && item == null) {
                return i;
            }
            if (theData[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }
    
    public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size-1; ++i){
			sb.append(theData[i]+", ");
		}
		sb.append(theData[size-1]+"]");
		return sb.toString();
	}
  
       /*</exercise>*/
    public static void main(String args[]){
    	
    	KWArrayList<String> str= new KWArrayList<String>();
    	System.out.println("Initial capacity : " + str.capacity);
    	System.out.println("Size of the list : " + str.size());
    	str.add("Java");
    	str.add("Data Structures");
    	System.out.println(str);
    	System.out.println("Size of the list : " + str.size());
    	str.add(1,"C#");
    	System.out.println(str);
    	System.out.println("Size of the list : " + str.size());
    	str.add("Design Pattern");
    	str.remove(1);
    	
    	System.out.println(str);
    	System.out.println("Size of the list : " + str.size());
    	System.out.println("Index of C# :"+ str.indexOf("C#"));
    	System.out.println("Index of Java :"+ str.indexOf("Java"));
    	System.out.println("Element at the index 2 : " + str.get(2));
    	System.out.println("Set the value at the index 1 : " + str.set(1,"Software Engineering"));
    	
   
    	KWArrayList<Integer> aint= new KWArrayList<Integer>();
    	aint.add(10);
    	
    	KWArrayList obj= new KWArrayList();
    	obj.add(10);
    	obj.add("String");
    	System.out.println(obj.get(0));
    	int x = (int) obj.get(0);
    }
}
/*</listing>*/
