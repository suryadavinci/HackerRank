package algorithms;

import java.util.Scanner;

public class CircularArrayRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int q = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		// System.out.println(n+" "+k+" "+(n-k));
		k = k % n;
		if ((n - k) > k)
			rotate(a, k);
		else
			rotateLeft(a, n - k);

		for (int a0 = 0; a0 < q; a0++) {
			int m = in.nextInt();

			System.out.println(a[m]);
		}

	}

	public static void rotate(int[] a, int rotate) {
		int temp = 0;

		for (int j = 0; j < rotate; j++) {
			temp = a[a.length - 1];
			// System.out.println(temp);

			for (int i = a.length - 1; i >= 0; i--) {
				if (i != 0)
					a[i] = a[i - 1];
				else
					a[i] = temp;
			}

		}

	}

	public static void rotateLeft(int[] a, int rotate) {
		int temp = 0;

		for (int j = 0; j < rotate; j++) {
			temp = a[0];
			// System.out.println(temp);

			for (int i = 0; i < a.length - 1; i++) {
				a[i] = a[i + 1];

			}

			a[a.length - 1] = temp;

		}

	}

}
