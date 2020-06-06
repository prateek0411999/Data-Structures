package GenericStack;
import java.util.Arrays;



public class Stack<T> {

	
	private T[] stack;  //for storing the size of stack
	private int top;
	private int size;
	
	@SuppressWarnings("unchecked")
	public Stack()
	{
		
		top = -1;
		size = 5;
		stack = (T[])new Object[size];
		
	}
	@SuppressWarnings("unchecked")
	public Stack(int size)
	{
		top = -1;
		this.size = size;
		stack = (T[])new Object[this.size];	
	}
	
	public boolean push(T item)
	{
		if(!overflow())
		{
			++top;
			stack[top] = item;
			return true;
		} else {
			makeDynamicArray();
			top++;
			stack[top] = item;
			return true;
		}
	}
	public boolean overflow()
	{
		return (top == stack.length-1);
	}
	 void makeDynamicArray()
	 {	 
		 T[] temp = Arrays.copyOf(stack, stack.length*2);
		 stack = temp.clone();
	 }	
	public T pop()
	{
		if(!underflow()){
			return stack[top--];
		} else {
			return null;
		}	
	}
	public boolean underflow(){
		return (top==-1);
	}
	
	public int capacity()
	{
		return this.size;
	}
	public int size()
	{
		return top+1;
	}
}