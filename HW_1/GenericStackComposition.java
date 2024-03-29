import java.util.ArrayList;

public class GenericStackComposition<E> extends ArrayList<E> {
	private java.util.ArrayList<E> list = new ArrayList<E>();
	public int getSize() {
		return list.size();
	}
	public E peek() {
		return list.get(getSize() - 1);
	}
	public void push(E o) {
		list.add(o);
	}
	public E pop() {
		E o = list.remove(getSize() - 1);
		return o;
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
}
