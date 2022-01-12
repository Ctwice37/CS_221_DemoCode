package w1l2.sorting.inclassdemo;

import java.util.Comparator;

public class BrandComparator implements Comparator<EItem>{

	@Override
	public int compare(EItem o1, EItem o2) {
		// TODO Auto-generated method stub
		return o1.getBrand().compareTo(o2.getBrand());
	}

}
