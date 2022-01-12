package w1l2.linkedlist.api;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Student{
	private int id;
	private String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString()
	{
		return id + " " + name;
	}
	
}
public class APIDemoLL {

	public static void main(String[] args) {
		
	LinkedList<String> list = new LinkedList();
	
	list.add("Java");
	list.addFirst("DS");
	list.addLast("SE");
	System.out.println(list);
	System.out.println(list.size());
	boolean res = list.contains("DS");
	System.out.println("DS is in the list or not : " + res);
	System.out.println(list.get(1));
	System.out.println(list.getFirst());
	System.out.println(list.getLast());
	list.add(1, "FPP");
	System.out.println(list);
	list.set(1, "MPP");
	System.out.println(list.isEmpty());
	System.out.println(list);
	list.remove();
	list.removeLast();
	list.remove("MPP");
	System.out.println(list);
	list.add("MPP");
	list.add("Mobile Programming");
	list.add("Master VC++");
/*	System.out.println(list);
	int c=0;
	
	Iterator ob = list.iterator();
	
	while(ob.hasNext()){
		String x = (String) ob.next();
		if (x.startsWith("M"))
			System.out.println("String startswith M :" + x);
	}*/
	System.out.println(list);
	ListIterator it1 = list.listIterator();
	System.out.println("First Element :"+ it1.next());
	System.out.println("Second Element :"+ it1.next());	
	System.out.println("Element has previous:"+ it1.hasPrevious());	
	System.out.println("Element has previous:"+ it1.hasNext());
	it1.add("Andriod");
	System.out.println("New Element :"+ it1.next());
	System.out.println(list);
	
	
	
/*	for(String x : list){
		if(x.startsWith("M"))
			c++;
				
	}*/
	//System.out.println("Strings Starts with M " + c);
		
	
   /* LinkedList<Student> list = new LinkedList();
    list.add(new Student(1,"AA"));
    list.addFirst(new Student(2,"BB"));
    list.addFirst(new Student(3,"CC"));
    System.out.println(list);
    boolean res = list.contains(list.get(0));
    System.out.println(res);
    // Print the id >1
    for(Student x : list){
       	if(x.getId()>1)
    		System.out.println(x);
    }*/
    
}
}