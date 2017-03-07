package algorithms.dynamic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class Equal {

	static int[] a;
	static int sHigh;
	static int tHigh;
	static int currentCount;
	static int n = 0;
	static int count;

	static TreeSet<Integer> set = new TreeSet<Integer>();

	public static void main(String[] args) {

		// int[] a = { 1, 2, 11, 45, 13, 19, 66, 3, 4, 5 };
		int[] a = { 2, 2, 3, 7 };

		System.out.println(getEqual(a, 0, 0));

	}

	public static void tempmain(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int n;
		for (int i = 0; i < t; i++) {
			n = s.nextInt();
			a = new int[n];

			for (int j = 0; j < n; j++) {

				a[j] = s.nextInt();

			}

		}

	}

	public static int getEqual(int[] array, int val, int secHighIndex) {

		if (allElementsEqual(array)) {
			System.out.println("all elements equal");
			return 1;
		}

		int[] newArray = Arrays.copyOf(array, array.length);

		if (n++ == 10)
			System.exit(0);

		if (val != 0) {
			System.out.println("BEFORE :" + Arrays.toString(newArray));
			newArray = addNToArray(newArray, secHighIndex, val);
			System.out.println("AFTER :" + Arrays.toString(newArray));
		}

		int secondHighIndex = getNthLargest(2, newArray);

		count = 1 + Math.min(
				Math.min(currentCount = getEqual(newArray, 1, secondHighIndex),
						currentCount = getEqual(newArray, 2, secondHighIndex)),
				currentCount = getEqual(newArray, 5, secondHighIndex));

		return count;
	}

	private static boolean allElementsEqual(int[] a) {
		System.out.println(Arrays.toString(a));

		for (int i = 1; i < a.length - 1; i++) {

			// System.out.println(a[i]+" "+a[i-1]);
			if (a[i] != a[i - 1])
				return false;
		}
		System.out.println("returning true");
		return true;
	}

	public static int[] addNToArray(int[] a, int ignoreIndex, int val) {

		for (int i = 0; i < a.length; i++) {

			if (i != ignoreIndex) {
				a[i] = a[i] + val;
			}
		}

		return a;
	}

	public static int getNthLargest(int n, int[] a) {

		Arrays.sort(a);
		// System.out.println(Arrays.toString(a));
		int high = a.length - 1;
		int i = 0;
		int count = 1;
		for (i = a.length - 2; i >= 0; i--) {
			if (a[i] < a[high]) {
				// System.out.println(count + " " + a[i] + " " + a[high]);
				count++;
				if (count == n)
					return i;
			}
		}
		return i;

	}

}
