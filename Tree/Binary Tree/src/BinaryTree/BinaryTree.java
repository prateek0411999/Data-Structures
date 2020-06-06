package BinaryTree;


public class BinaryTree {

	private Node root;
	
	
	public void insert(int data)
	{
		root = insert(root, data);
	}
	
	
	public Node insert(Node node, int data)
	{
		if(node==null)
		{
			node = new Node(data);
		}
		else
		{
			if(node.getLeft()==null)
			{
				node.left = insert(node.left, data);
			}
			else
			{
				node.right = insert(node.right, data);
			}
		}
		return node;
	}
	
	
	public int countNodes()
	{
		return countNodes(root);
	}
	
	
	public int countNodes(Node node)
	{
		if(node==null)
		{
			return 0;
		}
		else
		{
			int i = 1;
			i += countNodes(node.getLeft());
			i += countNodes(node.getRight());
			return i;
		}
	}
	
	
	public boolean search(int data)
	{
		return search(root, data);
	}
	
	
	private boolean search(Node node, int data)
	{
		if(node.getData()==data)
		{
			return true;
		}
		if(node.getLeft() != null)
		{
			if(search(node.getLeft(), data))
			{
				return true;
			}
		}
		if(node.getRight() != null)
		{
			if(search(node.getRight(), data))
			{
				return true;
			}
		}
		return false;
	}
	
	
	public void preOrder()
    {
        preOrder(root);
    }
	
	
    private void preOrder(Node node)
    {
        if (node != null)
        {
            System.out.print(node.getData() +" ");
            preOrder(node.getLeft());             
            preOrder(node.getRight());
        }
    }
    
    
    public void postOrder()
    {
        postOrder(root);
    }
	
	
    private void postOrder(Node node)
    {
        if (node != null)
        {
            postOrder(node.getLeft());             
            postOrder(node.getRight());
            System.out.print(node.getData() +" ");
        }
    }
    
    
    public void inOrder()
    {
        inOrder(root);
    }
	
	
    private void inOrder(Node node)
    {
        if (node != null)
        {
            inOrder(node.getLeft());
            System.out.print(node.getData() +" ");
            inOrder(node.getRight());
        }
    }

    public boolean isEmpty()
    {
        return root == null;
    }
    
    
    
    
}