package com.split;


import java.util.EmptyStackException;


public class RPNClaculator {
	
	
	
	    int [] element;
	    int top;
	    
	    public RPNClaculator(int size)
	    {
	    	element=new int[size];
	    	
	    	
	    	top=-1;
	    	
	    	
	    }
	    
	    public RPNClaculator() {
		
		}

		public void push(double value)
	    {
	    	if(top==element.length-1)
	    	
	    	{
	    		throw new  EmptyStackException();
	    	}
	    	
	    	element[++top]=(int) value;
	    }
	    
	    public int pop()
	    {
	    	if(top==-1)
	    	{
	    		throw new EmptyStackException();
	    	}
	    	
	    return	element[top];
	    }
	    
	    boolean IsEmpty()
	    {
	    	return top==-1;
	    }
	    public int peek() {
	        if (top == -1) {
	          throw new EmptyStackException();
	        }
			return element[top];
	    }

	    
	    public void operationperformed(String operation)
	    {
	    	double a, b;
	    	switch(operation)
	    	{
	    	
	    	case "+":
	    		a=pop();
	    		b=pop();
	    		
	    		push(a+b);
	    		
	    		break;
	    		
               case "-":
                a=pop();
   	    		b=pop();
   	    		
   	    		push(a-b);
	    		
	    		break;
	    		
	    		
                    case "*":
                    a=pop();
      	    		b=pop();
      	    		
      	    		push(a*b);
   	    		
   	    		break;
   	    		
   	    		
                 case "/":
                        a=pop();
        	    		b=pop();
        	    		
        	    		push(a/b);
     	    		
     	    		break;
     	    		
     	    		default:
     	    			
     	    			throw new IllegalArgumentException("Unknown operation:"+operation);
	    	
	    	}
	    }
	    
	    
	    
	    
	public static void main(String[] args) {
		RPNClaculator rpn=new RPNClaculator();
		
		rpn.push(126);
		rpn.push(166);
	
		
		System.out.println("Is empty    :"+rpn.IsEmpty());

		
		
		rpn.operationperformed("+");
		System.out.println();
		System.out.println("Addition:"+rpn.pop());
	
		
	
	}

}
