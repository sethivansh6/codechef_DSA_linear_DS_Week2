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
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    ar[i]=sc.nextInt();
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		Stack<Integer> stk=new Stack<Integer>();
		int depth=0,start=0;int max_depth=0,max_length=0,length=0,pos=0;
		for(int i=0;i<n;i++)
		{
		    if(ar[i]==1)
		    {
		        depth++;
		        length++;
		    }
		    else
		    {
		        depth--;
		        length++;
		    }
		    if(depth==0)
		    {
		        if(max_length<length)
		        {
		            max_length=length;
		            pos=i-length+2;
		        }
		       length=0;
		    }

		   
		   if(depth>max_depth)
		   {
		       max_depth=depth;
		       start = i+1;
		   }
		}
		System.out.println(max_depth +" "+start+" "+max_length+" "+pos);
	}
}
