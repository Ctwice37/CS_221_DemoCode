/*<listing chapter="4" number="4">*/
package w2l4;

import java.util.*;

/**
 * Circular QUeue - Implements the Queue interface using a circular array.
 * @author Koffman & Wolfgang
 **/
public class ArrayQueue<E> {

    // Data Fields
    /** Index of the front of the queue. */
    private int front;
    /** Index of the rear of the queue. */
    private int rear;
    /** Current size of the queue. */
    private int size;
    /** Current capacity of the queue. */
    private int capacity;
    /** Default capacity of the queue. */
    private static final int DEFAULT_CAPACITY = 10;
    /** Array to hold the data. */
    private E[] theData;

    // Constructors
    /**
     * Construct a queue with the default initial capacity.
     */
    public ArrayQueue() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Construct a queue with the specified initial capacity.
     * @param initCapacity The initial capacity
     */
    @SuppressWarnings("unchecked")
    public ArrayQueue(int initCapacity) {
        capacity = initCapacity;
        theData = (E[]) new Object[capacity];
        front = 0;
        rear = capacity - 1;
        size = 0;
    }

    // Public Methods
    /**
     * Inserts an item at the rear of the queue.
     * @post item is added to the rear of the queue.
     * @param item The element to add
     * @return true (always successful)
     */
    
    public boolean offer(E item) {
        if (size == capacity) {
            reallocate();
        }
        size++;
        rear = (rear + 1) % capacity;
        theData[rear] = item;
        return true;
    }

     /**
     * Returns the item at the front of the queue without removing it.
     * @return The item at the front of the queue if successful;
     * return null if the queue is empty
     */
    
    public E peek() {
        if (size == 0) {
            return null;
        } else {
            return theData[front];
        }
    }

    /**
     * Removes the entry at the front of the queue and returns it
     * if the queue is not empty.
     * @post front references item that was second in the queue.
     * @return The item removed if successful or null if not
     */
   
    public E poll() {
        if (size == 0) {
            return null;
        }
        E result = theData[front];
        front = (front + 1) % capacity;
        size--;
        return result;
    }

    /*<exercise chapter="4" section="3" type="programming" number="3">*/
    /**
     * Return the size of the queue
     * @return The number of items in the queue
     */
    
    public int size() {
        return size;
    }

    

    // Private Methods
    /**
     * Double the capacity and reallocate the data.
     * @pre The array is filled to capacity.
     * @post The capacity is doubled and the first half of the
     *       expanded array is filled with data.
     */
    @SuppressWarnings("unchecked")
    private void reallocate() {
        int newCapacity = 2 * capacity;
        E[] newData = (E[]) new Object[newCapacity];
        int j = front;
        for (int i = 0; i < size; i++) {
            newData[i] = theData[j];
            j = (j + 1) % capacity;
        }
        front = 0;
        rear = size - 1;
        capacity = newCapacity;
        theData = newData;
    }
    
    public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size-1; ++i){
			sb.append(theData[i]+", ");
		}
		sb.append(theData[size-1]+"]");
		return sb.toString();
	}
  
    
  
    public static void main(String args[]){
    	ArrayQueue<Integer> lq = new ArrayQueue();
    	lq.offer(10);
    	lq.offer(20);
    	lq.offer(30);
    	lq.offer(40);
    	lq.offer(50);
    	lq.offer(60);
    	lq.offer(70);
    	lq.offer(80);
    	lq.offer(90);
    	lq.offer(100);
    	lq.offer(110);
    	lq.offer(120);
    	System.out.println(lq);
    	System.out.println("Peek Element : " + lq.peek());
    	System.out.println("Size : " + lq.size());
    	System.out.println("Poll : " + lq.poll());
   	
    }
}

