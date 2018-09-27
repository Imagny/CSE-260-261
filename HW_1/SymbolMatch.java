import java.io.*;
import java.util.*;

public class SymbolMatch {
	
	public static void main(String[] args) {
		File file = new File(args[0]);
		if(!file.exists()) {
			System.out.println("Bad input");
			return;
		}

		Stack<Character> symbols = new Stack<>();
		Scanner input = null;
		try {
			input = new Scanner(file);
		} catch (IOException e) {
			System.out.println("Bad input");
			return;
		} 
		while (input.hasNext()) {
			String line = input.nextLine();
			for (int i = 0; i < line.length(); i++) {
				char ch = line.charAt(i);
				if (ch == '(' || ch == '{' || ch == '[') {
					symbols.push(ch);
				} else if (ch == ')' || ch == '}' || ch == ']') {
					if ((symbols.peek() == '(' && ch == ')') || (symbols.peek() == '[' && ch == ']') || (symbols.peek() == '{' && ch == '}')) {
				       		symbols.pop();	
					} else if ((symbols.peek() != '(' && ch == ')') || (symbols.peek() != '[' && ch == ']') || (symbols.peek() != '{' && ch == '}')) {
						System.out.println("Bad input mismatch");
						return;
					}			
				}
			}
		}
		System.out.println("Good coding!");
	}

}
