
public class Linked {
	
	Node top;
	private class Node{
		int data;
		Node link;
		Node(int data)
		{
			this.data=data;
		}
	}

	 public void push(int item) {
		// TODO Auto-generated method stub
		Node node=new Node(item);
		if(top==null)
		{
			top=node;
			node.link=null;
		}
		else {
			node.link=top;
			top=node;
		}
	}

	public void pop() {
		// TODO Auto-generated method stub
		if(!underFlow())
		{
			top=top.link;
			
		}
		else
		{
			System.out.println("No element is present");
			
		}
		
		
	}

	private boolean underFlow() {
		// TODO Auto-generated method stub
		if(top.link ==null)
		{
			return true;
		}
		else
		{
		return false;
		}
	}

	public void print() {
		// TODO Auto-generated method stub
		Node curr;
		curr=top;
		while(curr.link!=null)
		{
			System.out.print(curr.data+", ");
			curr=curr.link;
			
		}
		System.out.println(curr.data);
		
	}

	public void findMin() {
		// TODO Auto-generated method stub
		Node curr;
		curr=top;
		int minValue=top.data;
		while(curr.link!=null)
		{
			if(minValue >=curr.data)
			{
				minValue=curr.data;
				
			}
			curr=curr.link;
		}
		if(minValue >= curr.data)
		{
			minValue = curr.data;
		}
		System.out.println("Minimum Value in the Stack is "+minValue);
	}


	void findMax()
	{
		Node curr;
		curr = top;
		int maxValue = top.data;
		while(curr.link!=null)
		{
			if(maxValue <= curr.data)
			{
				maxValue = curr.data;
			}
			curr = curr.link;
		}
		if(maxValue <= curr.data)
		{
			maxValue = curr.data;
		}
		System.out.println("Maximum Value in the Stack is "+maxValue);
	}
}

	
	
	
	


