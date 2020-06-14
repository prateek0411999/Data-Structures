import java.util.Scanner;


public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of values you want to enter");
		int n = sc.nextInt();
		int arr[] = new int [n];
		
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		sort(arr);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static int[] sort(int arr[])
	{
		int temp,j;
		for(int i=1;i<arr.length;i++)
		{
			temp = arr[i];
			j = i-1;
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = temp;
		}
		return arr;
	}

}