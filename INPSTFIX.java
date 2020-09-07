/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    String s=sc.next();
		    char ch[]=s.toCharArray();
		    Stack<Character> stk = new Stack<Character>();
		    int left=0;
		    String result="";
		    
		    for(int i=0;i<n;i++)
		    {
		        if(Character.isLetterOrDigit(ch[i]))
		        {
		            result+=ch[i];
		        }
		        else if(ch[i]=='(')
		        {
		            stk.push(ch[i]);
		        }
		        else if(ch[i]==')')
		        {
		            while(!stk.isEmpty() && stk.peek()!='(')
		            {
		                result+=stk.pop();
		            }
		            stk.pop();
		        }
		        //an operand
		        else
		        {
		            while(!stk.isEmpty() && Prec(ch[i])<=Prec(stk.peek()))
		            {
		                result+=stk.pop();
		            }
		            stk.push(ch[i]);
		        }
		        
		        
		    }
		    
		    // pop all the operators from the stack 
        while (!stk.isEmpty()){ 
    
            result += stk.pop();
         } 
         
         System.out.println(result);
		
		}
	}
	static int Prec(char ch) 
    { 
        switch (ch) 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
    } 
}
