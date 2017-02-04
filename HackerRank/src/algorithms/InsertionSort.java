package algorithms;

import java.util.Scanner;

public class InsertionSort {

	public static void insertIntoSorted(int[] ar) {

		int size = ar.length;
		int temp = ar[size - 1];
		for (int i = ar.length - 1; i < 0; i--) {

			if (temp < ar[i - 1])
				ar[i] = ar[i - 1];
			else {
				ar[i] = temp;
			}

		}

	}

}
