package datastructures.stack;

import java.util.Scanner;

import java.util.*;

public class Stack<E> {


    int top=-1;
    E[] stack ;
    
    
    Stack(int size){
    	this.stack= (E[]) new Object[size];
        }
    
    
    


    public static void main(String[] args) {
		Stack<Character> balancedBracket= new Stack<Character>(100000);

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            	
            balancedBracket.bracketOperations(s);

        }

	}
    
    public void  bracketOperations(String s){
    	int length=s.length();
    	Character c;
    	for(int i=0;i<length;i++){
    		
    		Character ithChar=s.charAt(i);
    		
    		
    		if(ithChar=='{' || ithChar=='[' || ithChar=='(' )
    		{
    			 c= s.charAt(i);
    			this.push((E) c);
    		}
    		else if(isEmpty())
    		{
    			System.out.println("NO");
				return;
    		}
    		else if(ithChar=='}' || ithChar==']' || ithChar==')' )
    		{
    			c=(Character)this.peek();
    			
    			if(ithChar=='}' && c!='{'){
    				System.out.println("NO");
    				return;
    			}
    			else if(ithChar==']' && c!='['){
    				System.out.println("NO");
    				return;
    			}
    			else if(ithChar==')' && c!='('){
    				System.out.println("NO");
    				return;
    			}
    			
    			this.pop();
    				
    			
    		}
    		
    	}
    	System.out.println("YES");
    	
    	
    }
    
    public boolean isEmpty(){
    	if(this.top<0)
    		return true;
    	return false;
    }
    public static void maximumElement(){

    	Stack stac= new Stack(100000);   
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int oper=0;
        for(int i=0;i<n;i++)
            {
            oper=s.nextInt();
            
            if(oper==1)
                {
                stac.push((Integer)s.nextInt());
            }
            else if(oper==2)
                {
                stac.pop();
            }
            else if(oper==3)
                {
                stac.printMax();
            }
            
        }
    
    }
    
    void push(E value){
        this.stack[++top]= value;
    }
    
    
    E peek(){
    	if(top<0)
    		return null;
    	else
    		return this.stack[top];
    }
    
    void pop(){
        if(top<0)
            return;
        this.stack[top]=null;
        top--;
    }
     
    void printMax(){
    	//System.out.println(this.stack);
    	if(this.stack[0] instanceof Integer){
        Integer max=0;
        for(int i=0;i<=top;i++)
            {
            if(max<(Integer)stack[i])
                max=(Integer)stack[i];
        }
        
        System.out.println(max);
        }
    }
    
    
}
