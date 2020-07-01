package linkedlist;
import java.util.*;
import java.lang.*;


public class Ll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist l =new Linkedlist();
		Node head=null;		
		Scanner sc = new Scanner(System.in);
		Node h;
		
		
		
		
		 System.out.println("press 1 : for check list is empty or not??");
		 System.out.println("press 2 : make a list");
		 System.out.println("press 3 : for size of linkedlist ");
		 System.out.println("press 4 : insert a node ");
		 System.out.println("press 5 : for delete a node");
		 System.out.println("press 6 : for search a node");
		 System.out.println("press 7 : for middle node ");
		 System.out.println("press 8 : for print the list");
		 System.out.println("press 9 : for remove the duplicate element from the list");
		 System.out.println("press 0 : for exit");


		while(true)
		{
		 System.out.println("enter your choice for operation :");	
		 int n =  sc.nextInt();
		 switch(n)
		 {
		 case 1 : boolean b=l.isEmpty(head);
		          if(b==true)
		        	  System.out.println("list is empty");
		          else
		        	  System.out.println("list is not empty");
		          break;
		          
		 case 2 :   h=l.add(head);	
		           head=h;
		           break;
		           
		 case 3 : int x=l.size(head);
		          System.out.println("size of list is :"+x);
		          break;
		          
		 case 4 :  h= l.insert(head); 
		           head=h;
		           break;
		           
		 case 5 : Node d=l.del(head);
		           head=d;
		           break;
		           
		 case 6 :  System.out.println(" Enter the value which u want to search");
		           int v=sc.nextInt();
		           l.search(head, v);
		           break;
		           
		 case 7 :  l.mid(head);  
		           break;
		        
		 case 8 : l.print(head); 
		          break;
		          
		 case 9 : h= l.sortedDelDup(head);
		          head =h;
		          break;
		          
		          
		 case 0 : System.out.println("Program has exit | For Execution : RUN the code again");
			      System.exit(0);          
		         
		 }
		}
		 
		 
				
	
		

	}

}

class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data=data;
		next=null;
	}
}



class Linkedlist
{
	
	boolean isEmpty(Node head)
	{
		
		return (head==null);
	}
	
	
	 Node add(Node head)
	 {
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter the size of linked list");	
		 int s= sc.nextInt();
		
		 System.out.println("enter the " +s+" element");
		
		 for(int i=0;i<s;i++)
			{
			 if(head==null)
				{
					head=new Node(sc.nextInt());
				}
				else
				{
					Node p=head;
					Node newnode=new Node(sc.nextInt());
					while(p.next!=null)
					p=p.next;
					 
					p.next=newnode;
				}		
				
			}
		 return head;
		 
	 }
	
	Node insert(Node head)
	{
		Scanner sc=new Scanner(System.in);
		Node p=head;
		Linkedlist l=new Linkedlist();
		int x=l.size(head);
		System.out.println("size of list :"+x);
		System.out.println("enter the data which want to insert");
		Node newnode=new Node(sc.nextInt());
		System.out.println(" enter a position from 1 to (size+1)");
		int location =sc.nextInt();
		if(location ==1)
		{
			p=newnode;
			p.next=head;
			head=p;
			return head;
		}
		else
		{
		
		for(int i=1;i<location-1;i++)
		{
			p=p.next;
		}
		newnode.next=p.next;
		p.next=newnode;
		
		return head;
		}
		
	}
	
	Node del(Node head)
	{
		Node p=head;
		Node temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the location at which data to be delete");
		int location=sc.nextInt();
		for(int i=1;i<location-1;i++)
		{
			
			p=p.next;
		}
		temp=p.next;
		p.next=temp.next;
		temp=null;
		
		
		return head;
	}
	void print(Node head)
	{
		Node p=head;
		while(p!=null)
		{
			System.out.println(p.data);
			p=p.next;
		}
	}
	
	void mid(Node head)
	{
		Node p=head;
		Node q=head;
		while(q!=null && q.next!=null)
		{
			p=p.next;
			q=q.next.next;
		}
		System.out.println("mid value is "+" "+p.data);
	}
	 
	int size(Node head)
	 {
		 Node p=head;
		 int c=0;
		 while(p!=null)
		 {
			 p=p.next;
			 c++;
		 }
		return c;
	 }
	 
	void search(Node head,int val)
	{
		Node p=head;
		boolean b=false;
		while(p!=null)
		{
			if(p.data == val)				
			    b=true;			
			p=p.next;	
							
		}
		if(b==true)
			System.out.println("value found");
		else
			System.out.println("value not found");
		
	}
	
	
	Node sortedDelDup(Node head)
	{
		Node p=head;
		Node q;
		while(p!=null && p.next!= null)
		{
			if(p.data == p.next.data)
			{
				q=p.next.next;
				if(q==null)
				{
					p.next=null;
					break;
				}
				p.next=q;
				
			}
			if(p.data != p.next.data )
				p=p.next;
				
		}
		
	  return head; 
	}
	
	
	
}

