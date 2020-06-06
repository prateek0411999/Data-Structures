package DQ;


public class Dequeue {

	private int front;
	private int rear;
	private int a[];
	private int size;

	public Dequeue() {
		front = -1;
		rear = -1;
		size = 10;
		a = new int[size];

	}

	public Dequeue(int size) {
		front = -1;
		rear = -1;
		this.size = size;
		a = new int[size];

	}

	public void insertF(int value) {
		if (overflow())
			System.out.println("overflow");
		else 
		{
			if (front == -1) 
			{
				front = 0;
				rear = 0;

			} 
			else if (front == 0)
			{
				front = a.length - 1;
			} 
			else
				front--;
			a[front] = value;
		}
	}

	public boolean overflow() {
		if ((front == 0 && rear == a.length - 1) || front == rear + 1) {
			return true;

		} else
			return false;
	}

	public void insertR(int value) {
		if (!overflow()) {
			if (front == -1) {
				front = 0;
				rear = 0;
			} else if (rear == a.length - 1)
				rear = 0;
			else
				rear++;
			a[rear] = value;
		} else
			System.out.println("overflow");
	}

	public void print() {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public void deleteF() {
		if (isEmpty())
			System.out.println("Empty!");
		else {
			if (front == rear) {
				front = -1;
				rear = -1;
			} else if (front == a.length - 1)
				front = 0;
			else
				front++;
		}

	}

	public void deleteR() {
		if (isEmpty())
			System.out.println("Empty!");
		else {
			if (front == rear) {
				front = -1;
				rear = -1;
			} else if (rear == 0)
				rear = a.length - 1;
			else
				rear--;
		}

	}

	public boolean isEmpty() {
		int s = 0;
		for (int i = 0; i < a.length; i++) {
			s += a[i];
		}
		if (s == 0)
			return true;
		else
			return false;
	}

	public static void main(String args[]) {
		Dequeue d = new Dequeue();
		d.insertF(4);
		d.insertR(5);
		d.insertF(1);
		d.insertR(6);
		d.insertF(11);
		d.insertF(7);
		d.insertF(8);
		d.insertF(9);
		d.insertR(5);
		d.insertR(5);
		d.deleteF();
		d.insertR(5);
		// d.deleteF();
		d.print();
	}
}