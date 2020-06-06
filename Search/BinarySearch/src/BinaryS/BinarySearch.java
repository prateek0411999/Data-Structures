package BinaryS;
import java.util.*;

public class BinarySearch {

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
		int start=0;
		int end=arr.length;
		while(start<end)
		{
			int mid=(start+end)/2;
			
			if(arr[mid]==num)
				return "found at index " + mid;
			
			else if(arr[mid]>num)
				end=mid-1;
			
			else if(arr[mid]<num)
				start=mid+1;
		}
		return "couldn't found the no";
	}

}