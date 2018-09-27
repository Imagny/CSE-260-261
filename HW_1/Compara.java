import java.util.Comparator;

public class Compara {
	
	public static <T> void selectionSort(T[] list, Comparator<? super T> comparator) {
		int i, j, k;
		for (i = 0; i < list.length; i++) {
			k = i;
			for (j = i + 1; j < list.length; j++) {
				if (comparator.compare(list[j], list[k]) < 0) {
					k = j;
				}
			}
			T temp = list[i];
			list[i] = list[k];
			list[k] = temp;
		}
	}

}
