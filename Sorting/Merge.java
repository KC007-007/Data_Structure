package sorting;
import java.util.*;

public class Merge {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		MergeFunctions f =new MergeFunctions();
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int[] arr =new int[n];
		System.out.println("enter "+n+" elements");
		for(int i=0;i<n;i++)
	      arr[i]=sc.nextInt();
		
        f.mergeSort(arr,n);
        for(int i=0;i<n;i++)
        System.out.println(arr[i]);

	}

}

class MergeFunctions
{
	void merge(int[] arr,int s1,int e1,int s2,int e2)
	{
		int i=s1;
		int j=s2;
		int k=0;
		int[] temp=new int[e2-s1+1];
		while(i<=e1 && j<=e2)
		{
			if(arr[i] < arr[j])
	           temp[k++]=arr[i++];
			else
				temp[k++]=arr[j++];
		}
		while(i<=e1)
			temp[k++]=arr[i++];
		while(j<=e2)
			temp[k++]=arr[j++];
		
		copy(arr,s1,e2,temp);		
		
	}
	
	void copy(int[] arr,int i,int j,int[] temp)
	{
		int k=0;
		while(i<=j)
			arr[i++]=temp[k++];
		
	}
	
	void mergeSortRecursive(int[] arr, int i, int j)
	{
		if(i>=j)
			return;
		int mid=(i+j)/2;
		mergeSortRecursive(arr,i,mid);
		mergeSortRecursive(arr,mid+1,j);
		merge(arr,i,mid,mid+1,j);
		
		
	}
	
	void mergeSort(int[] arr, int size)
	{
		mergeSortRecursive(arr,0,size-1);
	}
}
