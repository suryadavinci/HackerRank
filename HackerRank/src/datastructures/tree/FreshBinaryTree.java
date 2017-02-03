package datastructures.tree;

public class FreshBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node root = null;
		
		
		root=BinaryTree.Insert(root, 20);
		System.out.println(root.data);
		
		BinaryTree.Insert(root, 10);
		BinaryTree.Insert(root, 30);
		
		inOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		
	}

	
	public static void preOrder(Node root)
	{
		
		if(root!=null)
		{

			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
		
		
	}
	
	public static void inOrder(Node root)
	{
		
		if(root!=null)
		{
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
		
		
	}
	
	
	
	
}
