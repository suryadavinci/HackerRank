package datastructures;

class Node {
	int data;
	Node next;
}

public class LinkedList {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		Node head = l.linkLast(null, 1);
		head = l.linkLast(head, 2);
		head = l.linkLast(head, 3);
		head = l.linkLast(head, 4);

		while (head != null) {
			System.out.print(head.data + " \t");
			head = head.next;
		}
		

	}

	//Insert renamed to LinkLast
	Node linkLast(Node head, int data) {
		// This is a "method-only" submission.
		// You only need to complete this method.
		/*
		 * Insert Node at the end of a linked list head pointer input could be
		 * NULL as well for empty list Node is defined as
		 */

		Node tempHead = head;
		if (head == null) {
			head = new Node();
			head.data = data;
			head.next = null;
			return head;
		}

		while (head.next != null) {
			// System.out.print(head.data+" \t");
			head = head.next;

		}

		head.next = new Node();
		head.next.data = data;
		head.next.next = null;

		return tempHead;

	}

}
