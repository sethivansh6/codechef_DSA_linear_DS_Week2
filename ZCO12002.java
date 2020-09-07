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
		int v=sc.nextInt();
		int w=sc.nextInt();
		
		Value ar[]=new Value[n];
		for(int i=0;i<n;i++)
		{
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    ar[i]=new Value(a,b);
		}
		
		int start[]=new int[v];
		for(int i=0;i<v;i++)
		{
		    start[i]=sc.nextInt();
		}
		int end[]=new int[w];
		for(int i=0;i<w;i++)
		{
		    end[i]=sc.nextInt();
		}
		
		Arrays.sort(start);
		Arrays.sort(end);
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
		    int left=findStartTime(start,ar[i].a);
		    int right = findEndTime(end,ar[i].b);
		    if(left!=-1 && right != -1)
				min = Math.min(right-left+1, min);
		}
		
		System.out.println(min);
		
	}
	
static int findStartTime(int arr[], int e) {
		if(e < arr[0]) {
			return -1;
		}
		int idx = Arrays.binarySearch(arr, e);
		if(idx < 0) {
			idx = (-idx - 1) - 1; 
		}
		return arr[idx];
	}
	static int findEndTime(int arr[], int e) {
		if(e > arr[arr.length-1]) {
			return -1;
		}
		int idx = Arrays.binarySearch(arr, e);
		if(idx < 0) {
			idx = -idx - 1;
		}
		return arr[idx];
	}
	
}
class Value
	{
	    int a;
	    int b;
	    public Value(int a,int b)
	    {
	        this.a=a;
	        this.b=b;
	    }
	}
