package algorithms.dynamic;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int t0 = s.nextInt();
		int t1 = s.nextInt();
		int n = s.nextInt();
		BigInteger[] mem = new BigInteger[n];

		mem[0] = BigInteger.valueOf(t0);
		mem[1] = BigInteger.valueOf(t1);

		for (int i = 2; i < n; i++) {
			mem[i] = mem[i - 2].add(mem[i - 1].multiply(mem[i - 1]));
			// System.out.println(mem[i]);
		}
		System.out.println(mem[n - 1]);

		s.close();
	}

}
