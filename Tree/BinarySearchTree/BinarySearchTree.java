package BST;

class BinarySearchTree {
	
	private Node root;
	
	public boolean find(int data)
	{
		return find(root, data);
	}
	
	private boolean find(Node node, int data)
	{
		if(node.getData()==data)
		{
			return true;
		}
		else
		{
			if(data<node.data)
			{
				if(find(node.left, data))
				{
					return true;
				}
			}
			else if(data>node.data)
			{
				if(find(node.right, data))
				{
					return true;
				}
			}
		}
		return false;
	}
	
	
	public void insert(int data)
	{
		root = insert(root, data);
	}
	
	private Node insert(Node node, int data)
	{
		if(node==null)
		{
			node = new Node(data);
		}
		else
		{
			if(data<node.data)
			{
				node.left = insert(node.getLeft(), data);
			}
			else if(data>node.data)
			{
				node.right = insert(node.getRight(), data);
			}
			else
			{
				return node;
			}
		}
		return node;
	}
	
	public int countNodes()
	{
		return countNodes(root);
	}
	
	private int countNodes(Node node)
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
	
	public boolean isEmpty()
	{
		return isEmpty(root);
	}
	
	
	private boolean isEmpty(Node node)
	{
		if(node==null)
		{
			return true;
		}
		return false;
	}
	
	public void preOrder()
	{
		preOrder(root);
	}
	
	private void preOrder(Node node)
	{
		if(node!=null)
		{
			System.out.print(node.getData() + " ");
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
		if(node!=null)
		{
			postOrder(node.getLeft());
			postOrder(node.getRight());
			System.out.print(node.getData() + " ");
		}
	}
	
	
	
	public void inOrder()
	{
		inOrder(root);
	}
	
	private void inOrder(Node node)
	{
		if(node!=null)
		{
			inOrder(node.getLeft());
			inOrder(node.getRight());
			System.out.print(node.getData() + " ");
		}
	}
	public void delete(int data)
    {
    	Node node = delete(root, data);
    }
    
    private Node delete(Node node, int data)
    {
    	if(node==null)
    	{
    		System.out.println("No such element is present.");
    		return null;
    	}
    	else if(data < node.data)
    	{
    		node.left = delete(node.left, data);
    	}
    	else if(data > node.data)
    	{
    		node.right = delete(node.right, data);
    	}
    	else
    	{
    		if(node.left!=null && node.right!=null)
    		{
    			Node temp = findMax(node.left);
    			node.data = temp.data;
    			node.left = delete(node.left, node.data);
    		}
    		else
    		{
    			if(node.left ==null)
    			{
    				node = node.right;
    			}
    			if(node.right ==null)
    			{
    				node = node.left;
    			}
    		}
    	}
    	return node;
    }
    private Node findMax(Node node)
    {
    	return node.right == null ? node : findMax(node.right);
    }
	
}