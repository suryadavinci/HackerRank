package algorithms.strings;

import java.util.Scanner;

public class SuperReducedString {

	public static void main(String[] args) {


		String s= new Scanner(System.in).next();
		//String s="abcccdaaa";
		
		int i=0;
		while(i<s.length()-1){
			if(s.charAt(i)==s.charAt(i+1))
				{
					s=s.substring(0,i)+s.substring(i+2);
				}
			else
				i++;
		}
		if(s.length()==0)
			{
				System.out.println("Empty String");
				return;
			}
		System.out.println(s);
		
	}

}
