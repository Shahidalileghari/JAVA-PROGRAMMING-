package com.split;





public class Stacks1 {
	
	int arr[];
	
	int top;
	
	int capacity;
	
	Stacks1(int data)
	{
		
		arr=new int[data];
		
		capacity=data;
		
		top=-1;
	}
	
	public void push(int x)
	{
	if(isFull())
	{
		
		System.out.println("Stack overflow");
		
		System.exit(1);
		
	}
	
	else {
		System.out.print(x+" ");
		arr[++top]=x;
	}
	
	
	
	}
	
	public boolean isFull()
	{
		return top==capacity-1;
	}
	
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	
    public void print()
    {
    	for(int i=0;i<=top;i++)
    	{
    		System.out.print(arr[i]+" ");
    	}
    }
    
    public int getsize()
    {
    	return top+1;
    }
    
    public int pop()
    {
    	if(isEmpty())
    	{
    		System.out.println("Stack is full");
    		
    		System.exit(1);
    	}
    	
    	
			return arr[top--];	
    	
    }
    
    public void firstelement() {
    	if (isFull()){
    		for(int i=top; i>=0; i--) {
    			if (i==0) {
    				System.out.println("First element:"+arr[i]);
					
				}
    							    			
    		}
    		
    	}
    	else {
    			System.out.println("List is Empty");
    			}
				
			}
    
      
  
	public static void main(String args[])   
	{  
 
	Stacks1 stk=new Stacks1(6); 
	System.out.println("Pushing element");
	stk.push(1);
	stk.push(4);
	stk.push(34);
	stk.push(34);
	stk.push(34);
	stk.push(34);
	
	
//	stk.print();
//	System.out.println();
//	System.out.println("Full :"+stk.isFull());
//	System.out.println("Empty:"+stk.isEmpty());
//	  System.out.println("Pop (Deleting):"+stk.pop());
//	  stk.print();
//	  
	  System.out.println();
	  stk.firstelement();
	}

}
