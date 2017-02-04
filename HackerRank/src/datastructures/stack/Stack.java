package datastructures.stack;

import java.util.Scanner;

public class Stack {

	public static void main(String[] args) {

		Stack s = new Stack();

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int[] stack = new int[100];

		int iter = 0;
		int oper = 0;
		for (int i = 0; i < n; i++) {
			oper = scanner.nextInt();

			if (oper == 1) {
				stack[iter] = scanner.nextInt();
				System.out.println(stack[iter]);
				iter++;
			} else if (oper == 2) {
				stack[iter] = 0;
				iter--;

			} else if (oper == 3) {
				System.out.println(getMax(stack));
			}
			printStack(stack);
		}

	}

	public static int getMax(int[] stack) {
		int max = 0;
		// for(int i=0;i<oper.length;i++)
		for (int i : stack) {
			if (i > max)
				max = i;

		}

		return max;

	}

	public static void printStack(int[] stack) {
		System.out.println("The stack is");
		for (int i = 0; i < stack.length; i++) {
			// if(stack[i]!=0)
			// System.out.println(stack[i]);
		}

	}
}
