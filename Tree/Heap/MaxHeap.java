package Heap;

public class MaxHeap {

	private int Heap[];
	private int size;
	private int maxSize;
	private static int front = 0;
	MaxHeap(int maxSize)
	{
		this.maxSize = maxSize;
        this.size = 0;
        Heap = new int[this.maxSize];
	}
	
	private int parent(int pos)
	{
		return pos/2;
	}
	
	
	private int leftNode(int pos)
	{
		return pos*2;
	}

	
	private int rightNode(int pos)
	{
		return pos*2+1;
	}
	
	private void swap(int val1, int val2)
	{
		int temp = val1;
		val1 = val2;
		val2 = temp;
	}
	
	public void insert(int data)
	{
		Heap[size] = data;
		int current = size;
		while(Heap[current]>Heap[parent(current)])
		{
			swap(Heap[current],Heap[parent(current)]);
			current = parent(current);
		}
		size++;
	}
	
	public void print()
    {
        for (int i = 0; i <= size / 2; i++ )
        {
            System.out.print(" PARENT : " + Heap[i] + " LEFT CHILD : " + Heap[2*i]
                  + " RIGHT CHILD :" + Heap[2 * i  + 1]);
            System.out.println();
        }
    }
	
	private boolean isLeaf(int pos)
	{
		if(pos == size/2)
		{
			return true;
		}
		return false;
	}
	
	private void heapify(int pos)
	{
		if(!isLeaf(pos))
		{
			if(Heap[pos]<Heap[leftNode(pos)] || Heap[pos]<Heap[rightNode(pos)])
			{
				if(Heap[leftNode(pos)]<Heap[rightNode(pos)])
				{
					swap(Heap[pos], Heap[rightNode(pos)]);
					heapify(rightNode(pos));
				}
				else
				{
					swap(Heap[pos], Heap[leftNode(pos)]);
					heapify(leftNode(pos));
				}
			}
			
		}
		
	}
	
	public int remove()
	{
		int popped = Heap[front];
		swap(Heap[front],Heap[size]);
		size--;
		heapify(front);
		return popped;
	}
	
	public static void main(String[] args) {
		 	System.out.println("The Max Heap is ");
	        MaxHeap maxHeap = new MaxHeap(15);
	        maxHeap.insert(5);
	        maxHeap.insert(3);
	        maxHeap.insert(17);
	        maxHeap.insert(10);
	        maxHeap.insert(84);
	        maxHeap.insert(19);
	        maxHeap.insert(6);
	        maxHeap.insert(22);
	        maxHeap.insert(9);
	        maxHeap.print();
	        System.out.println("Removed element is " + maxHeap.remove());
	        System.out.println("The Max Heap is ");
	        maxHeap.print();
		

	}

}