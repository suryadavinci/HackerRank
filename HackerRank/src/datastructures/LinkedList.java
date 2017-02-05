package datastructures;

class Node {
	int data;
	Node next;
}

public class LinkedList {

	private Node head;
	public static void main(String[] args) {

		LinkedList a = new LinkedList();

		LinkedList b = new LinkedList();

		a.linkLast(1);
		a.linkLast(3);
		a.linkLast(5);
		a.linkLast(6);
		

		b.linkLast(2);
		b.linkLast(4);
		b.linkLast(7);

		Node output=mergeLists(a.head,b.head);
		
		
		a.linkNth(100, 2);
		
		System.out.println("sorted 0" + LinkedList.toString(output));

		System.out.println(LinkedList.toString(a.head));
		a.delete(0);

		System.out.println(LinkedList.toString(a.head));
		
		a.linkFirst(0);

		System.out.println(LinkedList.toString(a.head));
}

	
	
	
	
	

static Node mergeLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method 
   
   Node output = new Node();
   Node temp=output;
   while(headA!=null || headB!=null)
   {
     //  System.out.println("Comparing headA vs headB "+headA.data+" "+headB.data );
       if((headB==null ) || ( headA!=null && headA.data<=headB.data))
           {
           //System.out.println("headA is low "+headA.data+" "+headB.data  );
           temp.data=headA.data;
           headA=headA.next;
           //printList(output);
       }
       else 
       {
           //System.out.println("headB is low "+headA.data+" "+headB.data );
           temp.data=headB.data;
           headB=headB.next;
           //printList(output);
       }
       if(headA!=null || headB!=null)
       temp.next=new Node();
           temp=temp.next;
       //printList(output);
         
   }
   
     
   
   //printList(output);
   return output;


}

static void printList(Node root)
    
    {
    System.out.println("Output Data");
    if(root!=null)
        {
        
        System.out.print(root.data+" ");
        root=root.next;
    }
    System.out.println();
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
	Node linkLast( int data) {
		// This is a "method-only" submission.
		// You only need to complete this method.
		/*
		 * Insert Node at the end of a linked list head pointer input could be
		 * NULL as well for empty list Node is defined as
		 */

		//Node head=this.head;
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
		this.head=tempHead;
		return tempHead;

	}

	Node linkFirst( int x) {

		//Node head=this.head;

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
		this.head=head;
		return head;

	}

	Node linkNth( int data, int position) {
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
		this.head=tempHead;
		return tempHead;

	}

	void delete( int position) {
		// Complete this method
		Node tempHead=head;

		if (position == 0) {
				
			head =  head.next;
			return;
		}

		for (int i = 0; i < position - 1; i++)
			tempHead = tempHead.next;

		tempHead.next = tempHead.next.next;


	}

	void reversePrint() {
		// This is a "method-only" submission.
		// You only need to complete this method.
		Node head=this.head;
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

	Node reverse() {

		Node head=this.head;
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
}

	
