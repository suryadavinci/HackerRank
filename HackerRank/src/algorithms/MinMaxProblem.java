package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxProblem {
	
	
	
	
	static long[] array;
	
	
	
	
	public static void main(String[] arg)
	{
		
		
		 Scanner in = new Scanner(System.in);
	        long a = in.nextLong();
	        long b = in.nextLong();
	        long c = in.nextLong();
	        long d = in.nextLong();
	        long e = in.nextLong();
	        
	        long minSum=0;
	        long maxSum=0;
	        
	         array= new long[5];
	        
	        array[0]=a;
	        array[1]=b;
	        array[2]=c;
	        array[3]=d;
	        array[4]=e;
	        
	        sort();
	        printArray();
		
	}

	public static void sort()
	{
		long temp=0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;i++)
			{
				if(array[i]>array[j])
				{
					
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					break;
				}
			}
		}
		
		
		
	}
	
	
	public static void printArray()
	{
		
		for(long i:array)
		System.out.print(i+" ");
	}
	
	
	
	
	
}
