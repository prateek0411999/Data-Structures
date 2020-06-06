package LL;
import java.util.*;
import java.io.*;

public class AddTwoLL {
	
	public static void main(String args[])
	{
		LinkedList l1=new LinkedList();
		LinkedList l2=new LinkedList();
		Scanner sc=new Scanner(System.in);
		
		int choice;
		int index=1, data;
		do
		{
			boolean flag = true;
			System.out.println("Enter elements of "+index+" Linked List.");
			do{
				System.out.println();
				System.out.println("1. To insert");
				System.out.println("2. To print");
				System.out.println("3. To Exit");
				System.out.println("Enter Choice");
				choice = sc.nextInt();
				switch(choice)
				{
					case 1:
						if(index==1)
						{
							data = sc.nextInt();
							l1.insert(data);
						}
						else if(index==2)
						{
							data = sc.nextInt();
							l2.insert(data);
						}
						break;
					case 2:
						if(index==1)
						{
							l1.show();
						}
						else if(index==2)
						{
							l2.show();
						}
						break;
					case 3:
						flag = false;
						break;
				}
			}while(flag!=false);
			index++;
		}while(index<=2);
		
		l1.reverse();
		l2.reverse();
		LinkedList l3 = new LinkedList();
		l3 = l3.add(l1,l2);
		l3.reverse();
		System.out.println("Result is ");
		l3.show();
	}

}