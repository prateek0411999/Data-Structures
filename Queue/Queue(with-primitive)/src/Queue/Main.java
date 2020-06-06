package Queue;

public class Main {
	public static void main(String args[])
	{
		queue q1= new queue(5);
		System.out.println(q1.insert(5));
		System.out.println(q1.insert(6));
		System.out.println(q1.insert(7));
		System.out.println(q1.insert(8));
		System.out.println(q1.insert(10));
		System.out.println(q1.insert(9));
		System.out.println(q1.delete());
		System.out.println(q1.delete());
		System.out.println(q1.delete());
		System.out.println(q1.delete());
		System.out.println(q1.delete());
		System.out.println(q1.delete());
	}


}
