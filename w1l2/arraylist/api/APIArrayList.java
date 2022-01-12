package w1l2.arraylist.api;

import java.util.ArrayList;
import java.util.Arrays;

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
public class APIArrayList {
	public static void main(String args[]){
		/*ArrayList<String> nl = new ArrayList<String>();
		nl.add("Anu");
		nl.add("Bijay");
		//System.out.println(nl);
		nl.add(1, "Ajith");
		System.out.println(nl);
		System.out.println("Size : " + nl.size());
		System.out.println(nl.contains("Anu1"));
		System.out.println("Oth Index : " +nl.get(0));
	    nl.set(1, "Bijay Kumar");
	    System.out.println(nl);
	    nl.clear();
	    System.out.println("Size : " + nl.size());
	    */
	   /* ArrayList<Integer> num = new ArrayList(Arrays.asList(10,20,30));
	    System.out.println(num);
	    num.remove(0);
	    num.remove(new Integer(30));
	    System.out.println(num);
	    
	    ArrayList<Integer> num1 = new ArrayList(Arrays.asList(40,50,60));
        num.addAll(num1);
        System.out.println(num);*/
		
		ArrayList<Program> list = new ArrayList();
		list.add(new Program("CS221","DS"));
		list.add(new Program("CS203","Java"));
		list.add(new Program("CS390","FPP"));
		list.add(new Program("CS401","MPP"));
		System.out.println(list);
		System.out.println(list.size());
		
	}

}
