import java.util.*;
import java.lang.*;


class Node
{
  int data;
Node next;
 Node(int x)
 {
 data=x;
 next=null;
 }
}
 
 

class Queue
{

Node front;
Node rear;

Queue()
{
	front=null;
	rear=null;
}

void enqueue(int x)
{
	Node newnode =new Node(x);
	if(rear==null)
	front=rear=newnode;
	
	else
	{
	    rear.next=newnode;
	    rear=newnode;
    }
}

int dequeue()
{
	
	int x=-1;
	if(front==null)
		System.out.println(" Empty Queue ");
		
	else
	{
		Node p =front;
		x=p.data;
		front=p.next;
		p.next=null;
	}
	return x;
}
void print()
{
	Node p=front;
	if(front == null)
		System.out.println("Empty Queue ");
	
	else{	
	while(p!=null)
	{
		System.out.println(p.data);
		p=p.next;
	}
	}

}
}

public class QueueLl
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		Queue q =new Queue();
		System.out.println("enter 5 values ");
		for(int i=0;i<5;i++)
 			q.enqueue(sc.nextInt());
         System.out.println("Values in queue :");
		q.print();
		System.out.println("Now time for delete element from deque ");
		for(int i=0;i<3;i++)
		{
			int d=q.dequeue();
		System.out.println(d);
		}
		System.out.println("Now Queue has :");
		q.print();
	}


}
