package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Pairs {

	static int pairs(int[] a, int k) {
		/* Complete this function */
		int count = 0;
		Arrays.sort(a);

		// System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			if (Arrays.binarySearch(a, a[i] + k) >= 0)
				count++;
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;

		String n = in.nextLine();
		String[] n_split = n.split(" ");

		int _a_size = Integer.parseInt(n_split[0]);
		int _k = Integer.parseInt(n_split[1]);

		int[] _a = new int[_a_size];
		int _a_item;
		String next = in.nextLine();
		String[] next_split = next.split(" ");

		for (int _a_i = 0; _a_i < _a_size; _a_i++) {
			_a_item = Integer.parseInt(next_split[_a_i]);
			_a[_a_i] = _a_item;
		}

		res = pairs(_a, _k);
		System.out.println(res);
	}

}
