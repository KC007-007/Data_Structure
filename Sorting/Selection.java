package sorting;
import java.util.*;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Function f=new Function();
		System.out.println("Enter The Size Of Array : ");
		int s=sc.nextInt();
		int[] a=new int[s];
		System.out.println("enter " +s+" element in array :");
		for(int i=0;i<s;i++)
			a[i]=sc.nextInt();
		System.out.println("enter : 0 for ascending order OR  enter : 1 for decending order ");
		int asc=sc.nextInt();
		f.selectionsort(a,s,asc);
		 System.out.println("Sorted array : ");
		   for(int i=0;i<s;i++)
			   System.out.println(a[i]);

	}

}

class Function
{
	void selectionsort(int[] a, int size, int asc)
	{  
		if(asc==0)
		{
		int minPosElement=0;
		for(int i=0;i<size;i++)
		{
			minPosElement=minPos(a,i,size);
			swap(a,i,minPosElement);
		}
		}
		
		if(asc==1)
		{
			int maxPosElement=0;
			for(int i=0;i<size;i++)
			{
				maxPosElement=maxPos(a,i,size);
				swap(a,i,maxPosElement);
			}
			
		}
			
		
	}
	
	int minPos(int[] a,int start,int stop) 
	{
		int minPos=start;
		int minElement=a[start];
		for(int i=start+1 ;i<stop ;++i)
		{
			if(a[i] < minElement)
			{
				minElement=a[i];
				minPos=i;
			}
		}
		return minPos;
		
	}
	
	int maxPos(int[] a,int start,int stop) 
	{
		int maxPos=start;
		int maxElement=a[start];
		for(int i=start+1 ;i<stop ;++i)
		{
			if(a[i] > maxElement)
			{
				maxElement=a[i];
				maxPos=i;
			}
		}
		return maxPos;
	}
	
	void swap(int arr [],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	
	
	
	
	
}