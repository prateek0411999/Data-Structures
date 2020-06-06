package LinearS;
import java.util.*;

public class LinearSearch {
	
		public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of values you want to enter");
		int n = sc.nextInt();
		int arr[] = new int [n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}	
		System.out.println("Enter value to search");
		int num = sc.nextInt();
		System.out.println(search(arr, num));
	}
	static public String search(int arr[], int num)
	{	
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				return "No found at " + i + " position.";
			}
		}	
		return "Not Present";
	}
}