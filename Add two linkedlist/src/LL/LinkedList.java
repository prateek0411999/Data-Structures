package LL;

public class LinkedList {

	private class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			
		}
	}
	Node head;
	
	public void insert(int data)
	{
		Node node = new Node(data);
		if(head==null)
		{
			head = node;
		}
		else
		{
			Node curr = head;
			while(curr.next!=null)
			{
				curr = curr.next;
			}
			curr.next = node;
		}	
	}
	
	public void show()
	{
		Node n =head;
		while(n.next!=null)
		{
			System.out.print(n.data+" ");
			n = n.next;
		}
		System.out.print(n.data);
	}
	
	public void reverse()
	{
		Node curr, prev=null, temp;
		curr = head;
		while(curr.next!=null)
		{
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		curr.next = prev;
		head = curr;
	}
	public LinkedList add(LinkedList l1, LinkedList l2)
	{
		Node head1, head2, curr1, curr2;
		head1 = l1.head;
		head2 = l2.head;
		LinkedList l3 = new LinkedList();
		/*System.out.println(head1);
		System.out.println(head2);*/
		curr1 = head1;
		curr2 = head2;
		int carry = 0, value=0;
		while(curr1 != null || curr2 != null)
		{
			if(curr1 != null && curr2 != null)
			{
				if(carry==0)
				{
					value = curr1.data + curr2.data;
				}
				else if(carry>0)
				{
					value = curr1.data + curr2.data + carry;
				}		
				if(value>9)
				{
					carry = 1;
					value = value%10;
				}
				else if(value<=9)
				{
					carry = 0;
					value = value%10;
				}
				l3.insert(value);
				curr1 = curr1.next;
				curr2 = curr2.next;
			}
			else if(curr1 == null && curr2 != null)
			{
				if(carry==0)
				{
					value = 0 + curr2.data;
				}
				else if(carry>0)
				{
					value = 0 + curr2.data + carry;
				}		
				if(value>9)
				{
					carry = 1;
					value = value%10;
				}
				else if(value<=9)
				{
					carry = 0;
					value = value%10;
				}
				l3.insert(value);
				//curr1 = curr1.next;
				curr2 = curr2.next;
			}
			else if(curr1 != null && curr2 == null)
			{
				if(carry==0)
				{
					value = curr1.data + 0;
				}
				else if(carry>0)
				{
					value = curr1.data + 0 + carry;
				}		
				if(value>9)
				{
					carry = 1;
					value = value%10;
				}
				else if(value<=9)
				{
					carry = 0;
					value = value%10;
				}
				l3.insert(value);
				curr1 = curr1.next;
				//curr2 = curr2.next;
			}
		}
		if(carry>0)
		{
			l3.insert(carry);
		}
		return l3;
	}
}
