package stack;
import java.util.*;

public class StackArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		Stack st=new Stack();
		System.out.println("How many values u want to enter the stack");
		int n=sc.nextInt();
		
		
		System.out.println("push the "+n+" value in stack ");
		for(int i=0;i<n;i++)
			st.push(sc.nextInt());
		int x=st.peek();
		System.out.println("peek value is = "+x);
		int p=st.pop();
		System.out.println("pop value is = "+p);
		 x=st.peek();
		System.out.println("peek value is = "+x);
		boolean b=st.isEmpty();
		System.out.println("empty?? = " + b);
		st.print();

	}

}

class Stack
{
	int size=1000;
	int top;
	int[] s=new int[size];
	
	Stack()
	{
	  top=-1;
	}
	
	boolean push(int x)
	{
		if(top>=size-1)
		{
		  System.out.println("Stack OverFlow");
		  return false;
		}
		  else
		{
			s[++top]=x;
			return true;
		}
		
	}
	
	int pop()
	{
		
		if(top<0)
		{
	     System.out.println("Stack Underflow");
	     return 0;
		}
		else
		{
			int x=s[top--];
			return x;
			
		}
	}
	
	int peek()
	{
		if(top<0)
		{
			System.out.println("Stack underflow");
			return 0;
		}
		else
		{
			int x=s[top];
			return x;
		}
	}
	
	boolean isEmpty()
	{
		
			return (top<0);
	}
	void print()
	{
		
		for(int i=top;i>-1;i--)
		System.out.println(s[top--]);
	}
	
	
	
	
	
	
	
}