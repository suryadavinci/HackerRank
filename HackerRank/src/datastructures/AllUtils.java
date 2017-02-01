package datastructures;

import java.util.Arrays;

public class AllUtils {
	
	public static void main(String[] args) {
		
			
System.out.println(Arrays.toString(binaryString(3)));
			
		
	}
	
	


	
	public static String[] binaryString(int n)
	{
		
		
		
		String[] array= new String[(int) Math.pow(2, n)];

		for(int i=0;i<Math.pow(2, n);i++)
		{
			array[i]=String.format("%0"+n+"d",Integer.parseInt(Integer.toBinaryString(i)));
		}
		//System.out.println(String.format("%0"+n+"d",Integer.parseInt(Integer.toBinaryString(i))));
		return array;
		
		
		//return Integer.toBinaryString(n);
		
	}

}
