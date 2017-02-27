package algorithms.dynamic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;


public class Equal {

	static int[] a;
	static int sHigh;
	static int tHigh;
	static int count;
	
	static TreeSet<Integer> set= new TreeSet<Integer>();
	public static void main(String[] args) {
		
		
		a= new int[]{1,3,5,7,9};
		
		System.out.println(Arrays.toString(a));
		//System.out.println(getNthLargest(2));
		
		getEqual();
		
		
	}
	
	public static void getEqual(){
		
		
		
		//System.out.println("??? "+Arrays.toString(a));

		sHigh=getNthLargest(2);
		//System.out.println(sHigh);
		try{
			tHigh=getNthLargest(3);
		}catch(NoSuchElementException n){
			count++;
			System.out.println(count);
			return;
		}
		//System.out.println("2nd highest is "+sHigh+" third highest is "+tHigh);
		int sum=sHigh-tHigh;
		for(int i=0;i<a.length;i++){
			if(a[i]!=sHigh)
				a[i]=a[i]+sum;
		}
		count++;
		System.out.println("what up??? "+Arrays.toString(a));
		
		getEqual();
	}
	
	
	public static int getNthLargest(int n){
		
		set.removeAll(set);
		
		for(int i=0; i<a.length;i++)
		set.add(a[i]);
		
		Iterator<Integer> i=set.descendingIterator();
		int j=1;
		while( j<n){
			i.next();
			j++;
		}
		
		
		return i.next();
	}
	
	
	
}
