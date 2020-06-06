package ObjectStack;

public class Stack {

	
	private Person[] stack;  //for storing the size of stack
	private int top;
	private int size;
	
	public Stack()
	{
		top = -1;
		size = 50;
		stack = new Person[50];
		
	}
	public Stack(int size)
	{
		top = -1;
		this.size = 50;
		stack = new Person[this.size];	
	}
	
	public void push(Person item)
	{
		if(!isFull())
		{
			top++;
			stack[top] = item;
			System.out.println("Inserted");
		} else {
			System.out.println("Not able to insert");
		}
	}
	
	public boolean isFull()
	{
		return (top == stack.length-1);
	}
	
	
	public Person pop()
	{
		if(!isEmpty()){
			return stack[top--];
		} else {
			return null;
		}
		
	}
	
	public boolean isEmpty(){
		return (top==-1);
	}
	
	
	
	
}