
package stackLL;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		int choice;
		do
		{
			System.out.println("1. Push Element");
			System.out.println("2. Pop Element");
			System.out.println("3. Print");
			System.out.println("4. Min Element in Stack");
			System.out.println("5. Max Element in Stack");
			System.out.println("9. Exit");
			choice = sc.nextInt();			
			switch(choice)
			{
			case 1:
				int item = sc.nextInt();
				list.push(item);
				break;
			case 2:
				list.pop();
				break;
			case 3:
				list.print();
				break;
			case 4:
				list.findMin();
				break;
			case 5:
				list.findMax();
				break;
			case 9:
				System.out.println("Bye Bye");
				break;	
			}
		
		}while(choice!=9);
	}

}