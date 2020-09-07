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
		int n=sc.nextInt();
		int k=sc.nextInt();
		int ar[]=new int[n];
		int sen[]=new int[n];
		int h=n-1;
		long mod=1000000007;
		long ans=1;
		Stack<Integer> stk = new Stack<Integer>();
		Stack<Integer> ind = new Stack<Integer>();
		for(int i=0;i<n;i++)
		{
            ar[h]=sc.nextInt();
            h--;
		}
		
			Arrays.fill(sen,1);
		for(int i=0;i<n;i++)
		{
		    while(!stk.isEmpty() && stk.peek()>=ar[i])
		    {
		        stk.pop();
		        ind.pop();
		    }
		    
		    if(stk.isEmpty())
		    {
		        sen[i]=1;
		    }
		    else
		    {
		        sen[i]=i-ind.peek()+1;
		        
		    }
		    stk.push(ar[i]);
		    ind.push(i);
		}
	
		for(int a:sen)
		{
		    ans=(ans*a)%mod;
		}
		System.out.println(ans);
		
	
	}
}
