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
		int[] y = new int[100005];
		int[] left = new int[100005];
		int[] right = new int[100005];
		
		Arrays.fill(y, 500);
		Arrays.fill(right, 100000);
		y[0] = 0;
		y[100000] = 0;
		
		while(n-- > 0){
			int xco = sc.nextInt();
			int yco = sc.nextInt();
			y[xco] = Math.min(y[xco], yco);
		}
		
		//smallest element on the left 
		Stack<Integer> st=new Stack<Integer>();
		
		for(int i=0;i <= 100000; i++)
		{
		    while(!st.isEmpty() && y[st.peek()]>=y[i])
		    {
		        st.pop();
		    }
		    if(st.isEmpty())
		    {
		        //no smallest
		        left[i]=0;
		    }
		    else
		    {
		        left[i]=st.peek();
		    }
		    
		    if(y[i]!=500)
		    {
		        st.push(i);
		    }
		}
		
		st.clear();
		
		for (int i = 100000; i >= 0; i--) {
		    
		    while(!st.isEmpty() && y[st.peek()]>y[i])
		    {
		        st.pop();
		    }
		    if(st.isEmpty())
		    {
		        //no smallest
		        right[i]=100000;
		    }
		    else
		    {
		        right[i]=st.peek();
		    }
		    
		    if(y[i]!=500)
		    {
		        st.push(i);
		    }
		}
		long maxArea = 1L;
		long temp = 0;

		for (int i = 0; i <= 100000; i++) {
			temp = y[i] * (right[i] - left[i]);
			maxArea = Math.max(maxArea, temp);
		}
		System.out.println(maxArea);
		    
	}
}
