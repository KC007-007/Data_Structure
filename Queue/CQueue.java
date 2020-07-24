import java.util.*;
import java.lang.*;

 class Queue{
int size =5;
int front;
int rear;
int[] arr = new int[size] ;

 Queue()
 {
	 front=0;
	 rear=0;
 }
 
 void enqueue(int x)
 {
	 if(((rear+1)%size) == front)
         System.out.println("Queue is full ");
	 else
	 {
		 rear=(rear+1)%size;
		 arr[rear]=x;
	 }
	 
}

int dequeue()
{
	int x=-1;
	if(front == rear)
		System.out.println("Queue is empty ");
	else
	{
      front =(front+1)%size;	  
	  x=arr[front];
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
public class CQueue
{
	public static void main(String[] args)
	{
		Queue q =new Queue();
		q.enqueue(1);
		q.enqueue(11);
		q.enqueue(111);
        q.enqueue(1111);	
        q.enqueue(11111);
		q.enqueue(111111);
		q.print();
		
		System.out.println("Now we are going to delete  all elements of queue ");
		
		while(q.front!=q.rear)
		{
			int d = q.dequeue();
			System.out.println(d);
				
			
		}
		q.print();
		
	}
}