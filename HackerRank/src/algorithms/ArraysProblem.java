package algorithms;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ArraysProblem {
	static LinkedList a = new LinkedList();

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			a.add(scanner.nextInt());

		}

		int type, i1, j1;
		for (int j = 0; j < m; j++) {
			type = scanner.nextInt();
			i1 = scanner.nextInt();
			j1 = scanner.nextInt();

			scramble(type, i1, j1);

		}

		System.out.println(Math.abs((Integer) a.getFirst() - (Integer) a.getLast()));
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + " ");
		}

	}

	static void scramble(int type, int i, int j) {
		// System.out.println("current "+a);

		if (type == 1) {

			LinkedList b = new LinkedList();
			b.addAll(a.subList(i - 1, j));

			// System.out.println(b);

			int i1 = 0;
			while (i1++ < (j - i + 1))
				a.remove(i - 1);
			// System.out.println(a);
			b.addAll(a);

			// System.out.println(b);
			a = b;

		} else if (type == 2) {

			LinkedList b = new LinkedList();
			b.addAll(a.subList(i - 1, j));

			// System.out.println(b);

			int i1 = 0;
			while (i1++ < (j - i + 1))
				a.remove(i - 1);
			// System.out.println(a);
			a.addAll(b);

			// System.out.println(a);

		}

	}

}
