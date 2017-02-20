package challenges.projecteuler;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ProjectEuler67MaximumPathSumII {

	static int[][] a;
	static int[][] mem;

	public static void main(String[] args) {
		hackerRankProblem();

	}

	public static void hackerRankProblem() {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int size = 0;
		for (int i = 0; i < n; i++) {
			size = s.nextInt();
			mem = new int[size][size];
			a = new int[size][];
			for (int j = 0; j < size; j++) {
				a[j] = new int[j + 1];
				for (int k = 0; k < a[j].length; k++) {
					a[j][k] = s.nextInt();
				}
			}
			System.out.println(findMaximumPath(0, 0));
		}

	}

	public static void projectEulerProblem() throws IOException {
		// TODO Auto-generated method stub
		File file = new File("p067_triangle.txt");

		Scanner s = new Scanner(file);

		a = new int[100][];
		for (int i = 0; i < 100; i++) {

			a[i] = new int[i + 1];
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = s.nextInt();
			}

			System.out.println(Arrays.toString(a[i]));
		}

		mem = new int[100][100];

		// mem=Arrays.copyOf(a, a.length);

		s.close();

		System.out.println(findMaximumPath(0, 0));

	}

	public static int findMaximumPath(int row, int col) {

		if (row >= a.length || col >= a.length) {
			// System.out.println("hello");
			return 0;
		} else {
			if (mem[row][col] != 0) {
				return mem[row][col];
			} else {

				mem[row][col] = a[row][col]
						+ Math.max(findMaximumPath(row + 1, col), findMaximumPath(row + 1, col + 1));
				// System.out.println(row+" "+col+" "+mem[row][col]);
				return mem[row][col];
			}
		}

	}

}
