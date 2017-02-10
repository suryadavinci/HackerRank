package datastructures.stack;

import java.util.Scanner;

public class Stack {


    int top=-1;
    int[] stack = new int[100000];
    
    public static void main(String arg[]){

    	Stack stac= new Stack();   
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int oper=0;
        for(int i=0;i<n;i++)
            {
            oper=s.nextInt();
            
            if(oper==1)
                {
                stac.push(s.nextInt());
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
    
    void push(int value){
        this.stack[++top]=value;
    }
    
    void pop(){
        if(top<0)
            return;
        this.stack[top]=0;
        top--;
    }
     
    void printMax(){
        int max=0;
        for(int i=0;i<=top;i++)
            {
            if(max<stack[i])
                max=stack[i];
        }
        
        System.out.println(max);
    }
    
    
}
