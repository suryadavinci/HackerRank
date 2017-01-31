package datastructures.tree;

class Node {

	Node left;
	Node right;
	int data;

}

public class BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node root = new Node();
		root.data = 4;
		Node source = root;

		Insert(root, 2);
		Insert(root, 7);
		Insert(root, 1);
		Insert(root, 3);
		Insert(root, 6);
		// System.out.println();

		// System.out.println(checkBST(root));

		System.out.println(checkBST(root));

		Node node1 = new Node();
		Node node2 = new Node();
		Node node3 = new Node();
		Node node4 = new Node();
		Node node5 = new Node();
		Node node6 = new Node();
		Node node7 = new Node();

		node1.data = 5;
		node2.data = 2;
		node3.data = 6;
		node4.data = 1;
		node5.data = 3;
		node6.data = 4;
		node7.data = 7;

		node1.left = node2;
		node1.right = node3;

		node2.left = node4;
		node2.right = node5;

		node3.left = node6;
		node3.right = node7;

		// inOrder(node1);
		// System.out.println();
		// preOrder(node1);
		System.out.println(checkBST(node1));

	}

	static Node lca(Node root, int v1, int v2) {
		if (root.data > v1 & root.data > v2) {
			while (root.data > v1 & root.data > v2) {
				root = root.left;
			}
			return root;
		} else if (root.data < v1 & root.data < v2) {
			while (root.data < v1 & root.data < v2)

			{
				root = root.right;
			}
			return root;
		} else
			return root;

	}

	void decode(String S, Node root) {

		int i = 0;
		Node source = root;
		// System.out.println(S.length());
		while (i < S.length()) {
			// System.out.println(S.substring(i,i+1));

			if (S.substring(i, i + 1).equals("0")) {
				root = root.left;

			} else {
				root = root.right;
			}

			if (root.data != 0) {
				System.out.print(root.data);
				root = source;
			}
			i++;
		}

	}

	static int prevData = 0;
	static boolean output = true;

	static boolean checkBST(Node root) {

		if (root != null) {
			checkBST(root.left);
			// System.out.println(root.data+" "+prevData);

			if (prevData >= root.data) {
				output = false;

			}
			prevData = root.data;
			checkBST(root.right);

		}

		return output;

	}

	static void preOrder(Node root) {

		if (root != null) {
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}

	}

	static void postOrder(Node root) {

		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}

	}

	static void inOrder(Node root) {

		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);

		}

	}

	static Node Insert(Node root, int value) {
		Node source = root;

		if (root.data <= value) {
			insertRight(root, value);
		} else {
			insertLeft(root, value);
		}

		return source;

	}

	static void insertRight(Node root, int value) {
		if (root.right == null) {
			root.right = new Node();
			root.right.data = value;
			return;
		} else {
			if (root.right.data <= value)
				insertRight(root.right, value);
			else
				insertLeft(root.right, value);

		}

	}

	static void insertLeft(Node root, int value) {
		if (root.left == null) {
			root.left = new Node();
			root.left.data = value;
			return;
		} else {
			if (root.left.data <= value)
				insertRight(root.left, value);
			else
				insertLeft(root.left, value);

		}

	}

}
