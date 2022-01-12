package w1l2.arraylist;

public class TestLinearSearch {
	public static void main(String[] args) {
		int[] a = { 22, 34, 11, 58, 16, 77, 65, 19 };
		System.out.println("search(a, 34): " + search(a, 34));
		System.out.println("search(a, 50): " + search(a, 50));
		long sysTime1 = System.nanoTime();

		System.out.println("search(a, 19): " + search(a, 19));
		long sysTime2 = System.nanoTime();
		long t = sysTime2 - sysTime1;
		System.out.println("LS Time : " + t);
		System.out.println("search(a, 100): " + search(a, 100));
	}

	public static int search(int[] a, int x) {
		for (int i = 0; i < a.length; i++) { // step 1

			if (a[i] == x) {
				return i;
			}
		}
		return -1;
	}
}