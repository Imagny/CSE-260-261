import java.util.Arrays;

public class GenericStackArray {
	
	private Object[] list = new Object[0];
	private int index = -1;

	public int getSize() {
		return this.index + 1;
	}

	public Object peek() {
		return list[this.index];
	}

	public void push(Object o) {
		if (list.length == 0) {
			this.list = new Object[1];
			this.list[0] = o;
		} else if (this.index == (list.length - 1)) {
			Object[] copy = this.list.clone();
			this.list = new Object[copy.length * 2];
			for (int i = 0; i < copy.length; i++) {
				this.list[i] = copy[i];
			}
		} else {
			this.list[this.index + 1] = o;
		}
		this.index++;

	}

	public Object pop() {
		Object copy = this.list[this.index];
		this.list = Arrays.copyOf(this.list, this.list.length - 1);
		this.index--;
		return copy;
	}

	public boolean isEmpty() {
		return this.index == -1;
	}

	@Override
	public String toString() {
		return "stack" + Arrays.toString(this.list);
	}

}
