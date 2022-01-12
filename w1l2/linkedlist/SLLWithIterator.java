package w1l2.linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * SLLWithIterator is a class that provides some of the
 * capabilities required by the List interface including
 * the Iterator using a single linked list data structure.
 * Only the following methods are provided:
 * get, set, add, remove, size, iterator, toString
 * The Iterator does not support the remove method
 * The performance of the add method is improved by
 * including a reference to the last element of the list
 * @author Koffman and Wolfgang */
public class SLLWithIterator<E> implements Iterable<E> {

    // Nested Class
    /** A Node is the building block for the SingleLinkedList */
    private static class Node<E> {

        /** The data value. */
        private E data;
        /** The link */
        private Node<E> next = null;

        /**
         * Construct a node with the given data value and link
         * @param data - The data value 
         * @param next - The link
         */
        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        /**
         * Construct a node with the given data value
         * @param data - The data value 
         */
        public Node(E data) {
            this(data, null);
        }
    }
    // Data fields
    /** A reference to the head of the list */
    private Node<E> head = null;
    /** A reference to the last item of the list */
    private Node<E> tail = null;
    /** The size of the list */
    private int size = 0;

    // Helper Methods
    /**
     * Insert an item as the first item of the list.
     * @param item The item to be inserted
     */
    private void addFirst(E item) {
        head = new Node<E>(item, head);
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    /**
     * Add a node after a given node
     * @param node The node which the new item is inserted after
     * @param item The item to insert
     */
    private void addAfter(Node<E> node, E item) {
        node.next = new Node<E>(item, node.next);
        size++;
        if (node == tail) {
            tail = tail.next;
        }
    }

    /**
     * Remove the first node from the list
     * @returns The removed node's data or null if the list is empty
     */
    private E removeFirst() {
        Node<E> temp = head;
        if (head != null) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        }
        if (temp != null) {
            size--;
            return temp.data;
        } else {
            return null;
        }
    }

    /**
     * Remove the node after a given node
     * @param node The node before the one to be removed
     * @returns The data from the removed node, or null
     *          if there is no node to remove
     */
    private E removeAfter(Node<E> node) {
        Node<E> temp = node.next;
        if (temp != null) {
            node.next = temp.next;
            size--;
            if (node.next == null) {
                tail = node;
            }
            return temp.data;
        } else {
            return null;
        }
    }

    /**
     * Find the node at a specified index
     * @param index The index of the node sought
     * @returns The node at index or null if it does not exist
     */
    private Node<E> getNode(int index) {
        Node<E> node = head;
        for (int i = 0; i < index && node != null; i++) {
            node = node.next;
        }
        return node;
    }

    // Public Methods
    /**
     * Get the data value at index
     * @param index The index of the element to return
     * @returns The data at index
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public E get(int index) {
        Node<E> node = getNode(index);
        if (index < 0 || node == null) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        return node.data;
    }

    /**
     * Set the data value at index
     * @param index The index of the item to change
     * @param newValue The new value
     * @returns The data value priviously at index
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public E set(int index, E newValue) {
        Node<E> node = getNode(index);
        if (index < 0 || node == null) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        E result = node.data;
        node.data = newValue;
        return result;
    }

    /**
     * Insert the specified item at the specified position in the list.
     * Shifts the element currently at that position (if any) and any
     * subsequent elements to the right (adds one to their indicies)
     * @param index Index at which the specified item is to be inserted
     * @param item The item to be inserted
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public void add(int index, E item) {
        if (index == 0) {
            addFirst(item);
        } else {
            Node<E> node = getNode(index - 1);
            if (index < 0 || node == null) {
                throw new IndexOutOfBoundsException(Integer.toString(index));
            }
            addAfter(node, item);
        }
    }

    /**
     * Append the specified item to the end of the list
     * @param item The item to be appended
     * @returns true (as specified by the Collection interface)
     */
    public boolean add(E item) {
        if (tail == null) {
            addFirst(item);
        } else {
            addAfter(tail, item);
        }
        return true;
    }

    /**
     * Remove the item at the specified position in the list. Shifts
     * any squsequent items to the left (subtracts one from their
     * indicies). Returns the tiem that was removed.
     * @param index The index of the item to be removed
     * @returns The item that was at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Node<E> removedNode = null;
        if (index == 0) {
            return removeFirst();
        } else {
            Node<E> node = getNode(index - 1);
            return removeAfter(node);
        }
    }

    /**
     * Query the size of the list
     * @return The number of objects in the list
     */
    int size() {
        return size;
    }

    /**
     * Obtain a string representation of the list
     *  @return A String representation of the list 
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node p = head;
        if (p != null) {
            while (p.next != null) {
                sb.append(p.data.toString());
                sb.append(" ==> ");
                p = p.next;
            }
            sb.append(p.data.toString());
        }
        sb.append("]");
        return sb.toString();
    }

    /** Nested class to provide the iterator implementation */
    private static class IterImpl<E> implements Iterator<E> {

        /** Reference to the current node */
        Node<E> current;

        /**
         * Create a new IterImpl starting at a specified node
         * @param node The starting node
         */
        public IterImpl(Node<E> start) {
            current = start;
        }

        /**
         * Returns true if the iteration has more elements.
         * In other words, returns true if next will return
         * an element and not throw an exception.
         * @returns true if the iterator has more elements
         */
        @Override
        public boolean hasNext() {
            return current != null;
        }

        /**
         * Returns the next element in the iteration
         * @returns The next element in the iteration
         * @throws NoSuchElementException if there are no more elements
         */
        @Override
        public E next() {
            if (current == null) {
                throw new NoSuchElementException();
            }
            E returnValue = current.data;
            current = current.next;
            return returnValue;
        }

        /**
         * Removes the last item returned by next from the
         * list. This method is not supported by this iterator.
         * @throws UnsupportedOperationException operation not supported
         */
        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /**
     * Return an iterator over the items in the list
     * @returns An iterator over the items in the list
     */
    @Override
    public Iterator<E> iterator() {
        return new IterImpl<E>(head);
    }
    
    public static void main(String args[]){
    	SLLWithIterator<Integer> sli= new SLLWithIterator<Integer>();
    	sli.add(10);
    	sli.add(20);
    	sli.add(30);
    	System.out.println(sli);
    	Iterator it = sli.iterator();
    	int sum = 0;
    	while(it.hasNext()){
    		Integer x = (Integer) it.next();
    		sum = sum + x;
    		// System.out.println(it.next());
       		    		
    	}	
    	System.out.println("Sum : " + sum);
    }
}
