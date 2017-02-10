package datastructures.tree;

import java.util.Arrays;

public class BinaryHeap {

	//static BinaryHeap beap;

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

		BinaryHeap beap = new BinaryHeap(30);

		for (int i = 1; i < 8; i++) {
			beap.insert(i);
			beap.displayHeap();
		}

			
		beap.levelOrder();

	}

	
	private void levelOrder() {
		int newLevel=0;
		int i=0;
		 
		while(i<heapSize){
			System.out.print(heap[i]+" ");
			if(i==newLevel){
			newLevel=i*2+2;
			System.out.println();
			}
			i++;

		}
	}
	
	private void displayHeap() {

		System.out.println("====================================================");
		for (int i = 0; i < heapSize; i++)
			System.out.print(heap[i] + " | ");
		System.out.println();
		System.out.println("====================================================");

	}

	private int parent(int index) {
		return (index % 2 == 1) ? (index - 1) / 2 : (index - 2) / 2;
	}

	private void insert(int data) {

		heap[heapSize++] = data;
		heapifyUp(heapSize - 1);

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

	private int kthChild(int n, int m) {
		return d * n + m;
	}

	private void delete(int ind) {
		heap[ind] = heap[heapSize - 1];
		heapSize--;

		heapifyDown(ind);

	}

	private void heapifyDown(int ind) {
		int child;
		int tmp = heap[ind];

		while (kthChild(ind, 1) < heapSize) {

			child = maxChild(ind);
			System.out.println("max child of " + heap[ind] + " is" + heap[child]);

			if (tmp < heap[child]) {

				swap(ind, child);

				ind = child;
			} else
				break;

		}

	}

	private int maxChild(int parent) {

		System.out.println("parent " + parent);
		int lChild = kthChild(parent, 1);
		int rChild = kthChild(parent, 2);

		displayHeap();
		System.out.println(heap[parent] + " l child  " + heap[lChild] + " r child  " + heap[rChild]);
		if (heap[lChild] > heap[rChild])
			return lChild;
		else
			return rChild;

	}

}
