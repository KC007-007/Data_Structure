package stack;
import java.util.*;
public class StackLl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc=new Scanner(System.in);
	Stacks s=new Stacks();
	s.push(20);
	s.push(30);
	s.push(40);
	s.print();
	
	s.pop();
	s.pop();
	s.pop();
	
	
	s.print();
		
		

	}

}

class StackNode
{
	int data;
	StackNode next;
	
	StackNode(int x)
	{
		data=x;
		next=null;
		
	}
}
class Stacks
{
	StackNode top;
	
	Stacks()
	{
		top=null;
	}
	 
	
	void push(int x)
	{
		StackNode newnode= new StackNode(x);
		if(top==null)
		top=newnode;
		else {
		StackNode p=top;
		newnode.next=p;
		top=newnode;
		}
		
	}
	
	int pop()
	{
		if(top==null)
		{
			System.out.println("underflow");
			return 0;
		}
		     
		else
		{
			
		 StackNode p=top;
		 top=p.next;
		 p.next=null;
			return p.data ;	
			
		}
		
		    
	}
	
	boolean isEmpty()
	{
		return (top==null);
	}
	
	int peek(int position)
	{
		StackNode p=top;
		if(position==1)
			return p.data;
		else
		{
		for(int i=2 ; p!=null && i< position ;i++)
			p=p.next;
		return p.data;
		}
	}
	
	void print()
	{
		StackNode p=top;
		if(p==null)
			System.out.println("no element in stack");
		
			
		while(p!=null)
		{
			
			System.out.println(p.data);
			p=p.next;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}