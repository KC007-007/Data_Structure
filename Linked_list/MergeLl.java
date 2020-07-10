package linkedlist;
import java.util.*;

public class MergeLl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		Node head1=null;
		Functions f =new Functions();
		Node h=f.makeList(head1,1);
		head1=h;
		Node head2=null;
		Node h2=f.makeList(head2,2);
		head2=h2;
		Node sortHead=null;
		 sortHead=f.merge(head1, head2, sortHead);
		System.out.println("merge list: ");
		f.print(sortHead);
		
		

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
class Functions
{
	Node makeList(Node head,int index)
	{
		Scanner sc =new Scanner(System.in);
		 System.out.println("Enter the size of "+index+" linked list");	
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
	
	void print(Node head)
	{
		Node p=head;
		while(p!=null)
		{
			System.out.println(p.data);
			p=p.next;
		}
	}
	
	
	Node merge(Node head1, Node head2, Node sortHead)
	{
		Node newhead=null;
		if(head1 == null)
			return head2;
		if(head2 == null)
			return head1;
		if(head1 != null && head2 != null)
		{
			if(head1.data < head2.data)
			{
				sortHead=head1;
				head1=sortHead.next;
			}
			else
			{
				sortHead=head2;
				head2=sortHead.next;
			}
			
		}
		
		newhead=sortHead;
		while(head1 != null && head2 != null)
			
		{
			if(head1.data < head2.data)
			{
				sortHead.next=head1;
				sortHead=head1;
				head1=sortHead.next;
			}
			else
			{
				sortHead.next=head2;
				sortHead=head2;
				head2=sortHead.next;
				
			}
		}
		
		if(head1 == null)
			sortHead.next=head2;
		if(head2 ==null)
			sortHead.next=head1;
		
		
		return newhead;
				
	}
	
	
	
	
	
	
	
	
}