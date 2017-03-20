package algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumAbsoluteDifference {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		Arrays.sort(a);
		int min = Integer.MAX_VALUE;
		int abs = 0;
		for (int i = 1; i < a.length; i++) {
			abs = Math.abs(a[i - 1] - a[i]);
			if (abs < min)
				min = abs;
			if (min == 0)
				break;
		}
		System.out.print(min);
	}
}