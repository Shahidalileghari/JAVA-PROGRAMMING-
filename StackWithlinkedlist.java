package com.split;





class Element{
	  int data;
	  Element next;
     }

  


public class StackWithlinkedlist {
	 private Element top;
	    private int nodesCount;
	 
	    public StackWithlinkedlist() {
	        this.top = null;
	        this.nodesCount = 0;
	    }
	 
	    
		public void push(int x)       
	    {
	        
	    	Element node = new Element();
	      if(node==null)
	      {
	    	  System.out.println("Overflow");
	      }
	        System.out.println("Inserting " + x);
	 
	       
	        node.data = x;
	 
	        
	        node.next = top;
	 
	      
	        top = node;
	 
	    
	        this.nodesCount += 1;
	    }
	    
	 
	   
	    public boolean isEmpty() {
	        return top == null;
	    }
	 
	  
	    public int peek()
	    {
	       
	        if (isEmpty()) {
	            System.out.println("The stack is empty");
	            System.exit(-1);
	        }
	        return top.data;
	    }
	 
	    
	    public int pop()       
	    {
	        
	        if (isEmpty())
	        {
	            System.out.println("Stack Underflow");
	            System.exit(-1);
	        }
	 
	       
	        int top = peek();
	 
	        System.out.println("Removing " + top);
	 
	       
	        this.nodesCount -= 1;
	 
	       
	        this.top = (this.top).next;
	 
	        return top;
	    }
	 
	    
	    public int size() {
	        return this.nodesCount;
	    }
	
	 
	
	
	
	public static void main(String[] args) {
		
		
		StackWithlinkedlist stak =new StackWithlinkedlist();
        stak.push(4);
        System.out.println(stak.pop());
//        stak.push(21);
//        stak.push(21);
//        stak.push(21);
//        stak.push(21);
//        stak.push(21);
//        stak.push(21);
         System.out.println( stak.peek());
         
         System.out.println(stak.nodesCount);
	}

}
