package algorithms.strings;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		String s = new Scanner(System.in).next();

		int count = 1;

		for (int i = 1; i < s.length(); i++) {
			// if(s.charAt(i)<91)
			if (s.charAt(i) >= 65 && s.charAt(i) < 91)
				count++;
		}
		System.out.println(count);

	}
}
