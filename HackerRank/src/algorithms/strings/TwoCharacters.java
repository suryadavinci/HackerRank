package algorithms.strings;

import java.util.HashSet;

public class TwoCharacters {
	static HashSet<Character> visited= new HashSet<Character>();
	public static void main(String[] args) {
		String s="abcabcabc";
		
		System.out.println(s);
		for(int i=0;i<s.length();i++){
			System.out.println(s.charAt(i));
			if(!visited.contains(s.charAt(i))){
				System.out.println("Replacing all "+s.substring(i,i+1));
				System.out.println(testTString(s.replace(s.subSequence(i, i+1), "")));
				visited.add(s.charAt(i));
			}
			
		}
		
		
	}
	
	
	
	public static boolean testTString(String t){
		
		System.out.println(t);
		char one=t.charAt(0);
		char two=t.charAt(1);
		if(one==two)
			return false;
		
		for(int i=0;i<t.length();i+=2){
			if(t.charAt(i)!=one || t.charAt(i+1)!=two)
				return false;
		}
		
		return true;
	}
}
