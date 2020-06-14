import java.util.Scanner;


public class MergeSort {

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
		
		mergesort(arr, 0, n-1);
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
	
	
		public static void mergesort(int arr[], int low, int high) {
		
		if(low<high) {
			
			int middle = (low+high)/2;
			mergesort(arr, low, middle);
			mergesort(arr, middle+1, high);
			merge(arr, low, middle, high);
			
		}
		
	}
		
		
		public static void merge(int arr[], int low, int middle, int high) {
			int i, j, k;
			int n1 = middle - low + 1;
			int n2 = high - middle;
			
			int L[] = new int[n1], R[] = new int [n2];
			
			for(i=0;i<n1;i++)
			{
				L[i] = arr[low + i];
			}
			
			for(j=0;j<n1;j++)
			{
				R[j] = arr[middle + 1 + j];
			}
			
			i=0;
			j=0;
			k=low ;
			
			while(i<n1 && j<n2)
			{
				if(L[i] <= R[j])
				{
					arr[k] = L[i];
					i++;
				}
				else
				{
					arr[k] = R[j];
					j++;
				}
				k++;
			}
			while(i<n1)
			{
				arr[k] = L[i];
				i++;
				k++;
			}
			while(j<n2)
			{
				arr[k] = R[j];
				j++;
				k++;
			}
	}

}