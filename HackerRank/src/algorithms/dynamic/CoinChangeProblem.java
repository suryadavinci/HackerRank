package algorithms.dynamic;

import java.util.HashMap;
import java.util.Scanner;

public class CoinChangeProblem {

	static long[] a;
	static HashMap<String, Long> mem;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int sum = s.nextInt();
		/*
		 * 4 3 1 2 3
		 */
		int m = s.nextInt();
		mem = new HashMap<String, Long>();
		a = new long[m];
		for (int i = 0; i < m; i++) {
			a[i] = s.nextInt();
		}

		System.out.println(getCoinChange(sum, 0));
		System.out.println(mem);
		s.close();
	}

	private static long getCoinChange(long sum, int index) {
		// TODO Auto-generated method stub

		if (mem.containsKey(index + "-" + sum))
			return mem.get(index + "-" + sum);

		long count = 0;

		for (int i = 0; index < a.length && i <= sum / a[index]; i++) {

			// System.out.println(sum +" "+i*a[index]);
			if (sum == i * a[index])
				count += 1;
			else if (sum > i * a[index])
				count = count + (getCoinChange((sum - i * a[index]), index + 1));
			else if (sum < i * a[index])
				count = count + (getCoinChange((sum), index + 1));

		}

		mem.put(index + "-" + sum, count);
		return count;
	}

}
