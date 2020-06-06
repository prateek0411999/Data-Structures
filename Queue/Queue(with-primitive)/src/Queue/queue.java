package Queue;

public class queue {
	
	private int [] q;
	private int size;
	//private int total;
	private int front;
	private int rear;

	public queue(int size)
	{
		this.size = size;
		//total = 0;
		front = -1;
		rear = -1;
		q = new int [this.size];
	}
	
	public boolean underFlow() {
		return (front>rear);
	}
	public boolean overFlow() {
		return (rear==(q.length -1));
		
	}
	
	public boolean insert(int item)
	{
		if(!overFlow())
		{
			q[++rear]=item;
			if(rear==0)
			{
				front++;
			}
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public int delete()
	{
		if(!underFlow())
		{
			int item;
			item=q[front++];
			return item;
		}
		else
		{
			return -1;
		}
	}
}
