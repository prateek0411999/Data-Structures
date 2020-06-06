package BinaryTree;

public class Node {
	Node left, right;
	int data;
	Node(int data)
	{
		this.data = data;
	}
	
	public Node getLeft()
	{
		return left;
	}
	
	public Node getRight()
	{
		return right;
	}
	
	public int getData()
	{
		return data;
	}

}