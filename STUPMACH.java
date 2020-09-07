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
		    int N=sc.nextInt();
		    int S[]=new int[N];
		    long token=0;
		    int min=0;
		    for(int i=0;i<N;i++)
		    {
		        S[i]=sc.nextInt();
		        if(i==0)
		        {
		            min=S[0];
		            token=token+min;
		        }
		        else
		        {
		            if(S[i]<min)
		            {
		               min=S[i];
		            token=token+min; 
		            }
		            else
		            token=token+min; 
		        }
		    }
		    
		    System.out.println(token);
		}
		
	}
}
