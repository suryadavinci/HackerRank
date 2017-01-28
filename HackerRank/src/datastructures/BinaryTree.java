package datastructures;

public class BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode tree= createSampleBinaryTree();
		
		System.out.println("\nPreorder");
		preOrder(tree);
		
		System.out.println("\nPostorder");
		postOrder(tree);

		System.out.println("\nInorder");
		inOrder(tree);

	}
	
	public static int getHeight(BinaryTreeNode root)
	{
		int height =0;
		while(root.left!=null | root.right!=null)
		
		{
			if(root.left!=null)
			root=root.left;
			else if(root.right!=null)
			root=root.right;
			height++;
			
			
		}
		
		return 0;
	}
	
	
	public static void preOrder(BinaryTreeNode root)
	{
		
		if(root!=null)
		{
			System.out.print(root.data+" \t");
			preOrder(root.left);
			preOrder(root.right);
			
		}
		
		
	}
	
	public static void postOrder(BinaryTreeNode root)
	{
		
		if(root!=null)
		{
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" \t");

			
		}
		
		
	}
	
	public static void inOrder(BinaryTreeNode root)
	{
		
		if(root!=null)
		{
			inOrder(root.left);
			System.out.print(root.data+" \t");
			inOrder(root.right);
			

			
		}
		
		
	}	
	
	public static BinaryTreeNode createSampleBinaryTree()
	{
		
		
		
		
		BinaryTreeNode node000=new BinaryTreeNode(null,null,1);
		BinaryTreeNode node001=new BinaryTreeNode(null,null,4);
		BinaryTreeNode node010=new BinaryTreeNode(null,null,6);
		
		
		BinaryTreeNode node00=new BinaryTreeNode(node000,node001,5);
		BinaryTreeNode node01=new BinaryTreeNode(node010,null,2);

		BinaryTreeNode node0=new BinaryTreeNode(node00,node01,3);
		return node0;
		
	}

}


class BinaryTreeNode
{
	BinaryTreeNode left;
	BinaryTreeNode right;
	int data;
	
	
	BinaryTreeNode(BinaryTreeNode left,	BinaryTreeNode right,	int data)
	{
		this.left=left;
		this.right=right;
		this.data=data;
		
	}
	
	
	
	
}