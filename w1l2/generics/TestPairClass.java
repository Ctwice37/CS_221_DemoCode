package w1l2.generics;

// Generic type Argument
enum Month { JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC }

class Pair<S, T> {
  private S first;
  private T second;

  public Pair(S first, T second) {
    this.first = first;
    this.second = second;
  }

  public S getFirst() {
    return first;
  }

  public T getSecond() {
    return second;
  }

  public String toString() {
    return "(" + first + ", " + second + ")";
  }
}

public class TestPairClass {
	  public static void main(String[] args) {

		  // Generic Type 1
		Pair<Month, Integer> christmas =new Pair<Month, Integer>(Month.DEC, 25);
	    System.out.println(christmas);
	    Month month = christmas.getFirst();
	    int day = christmas.getSecond();
	    System.out.println(month + " " + day);

	    // Generic Type 2
	    Pair <String,String> newyear = new Pair<String,String>("January","Happy New Year");
	    System.out.println(newyear);

	    System.out.println(newyear.getFirst() + " " + newyear.getSecond());

	  }
	}

