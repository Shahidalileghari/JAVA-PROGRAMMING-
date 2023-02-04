package com.split;

public class Stack4 {
	
	int arr[];
	
	int capacity;
	
	int top;
	
	
	// create a method to initialize stack
	
	
	public Stack4(int size)
	{
		 arr=new int[size];
		 
		 capacity=size;
		 
		 top=-1;
	}
	public void push(int x)
	{
		if(isfull())
		{
			System.out.println("Stack is full");
		}
		
		else {
			arr=new int [x];
			
			
			arr[++top]=x;
			
			
		}
	}
     
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
		}
		
		else {
			System.out.println(arr[top--]);
		}
	}
	
	public void peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
		}
		
		else {
			
			System.out.println(arr[top]);
		}
		
	}
	
	public boolean isfull()
	{
		
		
		
		return  top==capacity-1;
	}
	
	public boolean isEmpty()
	{
		;
		
		return  top ==-1;
	}
	
	public static void main(String[] args) {
		Stack4 stack4=new Stack4(3);
		
		
		stack4.push(12);
		stack4.peek();
		
		stack4.pop();

	}

}
