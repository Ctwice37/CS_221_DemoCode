package w1l2.linkedlist;

class DoublyLinkedList {
	class Link {
		public long dData; // data item
		public Link next; // next link in list
		public Link previous; // previous link in list

		// -------------------------------------------------------------
		public Link(long d) // constructor
		{
			dData = d;
		}

		// -------------------------------------------------------------
		public void displayLink() // display this link
		{
			System.out.print(dData + " ");
		}
		// -------------------------------------------------------------
	} // end class Link

	private Link first; // ref to first item
	private Link last; // ref to last item
	// -------------------------------------------------------------

	public DoublyLinkedList() // constructor
	{
		first = null; // no items on list yet
		last = null;
	}

	// -------------------------------------------------------------
	public boolean isEmpty() // true if no links
	{
		return first == null;
	}

	// -------------------------------------------------------------
	public void insertFirst(long dd) // insert at front of list
	{
		Link newLink = new Link(dd); // make new link

		if (isEmpty()) // if empty list,
			last  = newLink; // newLink <-- last
		else
		{
			first.previous = newLink; // newLink <-- old first
			newLink.next = first; // newLink --> old first
		}
		first = newLink; // first --> newLink
	}

	// -------------------------------------------------------------
	public void insertLast(long dd) // insert at end of list
	{
		Link newLink = new Link(dd); // make new link
		if (isEmpty()) // if empty list,
			first = newLink; // first --> newLink
		else {
			last.next = newLink; // old last --> newLink
			newLink.previous = last; // old last <-- newLink
		}
		last = newLink; // newLink <-- last
	}

	// -------------------------------------------------------------
	public Link deleteFirst() // delete first link
	{ 
		Link temp = first;
		// if the list is empty()
		if(isEmpty())
			return null;
		
		if (first.next == null) // if only one item
			last = null; // null <-- last
		else
		{	
			first.next.previous = null; // null <-- old next
			first = first.next; // first --> old next
		} 		
		return temp;
	}

	// -------------------------------------------------------------
	public Link deleteLast() // delete last link
	{ 
		Link temp = last;
		// if the list is empty()
		if(isEmpty())
		    return null;
		
		if (first.next == null) // if only one item
			first = null; // first --> null
		else
		{
			last.previous.next = null; // old previous --> null
			last = last.previous; // old previous <-- last
		}
		return temp;
	}

	// -------------------------------------------------------------
	// insert dd just after key
	public boolean insertAfter(long key, long dd) { // (assumes non-empty list)
		Link current = first; // start at beginning
		while (current.dData != key) // until match is found,
		{
			current = current.next; // move to next link
			if (current == null)
				return false; // didn't find it
		}
		Link newLink = new Link(dd); // make new link

		if (current == last) // if last link,
		{
			last = newLink;
			newLink.previous = current;
			current.next = newLink;
			
			 // newLink <-- last
		} 
		else // not last link,
		{
			newLink.next = current.next;
			current.next.previous = newLink; // old current <-- newLink
			newLink.previous = current;			
			current.next = newLink; 
		}
		return true; // found it, did insertion
	}

	// -------------------------------------------------------------
	public Link deleteKey(long key) // delete item w/ given key
	{ // (assumes non-empty list)
		Link current = first; // start at beginning
		while (current.dData != key) // until match is found,
		{
			current = current.next; // move to next link
			if (current == null)
				return null; // didn't find it
		}
		if (current == first) // found it; first item?
			{
			first = current.next; // first --> old next
			}
		else
		{
			current.previous.next = current.next;
			current.next.previous = current.previous;
		}
		if (current == last) // last item?
		{
			last = current.previous; // old previous <-- last
		}
		/*else
		{
			current.next.previous = current.previous;
		}*/
		return current; // return value
	}

	// -------------------------------------------------------------
	public void displayForward() {
		System.out.print("List (first-->last): ");
		Link current = first; // start at beginning
		while (current != null) // until end of list,
		{
			current.displayLink(); // display data
			current = current.next; // move to next link
		}
		System.out.println("");
	}

	// -------------------------------------------------------------
	public void displayBackward() {
		System.out.print("List (last-->first): ");
		Link current = last; // start at end
		while (current != null) // until start of list,
		{
			current.displayLink(); // display data
			current = current.previous; // move to previous link
		}
		System.out.println("");
	}
	// -------------------------------------------------------------
} // end class DoublyLinkedList

public class DoublyLinkedApp {
	public static void main(String[] args) { // make a new list
		DoublyLinkedList theList = new DoublyLinkedList();

		theList.insertFirst(22); // insert at front
		theList.insertAfter(22,77);
		
		theList.insertLast(11); // insert at rear
		theList.insertLast(33);
		theList.insertLast(55);
		theList.insertAfter(55, 88); 
		theList.insertAfter(33, 44);
		theList.displayForward(); // display list forward
		theList.displayBackward(); // display list backward

		theList.deleteFirst(); // delete first item
		theList.deleteLast(); // delete last item
		theList.deleteKey(11); // delete item with key 11

		theList.displayForward(); // display list forward
		
		//theList.insertAfter(33, 88); // insert 88 after 33

	//	theList.displayForward(); // display list forward
	} // end main()
}
