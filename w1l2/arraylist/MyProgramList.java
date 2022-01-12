/*<listing chapter="2" section="3" sequence="1">*/
package w1l2.arraylist;

import java.util.Arrays;
import java.util.AbstractList;

class Program{
	String pid;
	String pname;
	public Program(String pid, String pname) {
		this.pid = pid;
		this.pname = pname;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "[" + pid +  " " + pname + "]";
	}
	
	
}
public class MyProgramList
        /*<exercise chapter="2" section="9" type="programming" number="1">*/
        
        /*</exercise>*/
{
    // Data Fields

    /** The default initial capacity */
    private static final int INITIAL_CAPACITY = 10;
    /** The underlying data array */
    private Program[] theData;
    /** The current size */
    private int size = 0;
    /** The current capacity */
    private int capacity = 0;

    /**
     * Construct an empty KWArrayList with the default
     * initial capacity
     */
    public MyProgramList() {
        capacity = INITIAL_CAPACITY;
        theData =  new Program[capacity];
    }

    /*<exercise chapter="2" section="3" type="programming" number="2"*>*/
    /**
     * Construct an empty KWArrayList with a specified initial capacity
     * @param capacity The initial capacity
     */
    public MyProgramList(int capacity) {
        this.capacity = capacity;
        theData =  new Program[capacity];
    }
    /*</exercise>*/

    // Add an element at last
    public boolean add(Program anEntry) {
        if (size == capacity) {
            reallocate();
        }
        theData[size] = anEntry;
        size++;
        return true;
    }

   
	// Add an element in a specified location

	public void add(int pos, Program anEntry) {
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
    public Program get(int index) {
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
    public Program set(int index, Program newValue) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        Program oldValue = theData[index];
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
    public Program remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        Program returnValue = theData[index];
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
    public int indexOf(String item) {
        for (int i = 0; i < size; i++) {
            if (theData[i] == null && item == null) {
                return i;
            }
            if (theData[i].getPid().equals(item)) {
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
    	MyProgramList str= new MyProgramList();
    	System.out.println("Initial capacity : " + str.capacity);
    	System.out.println("Size of the list : " + str.size());
    	
    	str.add(new Program("CS221","DS"));
    	str.add(new Program("CS390","FPP"));
    	System.out.println(str);
    	System.out.println("Size of the list : " + str.size());
    	str.add(1,new Program("CS433","C#"));
    	System.out.println(str);
    	System.out.println("Size of the list : " + str.size());
    	str.add(new Program("CS555","Design Pattern"));
    	System.out.println("Removed Item :" + str.remove(1));
    	
    	System.out.println(str);
    	System.out.println("Size of the list : " + str.size());
    	System.out.println("Index of CS221 :"+ str.indexOf("CS221"));
    	System.out.println("Index of CS100 :"+ str.indexOf("CS100"));
    	System.out.println("Element at the index 2 : " + str.get(2));
    	System.out.println("Set the value at the index 1 : " + str.set(1,new Program("CS600", "Andriod")));
    	
   
    	
    }
}
/*</listing>*/
