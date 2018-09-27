import java.util.*;
import java.io.*;

public class Vowels {
	
	public static void main(String[] args) {
		Set<String> vowels = new TreeSet<>();
		vowels.add("A");
		vowels.add("a");
		vowels.add("E");
		vowels.add("e");
		vowels.add("I");
		vowels.add("i");
		vowels.add("O");
		vowels.add("o");
		vowels.add("U");
		vowels.add("u");
		File file = new File(args[0]);
		if (!file.exists()) {
			System.out.println("Bad input");
			return;
		}
		Scanner input = null;
		try {
			input = new Scanner(file);

		} catch(IOException e) {
			System.out.println("bad input");
			return;
		}
		long vowelCount = 0;
		long consCount = 0;
		while (input.hasNext()) {
			String line = input.nextLine();
			for (int i = 0; i < line.length(); i++) {
				if(vowels.contains(line.substring(i, i + 1))) {
					vowelCount++;
				} else {
					consCount++;
				}
			}
		}
		System.out.print("V:" + vowelCount);
		System.out.print("C:" + consCount);
	}

}
