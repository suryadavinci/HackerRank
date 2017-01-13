package datastructures;

class Node {
	int data;
	Node next;
}

public class LinkedList {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();

		// head=l.linkFirst(null, 2);

		Node head1 = l.linkFirst(null, 1);
		head1 = l.linkLast(head1, 3);
		head1 = l.linkLast(head1, 5);
		//head1 = l.linkLast(head1, 6);

		Node head2 = l.linkFirst(null, 2);
		head2 = l.linkLast(head2, 4);
		//head2 = l.linkLast(head2, 4);
		//head2 = l.linkLast(head2, 8);

		Node headSorted = null;

		// Node headSorted=l.mergeLists(head1, head2);

		headSorted = l.mergeLists(head1, head2);

		System.out.println("sorted 0" + LinkedList.toString(headSorted));

		
	}

	public static String toString(Node head) {

		StringBuilder out = new StringBuilder("{\t");

		while (head != null) {
			out = out.append(head.data).append("\t");
			head = head.next;
		}

		out = out.append("}");
		return out.toString();

	}

	// Insert renamed to LinkLast
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

	Node linkFirst(Node head, int x) {

		Node tempHead = head;

		if (head == null) {
			head = new Node();
			head.data = x;
			head.next = null;
			return head;
		}

		head = new Node();
		head.next = tempHead;
		head.data = x;

		return head;

	}

	Node linkNth(Node head, int data, int position) {
		// This is a "method-only" submission.
		// You only need to complete this method.

		Node tempHead = head;
		if (head == null) {
			head = new Node();
			head.data = data;
			head.next = null;
			return head;
		}

		for (int i = 0; i < position - 1; i++) {
			// System.out.println(head.data);
			head = head.next;

		}

		if (position != 0) {
			Node current = head.next;
			// System.out.println("curent "+current.data);
			head.next = new Node();
			head.next.data = data;
			head.next.next = current;
		} else {
			Node current = head;
			// System.out.println("curent "+current.data);
			head = new Node();
			head.data = data;
			head.next = current;
			return head;
		}

		return tempHead;

	}

	Node delete(Node head, int position) {
		// Complete this method
		Node tempHead = head;

		if (position == 0) {
			tempHead = head.next;
			head = null;
			return tempHead;
		}

		for (int i = 0; i < position - 1; i++)
			head = head.next;

		head.next = head.next.next;

		return tempHead;

	}

	void reversePrint(Node head) {
		// This is a "method-only" submission.
		// You only need to complete this method.
		Node tempHead = head;
		int count = 0;
		while (head != null) {
			count++;
			head = head.next;
		}

		int[] listToArray = new int[count];

		for (int i = 0; i < count; i++) {
			listToArray[i] = tempHead.data;
			tempHead = tempHead.next;

		}
		for (int i = count - 1; i >= 0; i--) {
			System.out.println(listToArray[i]);
		}

	}

	Node reverse(Node head) {

		Node tempHead = head;

		int count = 0;

		while (head != null) {
			count++;
			head = head.next;
		}

		int[] listToArray = new int[count];

		for (int i = 0; i < count; i++) {
			listToArray[i] = tempHead.data;
			tempHead = tempHead.next;
		}

		head = null;

		Node tail = null;
		for (int i = count - 1; i >= 0; i--) {
			if (head == null) {
				head = new Node();
				head.data = listToArray[i];
				tail = head;

			} else {
				tail.next = new Node();
				tail.next.data = listToArray[i];
				tail = tail.next;
			}

		}

		return head;

	}

	int compareLists(Node headA, Node headB) {
		// This is a "method-only" submission.
		// You only need to complete this method
		headA = null;

		System.out.println(headA != null);

		// System.out.println(headA.data);
		while (headA.data == headB.data) {

			headA = headA.next;
			headB = headB.next;
			System.out.println("hello");

			if ((headA == headB) && headA == null) {
				return 1;

			}

			if (headA.data != headB.data) {
				return 0;
			}
		}

		return 1;

	}

	Node mergeLists(Node headA, Node headB) {

		// This is a "method-only" submission.
		// You only need to complete this method
		Node l1Head = headA;
		Node l1 = headA;
		Node l2 = headB;

		Node l1Prev = null;
		Node temp = null;

		if (l1 == null) {
			l1 = l2;
			return l1;
		}
		if (l2 == null) {

			// l1.next=l2;
			return l1;
		}

		while (l1 != null || l2 != null) {

			if (l1 == null) {
				l1 = l2;
				break;
			}
			if (l2 == null) {

				// l1.next=l2;
				break;
			}

			System.out.println("Comparing "+l1.data+" "+l2.data );
			if (l1.data < l2.data || l1.data == l2.data) {
				l1Prev = l1;
				l1 = l1.next;
				System.out.println("what happens here");
				if(l2.next==null)
					{
					l1.next=l2;
					break;
					}
				
				if(l1.next==null)
				{
				l1.next=l2;
				break;
				}
				
				
				
			} else if (l1.data > l2.data) {
				System.out.println("what happens second");
				temp = l2.next;
				if (l1Prev != null) {
					l1Prev.next = l2;

				} else {
					headA = l2;

				}

				l1Prev = l2;
				l2.next = l1;
				l2 = temp;

			}

			//System.out.println(LinkedList.toString(headA));

		}

		return headA;

	}
	
	
	Node mergeLists2(Node headA, Node headB) {

		Node l1=headA;
		Node l2=headB;
		Node temp=null;
		
		Node l1Prev=null;
		Node head=headA;
		
		
			while(l2!=null)
			{
				if(l1.data>l2.data)
				{	
					temp=l2.next;
					if(l1Prev==null)
					{
						l1Prev=l2;
						head=l2;
					}
					else
					{
						l1Prev.next=l2;
					}
					
					l2.next=l1;
					l2=temp;
					
				}
				else if(l1.data<l2.data)
				{
					l1=l1.next;
					
				}
				
				
				
				
			}
			
		
		return headB;
	
}








}























