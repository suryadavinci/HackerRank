package datastructures.tree;

class Node {

	Node left;
	Node right;
	int data;

}

public class BinaryTree {

	private static int minValue = 1000;
	private static int maxValue;
	private static int maxHeight = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node root = new Node();
		root.data = 5;
		Node source = root;

		/*Insert(root, 2);
		Insert(root, 7);
		Insert(root, 1);
		Insert(root, 3);
		Insert(root, 6);
		Insert(root, 8);
		Insert(root, 4);
		
		
		
		/*
		 * Insert(root, 9); Insert(root, 10); Insert(root, 11);
		 */

		inOrder(root);
		System.out.println();

		getHeight(root);
		// System.out.println();

		// System.out.println(checkBST(root));

		/*
		 * inOrder(root); setMinMax(root.left); System.out.println();
		 * System.out.println(minValue); System.out.println(maxValue);
		 * setMaxHeight(root.left); System.out.println("maxHeight "+maxHeight);
		 * 
		 * 
		 * System.out.println("root right data"+root.right.data); minValue=1000;
		 * setMinMax(root.right); System.out.println();
		 * System.out.println(minValue); System.out.println(maxValue);
		 * 
		 * setMaxHeight(root.right); System.out.println(maxHeight);
		 */

	}

	static int traverseHeight(Node root, String dir) {
		int height = 0;
		if (dir == "l") {
			while (root != null) {
				height++;
				root = root.left;
			}

		}

		if (dir == "r") {
			while (root != null) {
				height++;
				root = root.right;
			}
		}
		return height;

	}

	static void getHeight(Node root) {
		int maxHeight = 0, height = 0;
		Node source = root;

		// left traversal for left tree
		root = source.left;
		height = 0;

		height = traverseHeight(root, "l");
		if (height > maxHeight)
			maxHeight = height;

		System.out.println("height of left left " + height);

		root = source.left;
		height = 0;
		height = traverseHeight(root, "r");

		if (height > maxHeight)
			maxHeight = height;

		System.out.println("height of left right " + height);

		root = source.right;
		height = 0;
		height = traverseHeight(root, "l");

		if (height > maxHeight)
			maxHeight = height;

		System.out.println("height of right left " + height);

		root = source.right;
		height = 0;
		height = traverseHeight(root, "r");

		if (height > maxHeight)
			maxHeight = height;
		System.out.println("height of right right " + height);

		System.out.println(maxHeight);

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

	static void setMaxHeight(Node root) {
		int height = 0;
		Node source = root;
		while (root != null) {
			height++;
			root = root.left;
			System.out.println("height value inside left loop" + height);

		}

		if (height > maxHeight) {
			System.out.println("setting height to " + height + " for min");
			maxHeight = height;
		}

		height = 0;
		root = source;
		while (root != null) {
			height++;
			System.out.println("height value inside right loop" + height);
			root = root.right;

		}
		if (height > maxHeight) {
			maxHeight = height;
			System.out.println("setting height to " + height + " for max");
		}

	}

	static void setMinMax(Node root) {

		if (root != null) {
			setMinMax(root.left);
			if (minValue > root.data)
				minValue = root.data;
			if (maxValue < root.data)
				maxValue = root.data;

			setMinMax(root.right);

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
