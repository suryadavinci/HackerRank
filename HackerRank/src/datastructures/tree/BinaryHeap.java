package datastructures.tree;

import java.util.Arrays;

public class BinaryHeap {

	static BinaryHeap beap;

	private int d = 2;
	private int[] heap;
	private int heapSize;

	BinaryHeap(int capacity) {
		heapSize = 0;
		heap = new int[capacity + 1];
		Arrays.fill(heap, -1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		beap = new BinaryHeap(30);

		for (int i = 1; i < 8; i++) {
			beap.insert(i);
			beap.displayHeap();
		}

		beap.displayHeap();

	}

	private void displayHeap() {

		System.out
				.println("====================================================");
		for (int i = 0; i < heapSize; i++)
			System.out.print(heap[i] + " | ");
		System.out.println();
		System.out
				.println("====================================================");

	}

	private int parent(int index) {
		return (index % 2 == 1) ? (index - 1) / 2 : (index - 2) / 2;
	}

	private void insert(int data) {

		heap[heapSize++] = data;
		heapifyUp(heapSize - 1);

		/*
		 * if(heapSize==0) { heap[0]=data; heapSize++;
		 * 
		 * //displayHeap();
		 * 
		 * } else {
		 * 
		 * heap[heapSize]=data; heapSize++; int childInd=heapSize-1;
		 * 
		 * int parent=parent(swapIter);
		 * 
		 * while(parent>-1 && heap[parent]<heap[swapIter] ) {
		 * 
		 * swap(parent,swapIter); swapIter=parent;
		 * parent=(swapIter%2==1)?(swapIter-1)/2:(swapIter-2)/2; }
		 * 
		 * }
		 */

	}

	private void heapifyUp(int childInd) {
		int temp = heap[childInd];
		while (childInd > 0 && temp > heap[parent(childInd)]) {
			heap[childInd] = heap[parent(childInd)];
			childInd = parent(childInd);
		}

		heap[childInd] = temp;
	}

	private void swap(int i, int j) {

		// System.out.println("swapping "+heap[i]+" "+heap[j]+" "+i+" "+j);
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;

	}

}
