//BINARY TREE using Linkedlist  and Its Varioous Traversals (PRE,POST,IN,LEVEL)-ORDER 
// For Better Understanding -- below comments will help :
  
// I Make 4 classes
// 1. public class BT - for main()
// 2. class Node - Using singly LinkedList-- for Queue Node-
// 3. class Queue - using  Singly linkedlist for queue - FUNCTIONS-(enqueue(),dequeue(),isEmpty(),print())
// 4. class BinaryTree - for Making Tree - FUNCTIONS-(create(),preOrder(),postOrder(),levelOrder())

import java.util.*;
import java.lang.*;

class BinaryTree
{
int data;
BinaryTree l;
BinaryTree r;

 BinaryTree()
 {
  l=null;
  r=null;
 }
 Scanner sc=new Scanner(System.in);
 Queue q =new Queue();
 BinaryTree create()
 {
	 
	 BinaryTree root=new BinaryTree();
	 System.out.println("Enter the Node value");
	 root.data=sc.nextInt();
	 q.enqueue(root);
	
	 while(!q.isEmpty())
	 {
		 BinaryTree p =q.dequeue();
		 System.out.println("Enter LEFT CHILD value of "+p.data+"    --OR--   0 for NO CHILD : ");
		 int x=sc.nextInt();
		 if(x!= 0)
		 {
		  BinaryTree lc =new BinaryTree();
		  lc.data=x;
		  p.l=lc;
		  q.enqueue(lc);		 
		 }
		 
		  System.out.println("Enter RIGHT CHILD value "+p.data+"    --OR--   0 for NO CHILD : ");
		 int y=sc.nextInt();
		 if(y!=0)
		 {
		  BinaryTree rc =new BinaryTree();
		  rc.data=y;
		  p.r=rc;
		  q.enqueue(rc);		 
		 }
		
	 }
	 return root;
 }
 
 void preOrder(BinaryTree root)
 {
	 BinaryTree p=root;
	 if(p!=null){
   System.out.print(" "+p.data);
   preOrder(p.l);
   preOrder(p.r);
	 }
 }
 
 void inOrder(BinaryTree root)
 {
	 BinaryTree p=root;
	 if(p!=null){
      inOrder(p.l);    
	  System.out.print(" "+p.data);
      inOrder(p.r);
	 }
 }
 
 
 void postOrder(BinaryTree root)
 {
	 BinaryTree p=root;
	 if(p!=null){
   
    postOrder(p.l);
    postOrder(p.r);
    System.out.print(" "+p.data);

	 }
 }
 
 void levelOrder(BinaryTree root)
 {
  Queue ql=new Queue();
  BinaryTree p=root;
  System.out.print(" "+p.data);
  ql.enqueue(p);
  while(!ql.isEmpty())
  {
	  root = ql.dequeue();
	  if(root.l != null)
	  {
		  System.out.print(" "+root.l.data);
		  ql.enqueue(root.l);
	  }
	  
	  if(root.r != null)
	  {
		  System.out.print(" "+root.r.data);
		  ql.enqueue(root.r);
	  }
 
 }
 }
 
 
}
		 
		 
	 
 	 

public class BT
{
	public static void main(String[] args)
	{
		BinaryTree bt = new BinaryTree();
		BinaryTree r= bt.create();
		System.out.print("PREORDER   = ");
		bt.preOrder(r);
		System.out.println();
		System.out.print("INORDER    = ");
		bt.inOrder(r);
		System.out.println();
		System.out.print("POSTORDER  = ");
		bt.postOrder(r);
		System.out.println();
		System.out.print("LEVELORDER = ");
		bt.levelOrder(r);
		System.out.println();
		
	}
}
	
class Node
{
  BinaryTree data;
Node next;
 Node(BinaryTree x)
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

void enqueue(BinaryTree x)
{
	Node newnode =new Node(x);
	if(front==null)
	front=rear=newnode;
	
	else
	{
	    rear.next=newnode;
	    rear=newnode;
    }
}

BinaryTree dequeue()
{
	
	BinaryTree x=null;
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

boolean isEmpty()
{
	return front==null;
}
}	
	
		

