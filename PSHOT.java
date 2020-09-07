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
		    
		    int a=0,b=0;
		    int shots=2*n;int j=0;
		    int shot=n;
		    
		    int i=1;
		    
		    for(i=1;i<=shots;i++)
		    {   
		        if(ch[i-1]=='1' && i%2!=0)
		        {
		            a++;
		        }
		        if(ch[i-1]=='1' && i%2==0)
		        {
		            b++;
		        }
		        
		        int left = i%2==0 ? shot-i/2 : a>b ? shot-i/2 : shot-i/2-1;
		        
		        int diff=(int)Math.abs(a-b);
		        if(diff>left)
		        {
		            break;
		        }
		    }
		    
		    int ans=j*2;
		    System.out.println( i >(2*shot) ? (2*shot) : i);
		    
		}
	}
}
