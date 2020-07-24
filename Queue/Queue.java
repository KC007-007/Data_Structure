import java.util.*;
import java.lang.*;

 class Queues{
int size =1000;
int front;
int rear;
int[] arr = new int[size] ;

 Queues()
 {
	 front=-1;
	 rear=-1;
 }
 
 void enqueue(int x)
 {
	 if(rear==arr.length-1)
         System.out.print("Queue is full ");
	 else
		arr[++rear]=x;
	 
}

int dequeue()
{
	int x=-1;
	if(front == rear)
		System.out.println("Queue is empty ");
	else
	{	
	  
	  x=arr[++front];
	}
	return x;
}
void print()
{
	if(front == rear)
		System.out.println("Queue is empty ");
	else{
	for(int i=front+1;i<=rear;i++)
		System.out.println(arr[i]);
	}
}
}
public class Queue
{
	public static void main(String[] args)
	{
		Queues q =new Queues();
		q.enqueue(1);
		q.enqueue(11);
		q.enqueue(111);
        q.enqueue(1111);	
        q.enqueue(11111);
		q.print();
		
		System.out.println("Now we are going to delete queue ");
		
		while(q.front!=q.rear)
		{
			int d = q.dequeue();
			System.out.println(d);
				
			
		}
		q.print();
		
	}
}