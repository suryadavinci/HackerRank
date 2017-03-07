package challenges.projecteuler;

import java.util.Scanner;

public class Problem015LatticePaths {
	public static void main(String[] args) {
		UniquePaths up = new UniquePaths();

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			up.n = s.nextInt() + 1;
			up.m = s.nextInt() + 1;
			up.mem = new long[up.n][up.m];
			System.out.println(up.totalPaths(0, 0));
		}

		s.close();
	}

}

class UniquePaths {
	int n;
	int m;
	public static long mem[][];
	int count;

	final long MOD = 1000000007;

	public void uniquePaths(int row, int col) {

		if (row == n - 1 && col == m - 1) {
			count++;
			System.out.print("(" + row + "," + col + ")-->");
			System.out.println(count);
			return;
		} else {

			if (row < n - 1) {
				System.out.print("(" + row + "," + col + ")-->");

				uniquePaths(row + 1, col);
			}
			if (col < m - 1) {
				System.out.print("(" + row + "," + col + ")-->");

				uniquePaths(row, col + 1);
			}
		}
	}

	public long totalPaths(int row, int col) {
		long count = 0;
		if (row == n - 1 && col == m - 1) {
			count++;
			return 1;
		} else {

			if (mem[row][col] != 0) {
				return mem[row][col];
			}

			if (row < n - 1) {
				count = count + totalPaths(row + 1, col);
			}
			if (col < m - 1) {
				count = count + totalPaths(row, col + 1);
			}
		}
		if (count > MOD)
			count = count % MOD;
		mem[row][col] = count;
		return count;
	}

	public long totalNonDynamicPaths(int row, int col) {
		long count = 0;
		if (row == n - 1 && col == m - 1) {
			count++;
			return 1;
		} else {

			if (row < n - 1) {
				count = count + totalNonDynamicPaths(row + 1, col);
			}
			if (col < m - 1) {
				count = count + totalNonDynamicPaths(row, col + 1);
			}
		}

		return count;
	}

	public void bottomUp() {

	}

}