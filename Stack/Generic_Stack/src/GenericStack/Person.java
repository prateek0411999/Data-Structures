package GenericStack;

public class Person {
	
	private String name;
	private int rollNo;
	public Person(String name, int rollNo)
	{
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public String toString()
	{
		return "Name : " + this.name + " RollNo : " + this.rollNo;
	}

}