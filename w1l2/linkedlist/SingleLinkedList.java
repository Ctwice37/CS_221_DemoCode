/*<listing chapter="2" section="5">*/
package w1l2.linkedlist;

/**
 * SingleLinkedList is a class that provides some of the capabilities required
 * by the List interface using a single linked list data structure. Only the
 * following methods are provided: get, set, add, remove, size, toString
 * 
 * @author Koffman and Wolfgang
 */
public class SingleLinkedList<E> {

	// Nested Class
	/* <listing chapter="2" number="1"> */
	/** A Node is the building block for the SingleLinkedList */
	private static class Node<E> {

		/** The data value. */
		private E data;
		/** The link */
		private Node<E> next = null;

		/**
		 * Construct a node with the given data value and link
		 * 
		 * @param data
		 *            - The data value
		 * @param next
		 *            - The link
		 */
		public Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}

		/**
		 * Construct a node with the given data value
		 * 
		 * @param data
		 *            - The data value
		 */
		public Node(E data) {
			this(data, null);
		}
	}

	/* </listing> */
	// Data fields
	/** A reference to the head of the list */
	private Node<E> head = null;
	/** The size of the list */
	private int size = 0;

	// Helper Methods
	/**
	 * Insert an item as the first item of the list.
	 * 
	 * @param item
	 *            The item to be inserted
	 */
	private void addFirst(E item) {
		head = new Node<E>(item, head);
		size++;
	}

	/**
	 * Add a node after a given node
	 * 
	 * @param node
	 *            The node which the new item is inserted after
	 * @param item
	 *            The item to insert
	 */
	private void addAfter(Node<E> node, E item) {
		node.next = new Node<E>(item, node.next);
		size++;
	}

	/**
	 * Remove the first node from the list
	 * 
	 * @returns The removed node's data or null if the list is empty
	 */
	private E removeFirst() {
		Node<E> temp = head;
		if (head != null) {
			head = head.next;
		}
		if (temp != null) {
			size--;
			return temp.data;
		} else { // list is empty
			return null;
		}
	}

	/**
	 * Remove the node after a given node
	 * 
	 * @param node
	 *            The node before the one to be removed
	 * @returns The data from the removed node, or null if there is no node to
	 *          remove
	 */
	private E removeAfter(Node<E> node) {
		Node<E> temp = node.next;
		if (temp != null) {
			node.next = temp.next;
			size--;
			return temp.data;
		} else {
			return null;
		}
	}

	/**
	 * Find the node at a specified index
	 * 
	 * @param index
	 *            The index of the node sought
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
	 * 
	 * @param index
	 *            The index of the element to return
	 * @returns The data at index
	 * @throws IndexOutOfBoundsException
	 *             if the index is out of range
	 */
	public E get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException(Integer.toString(index));
		}
		Node<E> node = getNode(index);
		return node.data;
	}

	/**
	 * Set the data value at index
	 * 
	 * @param index
	 *            The index of the item to change
	 * @param newValue
	 *            The new value
	 * @returns The data value priviously at index
	 * @throws IndexOutOfBoundsException
	 *             if the index is out of range
	 */
	public E set(int index, E newValue) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException(Integer.toString(index));
		}
		Node<E> node = getNode(index);
		E result = node.data;
		node.data = newValue;
		return result;
	}

	/**
	 * Insert the specified item at the specified position in the list. Shifts
	 * the element currently at that position (if any) and any subsequent
	 * elements to the right (adds one to their indicies)
	 * 
	 * @param index
	 *            Index at which the specified item is to be inserted
	 * @param item
	 *            The item to be inserted
	 * @throws IndexOutOfBoundsException
	 *             if the index is out of range
	 */
	public void add(int index, E item) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException(Integer.toString(index));
		}
		if (index == 0) {
			addFirst(item);
		} else {
			Node<E> node = getNode(index - 1);
			addAfter(node, item);
		}
	}

	/**
	 * Append the specified item to the end of the list
	 * 
	 * @param item
	 *            The item to be appended
	 * @returns true (as specified by the Collection interface)
	 */
	public boolean addLast(E item) {
		add(size, item);
		return true;
	}

	/* <exercise chapter="2" section="5" type="programming" number="1"> */
	/**
	 * Remove the item at the specified position in the list. Shifts any
	 * subsequent items to the left (subtracts one from their indices). Returns
	 * the item that was removed.
	 * 
	 * @param index
	 *            The index of the item to be removed
	 * @returns The item that was at the specified position
	 * @throws IndexOutOfBoundsException
	 *             if the index is out of range
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
	/* </exercise> */

	/**
	 * Query the size of the list
	 * 
	 * @return The number of objects in the list
	 */
	int size() {
		return size;
	}

	/**
	 * Obtain a string representation of the list
	 * 
	 * @return A String representation of the list
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

	/* <exercise chapter="2" section="5" type="programming" number="3"> */
	/**
	 * Remove the first occurrence of element item.
	 * 
	 * @param item
	 *            The item to be removed
	 * @return true if item is found and removed; otherwise, return false.
	 */
	public boolean removeItem(E item) {
		if (head == null) {
			return false;
		}
		Node<E> current = head;
		if (item.equals(current.data)) {
			removeFirst();
			return true;
		}
		while (current.next != null) {
			if (item.equals(current.next.data)) {
				removeAfter(current);
				return true;
			}
			current = current.next;
		}
		return false;
	}
	/* </exercise> */

	/* <exercise chapter="2" section="5" type="programming" number="4"> */
	/**
	 * Insert a new item before the one at position index, starting at 0 for the
	 * list head. The new item is inserted between the one at position index-1
	 * and the one formally at position indes. The exercise requirements are to
	 * not use any helper methods. Since there already is an add method that
	 * uses helper methods, this one is named addbefore.
	 * 
	 * @param index
	 *            The index where the new item is to be inserted
	 * @param item
	 *            The item to be inserted
	 * @throws IndexOutOfBoundsException
	 *             if the indes is out of range
	 */
	public void addBeforeItem(E bitem, E item) {

		if (head == null)
			return;
		if (head.data.equals(bitem)) {
			addFirst(item);
			return;

		}
		Node<E> prev = null;
		Node<E> cur = head;

		while (cur != null && !cur.data.equals(bitem)) {
			prev = cur;
			cur = cur.next;
		}
		// insert between cur and prev
		if (cur != null)
			prev.next = new Node<E>(item, cur);
		    size++;

	}

	public void addBeforeIndex(int index, E item) {
		if (index < 0) {
			throw new IndexOutOfBoundsException(Integer.toString(index));
		}
		if (index == 0) {
			head = new Node(item, head);
			size++;
		} else {
			int i = index;
			Node<E> current = head;
			while (current != null && --i > 0) {
				current = current.next;
			}
			if (i == 0) {
				current.next = new Node(item, current.next);
				size++;
			} else {
				throw new IndexOutOfBoundsException(Integer.toString(index));
			}
		}
	}
	
	public static void main(String args[]) {
		SingleLinkedList<Integer> sll = new SingleLinkedList<Integer>();

		sll.addFirst(10);
		sll.addFirst(20);
		System.out.println(sll);
		Node x = sll.getNode(0);
		sll.addAfter(x, 15);
		System.out.println(sll + " Size is :" + sll.size());
		System.out.println("Removed First Item : " + sll.removeFirst());
		System.out.println(sll + " Size is :" + sll.size());
		x = sll.getNode(0);
		sll.removeAfter(x);
		System.out.println(sll + " Size is :" + sll.size());
		System.out.println("Value at the index 0 : " + sll.get(0));
		// Modify the index Zero value as 25
		sll.set(0, 25);
		System.out.println(sll + " Size is :" + sll.size());
		sll.addFirst(30);
		sll.addFirst(40);
		sll.addFirst(50);
		sll.addLast(10);
		sll.addBeforeIndex(2, 35);
		 sll.addBeforeItem(50,60); 
		 sll.addBeforeItem(40,45);
				System.out.println(sll + " Size is :" + sll.size());
		 System.out.println("Remove value at index 1 : " + sll.remove(1));
		 System.out.println("Remove value 50 : " + sll.removeItem(10));
		 System.out.println(sll + " Size is :" + sll.size());

	}
}
/* </listing> */
