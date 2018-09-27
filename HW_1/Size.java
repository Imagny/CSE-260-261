import java.io.*;
import java.util.*;

public class Size {
	
	public static void main(String[] args) {
		long u = getSize(new File(args[0]));
		System.out.println(u);
	}

	public static long getSize(File file) {
		long size = 0;
		LinkedList<File> files = new LinkedList<>();
		files.offer(file);
		while (files.size() > 0) {
			File temp = files.remove();
			if (temp.isDirectory()) {
				for (File fil : temp.listFiles()) {
					files.offer(fil);
				}
			} else {
				size += temp.length();
			}
		}
		return size;
	}

}
