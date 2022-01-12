package w1l2.generics;

public class OrderedPair<T> implements Pairable <T> {
private T first, second;
public OrderedPair(T firstItem, T secondItem)
{
	first = firstItem;
	second = secondItem;
}
public T getFirst()
{
	return first;
}
public T getSecond()
{
	return second;
}
public void changeOrder()
{
	T temp = first;
	first = second;
	second = temp;
}
public String toString()
{
	return "(" + first + "," + second + ")";
	
}
}
