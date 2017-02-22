package algorithms.dynamic;

import java.util.Arrays;
import java.util.Scanner;

public class CrossCharacter {

	static String input;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int size;

		for (int j = 0; j < n; j++) {
			// input="GEEKSFORGEEKS";
			input = s.next();
			input = input.toLowerCase();
			size = input.length();

			for (int i = 0; i < size; i++) {
				System.out.println(printNthString(i));
			}

		}

	}

	static void printCrossCharacter() {

	}

	static String printNthString(int n) {
		char[] x = input.toCharArray();
		Arrays.fill(x, ' ');
		x[n] = input.charAt(n);
		x[input.length() - n - 1] = input.charAt(input.length() - n - 1);

		String y = String.copyValueOf(x);

		return y;

	}

}
