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
		    int k=sc.nextInt();
		    int ar[]=new int[n];
		    ArrayList<Integer> list = new ArrayList<Integer>();
		    for(int i=0;i<n;i++)
		    {
		        
		        ar[i]=sc.nextInt();
		        list.add(ar[i]);
		      //  System.out.println(ar[i]);
		    }
		    int var[]=new int[k+1];
		    int diff=k;
		    int max=1;
		    
		    for(int i=1;i<=k;i++)
		    {
		        int len=0;
		        for(int j=0;j<n;j++)
		        {
		          if(list.get(j)==i)
		          {
		              max=(int)Math.max(len,max);
		              len=0;
		          }
		          else
		          {
		              len++;
		          }
		        }
		        max=(int)Math.max(len,max);
		        if(max==n)
		        {
		            break;
		        }
		        
		    }
		    System.out.println(max);
		}
	}
}
