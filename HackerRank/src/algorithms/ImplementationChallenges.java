package algorithms;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ImplementationChallenges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		designerPDFViewer();
	}

	/*
	 * Sample Input 1 1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 `abc
	 * Sample Input 2 1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
	 * abcdefghi
	 */
	public static void designerPDFViewer() {

		Scanner in = new Scanner(System.in);
		int n = 26;
		int h[] = new int[n];
		for (int h_i = 0; h_i < n; h_i++) {
			h[h_i] = in.nextInt();
		}
		String word = in.next();

		// System.out.println((int) word.charAt(0));
		int highPointer = word.length() - 1;
		int lowPointer = 0;

		int high = 0;

		int currentHigh = 0;

		while (lowPointer <= highPointer) {
			// System.out.println(word.charAt(lowPointer)+"
			// "+word.charAt(highPointer)+" "+(word.charAt(lowPointer)-97)+" "+(
			// word.charAt(highPointer)-97));
			currentHigh = Math.max(h[word.charAt(lowPointer) - 97], h[word.charAt(highPointer) - 97]);

			if (currentHigh > high)
				high = currentHigh;

			lowPointer++;
			highPointer--;
		}
		// System.out.println(high+" "+word.length()+" "+high*word.length());
		System.out.println(high * word.length());

	}

}
