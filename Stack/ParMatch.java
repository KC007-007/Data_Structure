import java.util.*;
import java.lang.*;

public class ParMatch
{
	
public static void main(String[] args)
{
	Scanner sc =new Scanner(System.in);
	System.out.println("enter sequesnce of parenthesis or brackets : ");
	String s =sc.nextLine();
	String str=checkMatch(s);
	System.out.println(str);
	
}

 public static String checkMatch(String s)
 {
 
 
     Deque<Character> dq =new ArrayDeque<Character>();
      char c;
  
       for(int i=0;i<s.length();i++)
         {
           char x=s.charAt(i);
           if(x=='[' || x=='{' || x=='(')
            {
              dq.push(x);
              continue;
            }
      
           boolean b=dq.isEmpty();
           if(b==true)
            return "NOT MATCHED : Less Opening Brackets  OR  Closing Bracket Came Before  OR  May Be Wrong Input ";
		   

           switch(x)
            {
              case ')' :  c=dq.peek();
                          if(c=='{' || c=='[' )
                             return "NOT MATCHED : Sequece of opening & closing Not Matched ";
                          else
                             dq.pop();
                          break;
    
    
              case '}' :  c=dq.peek();
                          if(c=='[' || c=='(' )
                             return "NOT MATCHED : Sequece of opening & closing Not Matched";
                          else
                             dq.pop();
                          break;
    
    
              case ']' :  c=dq.peek();
                          if(c=='{' || c=='(' )
                             return "NOT MATCHED : Sequece of opening & closing Not Matched";
                          else
                             dq.pop();
                          break;
            }  
        }
   
         boolean bb=dq.isEmpty();
         if(bb==true)
          return  " Successfull Match of Brackets";
		 
         else
   		  return "NOT MATCHED : Opening braackets Left in Stack";
           
		 		   
    
		
	
    }
	


}
 
