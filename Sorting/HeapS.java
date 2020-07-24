import java.util.*;

class Functions
{
	void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
     void heapSort(int arr[],int size)
	 {
		 for(int i=(size/2)-1 ; i>=0 ;i--)
         heapify(arr,size,i);
	   for(int i=size-1;i>0;i--)
	   {
		   swap(arr,0,i);
		   heapify(arr,i,0);
	   }
	 }	 
	
	
	
	void heapify(int arr[],int size,int index)
	{
		int left=2*index+1;
		int right=left+1;
		int max_index=index;
		if(left<size  && arr[max_index] < arr[left])
			max_index=left;
		if(right<size  && arr[max_index] < arr[right])
			max_index=right;
		if(max_index != index)
		{
			swap(arr,index,max_index);
			heapify(arr,size,max_index);
		}
	}
}
	
	public class HeapS
	{
		public static void main(String[] args)
		{
			
			Functions f =new Functions();
			Scanner sc =new Scanner(System.in);
			System.out.println(" Enter the size of array : ");
			int s=sc.nextInt();
			int[] arr = new int[s];
			System.out.println(" Enter "+s+" elements of array : ");
			 for(int i=0;i<s;i++)
				 arr[i]=sc.nextInt();
			 f.heapSort(arr,s);
			System.out.println(" sorted array : "); 
			 for(int i=0;i<s;i++)
				 System.out.println(arr[i]);
			 
				 
		}
	}






		