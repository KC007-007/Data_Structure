package sorting;

import java.util.Scanner;

public class Insertion
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Fun f=new Fun();
		System.out.println("Enter The Size Of Array : ");
		int s=sc.nextInt();
		int[] a=new int[s];
		System.out.println("enter " +s+" element in array :");
		for(int i=0;i<s;i++)
			a[i]=sc.nextInt();
		System.out.println("enter : 0 for ascending order OR  enter : 1 for decending order ");
		int asc=sc.nextInt();
		f.insertionsort(a,s,asc);
		 System.out.println("Sorted array : ");
		   for(int i=0;i<s;i++)
			   System.out.println(a[i]);


	}

}

class Fun
{
	void insertionsort(int[] a,int size,int asc)
	{
		if(asc==0)
		{
		for(int i=0;i<size;i++)
		{
			ascendingInsert(a,i,a[i]);
		}
		}
		
		if(asc==1)
		{
			for(int i=0;i<size;i++)
			{
				decendingInsert(a,i,a[i]);
			}
			
		}
	}
	
	void ascendingInsert(int[] a,int size,int element)
	{
		int i=0;
		for( i=size-1;i>=0;i--)
		{
			if(element < a[i])
				a[i+1]=a[i];
			else
				break;
		}
		a[i+1]=element;
	}
	
	void decendingInsert(int[] a,int size,int element)
	{
		int i=0;
		for( i=size-1;i>=0;i--)
		{
			if(element > a[i])
				a[i+1]=a[i];
			else
				break;
		}
		a[i+1]=element;
	}
	
	
	
	
	
	
	
}



