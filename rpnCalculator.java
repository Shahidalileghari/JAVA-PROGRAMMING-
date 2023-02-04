package com.split;

import java.util.EmptyStackException;




class rpn{
        	 int [] arr;
        	 int top;
        	 
        	 public rpn()
        	 {
        		 
        	 }
        	 
        	 public rpn(int size) {
        		 
        		 arr=new int [size];
        		 
        		 top=-1;
				// TODO Auto-generated constructor stub
			}
        	 
        	 public void push(int x)
        	 {
        		 if(top==arr.length-1) throw new EmptyStackException();
        		 
        		 
        		 arr[++top]=x;
        	 }
        	 
        	 public int pop()
        	 {
        		 if(top==-1)
        		 {
        			throw new EmptyStackException(); 
        		 }
        		 
        		return arr[top];
        	 }
        	 
        	 public int peek()
        	 {
        		 if(isEmpty())
        			 throw new EmptyStackException();
        		 
        		return arr[top--];
        	 }
        	 
        	 boolean isEmpty()
        	 {
        		 return top==-1;
        	 }
        	 
        	
        	 
        	 public void operationPerformed(String operation)
        	 {
        		 double a,b;
        		 
        		 switch(operation)
        		 {
        		 case "+":
        		 
        		 a=pop();
        		 b=pop();
        		 
        		 
        		 push((int) (a+b));
        		 break;
        		 
        		 case "-":
            		 
            		 a=pop();
            		 b=pop();
            		 
            		 
            		 push((int) (a-b));
            		 break;
            		 
        		 case "*":
            		 
            		 a=pop();
            		 b=pop();
            		 
            		 
            		 push((int) (a*b));
            		 break;
            		 
            		 default :
            			 throw new IllegalArgumentException();
        		 
        		 
        		 }
        	 }
         }
public class rpnCalculator {

	public static void main(String[] args) {
		
		rpn rpn=new rpn(4);
		
		rpn.push(12);
		rpn.push(45);
		
		System.out.println(rpn.isEmpty());
		
		rpn.operationPerformed("+");
		
		System.out.println(rpn.pop());

	}

}
