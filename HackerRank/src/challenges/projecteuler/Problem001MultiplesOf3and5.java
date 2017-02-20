package challenges.projecteuler;

import java.util.Scanner;

public class Problem001MultiplesOf3and5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		long output = 0;
		for (int a0 = 0; a0 < t; a0++) {
			long n = in.nextInt();
			// output=getSum(n);
			output = getSumUsingSummation(n);
			System.out.println(output);

		}
	}

	public static long getSum(long n) {
		long output = 0;
		for (long i = 3; i < n; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				output = output + i;
		}
		return output;
	}

	public static long getSumUsingSummation(long upper) {
		upper = upper - 1;
		long n;

		n = upper / 3;
		long output = (n) * (2 * 3 + (n - 1) * 3);
		n = upper / 15;
		output = output - (n) * (2 * 15 + (n - 1) * 15);
		n = upper / 5;
		output = output + (n) * (2 * 5 + (n - 1) * 5);

		output = output / 2;
		return output;
	}

}
