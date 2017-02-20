package challenges.projecteuler;

import java.math.BigInteger;

public class Problem172NumbersWithFewRepeatedDigits {

	int totalCount = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem172NumbersWithFewRepeatedDigits solution = new Problem172NumbersWithFewRepeatedDigits();

		solution.numbersWithFewRepeatedDigits(4, 3);

		solution.numbersWithFewRepeatedDigits(18, 3);

		System.out.println("total Count " + solution.totalCount);

	}

	public void numbersWithFewRepeatedDigits(int k, int n) {

		BigInteger start = new BigInteger("10").pow(k - 1);
		BigInteger end = new BigInteger("10").pow(k);
		BigInteger iterator;

		BigInteger total = end.subtract(start);
		System.out.println(start + " " + end + " " + total);

		iterator = start;
		int compare = iterator.compareTo(end);
		while (compare == -1) {

			numberCounts(iterator, n);

			iterator = iterator.add(BigInteger.ONE);
			compare = iterator.compareTo(end);
		}

		BigInteger solution = total.subtract(BigInteger.valueOf(totalCount));
		System.out.println("total " + total + " total count " + totalCount);

	}

	public void numberCounts(BigInteger num, int n) {
		for (int i = 0; i <= 9; i++) {
			if (countOfiInNumber(i, num) > n) {
				// System.out.println("count of "+i+" in "+num+" "+n);
				totalCount++;
			}
		}
	}

	public int countOfiInNumber(int digit, BigInteger num) {

		String numToString = num.toString();

		int count = 0;

		for (int i = 0; i < numToString.length(); i++) {
			if (numToString.charAt(i) == (char) digit + 48)
				count++;

		}

		return count;

	}

}