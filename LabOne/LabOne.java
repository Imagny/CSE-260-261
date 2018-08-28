import java.util.HashMap; 
import java.util.Map; 
import java.util.Arrays;

public class LabOne { 
	
	public static void main(String[] arr) { 
		printArbitraryNumbers();
		System.out.println("==============");
		times();
		System.out.println("==============");
		System.out.println(howManyCollatzIterations(10));
		System.out.println(howManyCollatzIterations(100));
		System.out.println(howManyCollatzIterations(53));
	} 
	
	public static void printArbitraryNumbers() { 
		HashMap<Integer, Integer> numbers = new HashMap<>(); 
		for (int i = 0; i < 10; i++) { 
			int rand = (int) (Math.random() * 10); 
			numbers.put(rand, rand); 
		} 
		for (int i : numbers.keySet()) {
			System.out.println(i);
		}
	}
	
	public static void times() {
		int[] arr = generateBigArray(10000);
		int key = arr[(int) (Math.random() * 10000)];
		long startTime = System.nanoTime();
		long endTime = 0;
		for (int i : arr) {
			if (i == key) {
				endTime = System.nanoTime();
			}
		}
		System.out.print("Linear search time is ");
		System.out.println(endTime - startTime);
		Arrays.sort(arr);
		startTime = System.nanoTime();
		int index = Arrays.binarySearch(arr, key);
		endTime = System.nanoTime();
		System.out.print("Sorted b search time is ");
		System.out.println(endTime - startTime);
	}

	public static int[] generateBigArray(int count) {
		int[] numbers = new int[count];
		for (int i = 0; i < count; i++) {
			numbers[i] = (int) (Math.random() * 9999);
		}
		return numbers;	
	}

	public static int howManyCollatzIterations(int n) {
		int count = 0;
		while (n != 1) {
			count++;
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n = (n * 3) + 1;
			}
		}
		return count;
	}
	
}
