package algorithms.dynamic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
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
        
        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        int n;
        for(int i=0;i<t;i++){
            n=s.nextInt();
            a= new int[n];

            for(int j=0;j<n;j++){
                
                a[j]=s.nextInt();
                
                
            }
            count=0;
            		getEqual();

            
            
        }
        
		
	}
	
	
	public static void getEqual(int n){
		
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
		int sum=a[sHigh]-a[tHigh];
		for(int i=0;i<a.length;i++){
			if(i!=sHigh)
				a[i]=a[i]+sum;
		}
		count++;
		//System.out.println(Arrays.toString(a));
		
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
		int x=i.next();
		int k;
		for(k=0;k<a.length;k++)
			if(a[k]==x){
				break;
			}
		return k;
	}
	
	
	
}
