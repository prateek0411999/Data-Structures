package ObjectStack;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person("Prateek","11702169");
		Person person2 = new Person("Ankit","11713454");
		Person person3 = new Person("Manik","11706498");
		
		Stack stack = new Stack();
		stack.push(person1);
		stack.push(person2);
		stack.push(person3);
		
		System.out.println(stack.pop());
	}

}