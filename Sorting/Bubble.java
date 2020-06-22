package sorting;
import java.util.*;

public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functions f =new Functions();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter "+n+" elements in array");
		for(int i=0;i<n;i++)
		  arr[i]=sc.nextInt();
		
		  f.bubbleSort(arr, n);
		  System.out.println("sorted array is :");
		  for(int i=0;i<n;i++)
			  System.out.println(arr[i]);
		
		

	}

}

class Functions
{
	void swap(int arr [],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	void compete(int arr[],int size)
	{
		int i=0;
		for(i=0;i<size-1;i++)
		{
			if(arr[i] > arr[i+1])
				swap(arr,i,i+1);
		}
	}
	
	void bubbleSort(int arr[],int size)
	{
		for(int i=0;i<size;i++)
			compete(arr,size-i);
	}
}
