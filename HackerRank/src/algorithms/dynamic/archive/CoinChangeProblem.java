package algorithms.dynamic.archive;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CoinChangeProblem {

	// static int a[]={10,2,1};
	static int a[];
	static int count;

	public static void main(String[] args) {

		/*
		 * HashMap<Integer,Integer> h= new HashMap<Integer,Integer>(); h.put(1,
		 * 1); h.put(2, 5);
		 * 
		 * HashMap<Integer,Integer> i= new HashMap<Integer,Integer>(); i.put(3,
		 * 1); i.put(4, 5); i.putAll(h);
		 * 
		 * System.out.println(i);
		 */

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		/*
		 * 4 3 1 2 3
		 */
		int m = s.nextInt();

		a = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = s.nextInt();
		}

		getCoinChange(n, a, new HashMap<Integer, Integer>());

		System.out.println(count);
	}

	public static void getCoinChange(int sum, int[] sub, HashMap<Integer, Integer> x) {
		// System.out.println("INPUT ARRAY : "+Arrays.toString(sub));

		if (sub.length == 0) {

			return;
		}
		int a = sub[0];
		for (int j = 0; j <= sum / sub[0]; j++) {
			if (j * a == sum) {
				x.put(a, j);
				count++;
				System.out.println("FOUND " + x);
				x.remove(a);
			} else if (j * a > sum) {
				break;
			} else {
				// op=op+""+a+"x"+j+" + ";
				// System.out.println(sum+" "+x);
				x.put(a, j);

				getCoinChange(sum - a * j, Arrays.copyOfRange(sub, 1, sub.length), x);
			}

		}

	}

}
