package algorithms.implementation;

import java.util.Scanner;

public class AppleAndOrange {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		
		int s=scan.nextInt();
		int t=scan.nextInt();
		int a=scan.nextInt();
		int b=scan.nextInt();
		int m=scan.nextInt();
		int n=scan.nextInt();
		
		long[] ap= new long[m];
		long[] or= new long[n];
		
		long apple=0, orange=0;
		
		for(int i=0;i<m;i++)
			{
				ap[i]=scan.nextLong();
				if(a+ap[i]>=s && a+ap[i]<=t)
					apple++;
			}
		
		for(int j=0;j<n;j++)
			{
				
				or[j]=scan.nextLong();
				if(b+or[j]>=s && b+or[j]<=t)
					orange++;
				
			}
		
		System.out.println(apple);
		System.out.println(orange);
		
		
		
	}

}
